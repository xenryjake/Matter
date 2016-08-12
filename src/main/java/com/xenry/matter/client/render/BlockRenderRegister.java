package com.xenry.matter.client.render;

import com.xenry.matter.Matter;
import com.xenry.matter.block.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedFlower;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public final class BlockRenderRegister {

    public static void preInit(){
        /*String[] colorBlockStates = new String[ColorBlock_old.Color.values().length];
        int i = 0;
        for(ColorBlock_old.Color c : ColorBlock_old.Color.values())
            colorBlockStates[i++] = "matter:color_block_" + c.getName();
        ModelBakery.addVariantName(Item.getItemFromBlock(BlockRegister.colorBlock), colorBlockStates);*/
    }

    public static void registerBlockRenderer(){
        registerBlock(BlockRegister.rubyBlock);
        registerBlock(BlockRegister.rubyOreBlock);
        registerBlock(BlockRegister.carbonBlock);
        registerBlock(BlockRegister.compressedCobblestoneBlock);
        registerBlock(BlockRegister.compressedDirtBlock);
        registerBlock(BlockRegister.compressedGravelBlock);
        //registerBlock(BlockRegister.colorBlock);
        /*for(ColorBlock_old.Color c : ColorBlock_old.Color.values())
            reg(BlockRegister.colorBlock, c.getId(), ColorBlock_old.name + "_" + c.getName());*/
    }

    private static void registerBlock(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Matter.MODID + ":" + block.getUnlocalizedName().substring(5)));
    }

    /*public static void reg(Block block, int meta, String file) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Matter.MODID + ":" + file, "inventory"));
    }*/

}
