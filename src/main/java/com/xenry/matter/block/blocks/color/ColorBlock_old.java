package com.xenry.matter.block.blocks.color;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

/**
 * Matter created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
@Deprecated
public class ColorBlock_old extends Block {

    public static final String name = "color_block";

    public static final PropertyEnum color = PropertyEnum.create("color", Color.class);

    public ColorBlock_old(){
        super(Material.cloth);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setHardness(0.8F);
        this.setStepSound(Block.soundTypeCloth);
        this.setDefaultState(this.blockState.getBaseState().withProperty(color, Color.WHITE));
    }

    public enum Color implements IStringSerializable {
        WHITE(0, "white");

        private int id;
        private String name;

        Color(int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getName();
        }

        public static Color getById(int id){
            for(Color c : Color.values())
                if(c.getId() == id) return c;
            return Color.WHITE;
        }

        public static Color getByName(String name){
            for(Color c : Color.values())
                if(c.getName().equalsIgnoreCase(name)) return c;
            return Color.WHITE;
        }

    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, color);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(color, Color.getById(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        Color c = (Color) state.getValue(color);
        return c.getId();
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @SuppressWarnings({"unchecked"})
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for(Color c : Color.values())
            list.add(new ItemStack(itemIn, 1, c.getId()));
    }

    public String getSpecialName(ItemStack stack) {
        return Color.getById(stack.getItemDamage()).getName();
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player) {
        return getPickBlock(target, world, pos);
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

}
