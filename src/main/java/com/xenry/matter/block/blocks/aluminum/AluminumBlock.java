package com.xenry.matter.block.blocks.aluminum;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Matter created by Henry Jake on April 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class AluminumBlock extends Block {

    public static final String name = "aluminum_block";

    public AluminumBlock(){
        super(Material.iron);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
        setStepSound(Block.soundTypeMetal);
        setHardness(3.5F);
        setResistance(7F);
    }

}
