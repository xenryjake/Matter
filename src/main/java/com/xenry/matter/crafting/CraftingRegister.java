package com.xenry.matter.crafting;

import com.xenry.matter.block.BlockRegister;
import com.xenry.matter.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public final class CraftingRegister {

    public static void registerRecipes(){

        // basic ruby item
        reg(BlockRegister.rubyBlock, "###", "###", "###", '#', ItemRegister.rubyItem);
        reg(new ItemStack(ItemRegister.rubyItem, 9), "#", '#', BlockRegister.rubyBlock);
        GameRegistry.addSmelting(BlockRegister.rubyOreBlock, new ItemStack(ItemRegister.rubyItem), 3.0F);

        // ruby sword/tools
        reg(ItemRegister.rubySwordItem, "#", "#", "I", '#', ItemRegister.rubyItem, 'I', Items.stick);
        reg(ItemRegister.rubyPickaxeItem, "###", " I ", " I ", '#', ItemRegister.rubyItem, 'I', Items.stick);
        reg(ItemRegister.rubyAxeItem, "##", "#I", " I", '#', ItemRegister.rubyItem, 'I', Items.stick);
        reg(ItemRegister.rubySpadeItem, "#", "I", "I", '#', ItemRegister.rubyItem, 'I', Items.stick);
        reg(ItemRegister.rubyHoeItem, "##", " I", " I", '#', ItemRegister.rubyItem, 'I', Items.stick);

        // ruby armor
        reg(ItemRegister.rubyHelmetItem, "###", "# #", '#', ItemRegister.rubyItem);
        reg(ItemRegister.rubyChestplateItem, "# #", "###", "###", '#', ItemRegister.rubyItem);
        reg(ItemRegister.rubyLeggingsItem, "###", "# #", "# #", '#', ItemRegister.rubyItem);
        reg(ItemRegister.rubyBootsItem, "# #", "# #", '#', ItemRegister.rubyItem);

        // emerald sword/tools
        reg(ItemRegister.emeraldSwordItem, "#", "#", "I", '#', Items.emerald, 'I', Items.stick);
        reg(ItemRegister.emeraldPickaxeItem, "###", " I ", " I ", '#', Items.emerald, 'I', Items.stick);
        reg(ItemRegister.emeraldAxeItem, "##", "#I", " I", '#', Items.emerald, 'I', Items.stick);
        reg(ItemRegister.emeraldSpadeItem, "#", "I", "I", '#', Items.emerald, 'I', Items.stick);
        reg(ItemRegister.emeraldHoeItem, "##", " I", " I", '#', Items.emerald, 'I', Items.stick);

        // emerald armor
        reg(ItemRegister.emeraldHelmetItem, "###", "# #", '#', Items.emerald);
        reg(ItemRegister.emeraldChestplateItem, "# #", "###", "###", '#', Items.emerald);
        reg(ItemRegister.emeraldLeggingsItem, "###", "# #", "# #", '#', Items.emerald);
        reg(ItemRegister.emeraldBootsItem, "# #", "# #", '#', Items.emerald);

        // iron nugget
        reg(new ItemStack(ItemRegister.ironNuggetItem, 9), "#", '#', Items.iron_ingot);
        reg(Items.iron_ingot, "###", "###", "###", '#', ItemRegister.ironNuggetItem);

        // carbon & diamond shard
        GameRegistry.addSmelting(Blocks.dirt, new ItemStack(ItemRegister.carbonBitItem), 0.2F);
        reg(new ItemStack(ItemRegister.carbonBitItem, 9), "#", '#', ItemRegister.carbonChunkItem);
        reg(ItemRegister.carbonChunkItem, "###", "###", "###", '#', ItemRegister.carbonBitItem);
        reg(new ItemStack(ItemRegister.carbonChunkItem, 9), "#", '#', BlockRegister.carbonBlock);
        reg(BlockRegister.carbonBlock, "###", "###", "###", '#', ItemRegister.carbonChunkItem);
        reg(new ItemStack(ItemRegister.carbonBitItem, 4), "#", '#', Items.coal);
        reg(Items.coal, "##", "##", '#', ItemRegister.carbonBitItem);
        reg(ItemRegister.diamondShardItem, "##", "##", '#', ItemRegister.carbonChunkItem);
        reg(Items.diamond, "###", "###", "###", '#', ItemRegister.diamondShardItem);
        reg(new ItemStack(ItemRegister.diamondShardItem, 9), "#", '#', Items.diamond);

        // compressed
        reg(new ItemStack(Blocks.cobblestone, 9), "#", '#', BlockRegister.compressedCobblestoneBlock);
        reg(BlockRegister.compressedCobblestoneBlock, "###", "###", "###", '#', Blocks.cobblestone);
        reg(new ItemStack(Blocks.dirt, 9), "#", '#', BlockRegister.compressedDirtBlock);
        reg(BlockRegister.compressedDirtBlock, "###", "###", "###", '#', Blocks.dirt);
        reg(new ItemStack(Blocks.gravel, 9), "#", '#', BlockRegister.compressedGravelBlock);
        reg(BlockRegister.compressedGravelBlock, "###", "###", "###", '#', Blocks.gravel);

    }

    public static void reg(ItemStack result, Object...shape){
        GameRegistry.addRecipe(result, shape);
    }

    public static void reg(Item result, Object...shape){
        reg(new ItemStack(result), shape);
    }

    public static void reg(Block result, Object...shape){
        reg(new ItemStack(result), shape);
    }

}
