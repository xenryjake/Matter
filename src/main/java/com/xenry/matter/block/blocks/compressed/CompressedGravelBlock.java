package com.xenry.matter.block.blocks.compressed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Matter created by Henry Jake on April 23, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class CompressedGravelBlock extends BlockFalling {

    public static final String name = "compressed_gravel";

    public CompressedGravelBlock(){
        setUnlocalizedName(name);
        setHardness(0.9F);
        setHarvestLevel("shovel", 0);
        setStepSound(Block.soundTypeGravel);
    }

}
