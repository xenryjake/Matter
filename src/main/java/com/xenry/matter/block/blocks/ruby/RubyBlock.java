package com.xenry.matter.block.blocks.ruby;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class RubyBlock extends Block {

    public static final String name = "ruby_block";

    public RubyBlock(){
        super(Material.iron);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(Block.soundTypeMetal);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
    }

}
