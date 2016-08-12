package com.xenry.matter.block.blocks.ruby;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class RubyOreBlock extends Block {

    public static final String name = "ruby_ore";

    public RubyOreBlock(){
        super(Material.rock);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(Block.soundTypeStone);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemRegister.rubyItem;
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return quantityDroppedWithBonus(fortune, random);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return random.nextInt(1 + fortune) + 1;
    }

    @Override
    public int quantityDropped(Random random){
        return 1;
    }

    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune) {
        Random random = world instanceof World ? ((World)world).rand : new Random();
        if(getItemDropped(world.getBlockState(pos), random, fortune) == Item.getItemFromBlock(this))
            return 0;
        return random.nextInt(5) + 3;
    }

}
