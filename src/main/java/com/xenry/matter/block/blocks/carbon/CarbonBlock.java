package com.xenry.matter.block.blocks.carbon;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Matter created by Henry Jake on February 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class CarbonBlock extends Block {

    public static final String name = "carbon_block";

    public CarbonBlock(){
        super(Material.ground);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("axe", 2);
        this.setStepSound(Block.soundTypeWood);
        this.setHardness(2.0F);
        this.setResistance(3.5F);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return quantityDropped(random);
    }

    @Override
    public int quantityDropped(Random random) {
        return 9;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return quantityDropped(random);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemRegister.carbonChunkItem;
    }
}
