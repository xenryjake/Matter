package com.xenry.matter.client.render;

import com.xenry.matter.Matter;
import com.xenry.matter.item.ItemRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public final class ItemRenderRegister {

    public static void registerItemRenderer(){
        // ruby stuff
        registerItem(ItemRegister.rubyItem);
        registerItem(ItemRegister.rubySwordItem);
        registerItem(ItemRegister.rubyPickaxeItem);
        registerItem(ItemRegister.rubyAxeItem);
        registerItem(ItemRegister.rubySpadeItem);
        registerItem(ItemRegister.rubyHoeItem);
        registerItem(ItemRegister.rubyHelmetItem);
        registerItem(ItemRegister.rubyChestplateItem);
        registerItem(ItemRegister.rubyLeggingsItem);
        registerItem(ItemRegister.rubyBootsItem);

        // emerald stuff
        registerItem(ItemRegister.emeraldSwordItem);
        registerItem(ItemRegister.emeraldPickaxeItem);
        registerItem(ItemRegister.emeraldAxeItem);
        registerItem(ItemRegister.emeraldSpadeItem);
        registerItem(ItemRegister.emeraldHoeItem);
        registerItem(ItemRegister.emeraldHelmetItem);
        registerItem(ItemRegister.emeraldChestplateItem);
        registerItem(ItemRegister.emeraldLeggingsItem);
        registerItem(ItemRegister.emeraldBootsItem);

        // stuff
        registerItem(ItemRegister.ironNuggetItem);

        // carbon & diamond shard
        registerItem(ItemRegister.carbonBitItem);
        registerItem(ItemRegister.carbonChunkItem);
        registerItem(ItemRegister.diamondShardItem);
    }

    private static void registerItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Matter.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
