package com.xenry.matter.block.blocks.compressed;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Matter created by Henry Jake on April 23, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class CompressedCobblestoneBlock extends Block {

    public static final String name = "compressed_cobblestone";

    public CompressedCobblestoneBlock(){
        super(Material.rock);
        setUnlocalizedName(name);
        setHardness(2.8F);
        setResistance(10.0F);
        setStepSound(Block.soundTypePiston);
        setCreativeTab(CreativeTabs.tabBlock);
    }

}
