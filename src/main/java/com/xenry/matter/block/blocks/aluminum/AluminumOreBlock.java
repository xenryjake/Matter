package com.xenry.matter.block.blocks.aluminum;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Matter created by Henry Jake on April 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class AluminumOreBlock extends Block {

    public static final String name = "aluminum_ore";

    public AluminumOreBlock(){
        super(Material.rock);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
        setStepSound(Block.soundTypeStone);
        setHardness(3F);
        setResistance(5F);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
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
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune) {
        Random random = world instanceof World ? ((World)world).rand : new Random();
        if(getItemDropped(world.getBlockState(pos), random, fortune) == Item.getItemFromBlock(this))
            return 0;
        return random.nextInt(4) + 2;
    }

}
