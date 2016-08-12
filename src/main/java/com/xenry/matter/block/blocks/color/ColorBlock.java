package com.xenry.matter.block.blocks.color;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

/**
 * Matter created by Henry Jake on December 21, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class ColorBlock extends Block {

    public static final String name = "color_block";

    public ColorBlock(){
        super(Material.cloth);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setStepSound(Block.soundTypeCloth);
        this.setHardness(0.8F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getBlockColor() {
        return 0x000000;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderColor(IBlockState state) {
        return this.getBlockColor();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
        //return 0xFFF000;
        return new Random().nextInt(0xFFFFFF);
    }

}
