package com.xenry.matter.proxy;

import com.xenry.matter.block.BlockRegister;
import com.xenry.matter.client.gui.BasicGui;
import com.xenry.matter.crafting.CraftingRegister;
import com.xenry.matter.item.ItemRegister;
import com.xenry.matter.world.GeneratorRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class CommonProxy implements IGuiHandler {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ItemRegister.registerItems();
        BlockRegister.registerBlocks();
        GameRegistry.registerWorldGenerator(new GeneratorRegister(), 0);
        CraftingRegister.registerRecipes();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == BasicGui.GUI_ID)
            return new BasicGui();
        return null;
    }

}
