package com.xenry.matter.proxy;

import com.google.common.eventbus.Subscribe;
import com.xenry.matter.client.bind.BasicKeybinds;
import com.xenry.matter.client.render.BlockRenderRegister;
import com.xenry.matter.client.render.ItemRenderRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class ClientProxy extends CommonProxy {

    public static BasicKeybinds basicKeybinds;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        super.init(event);
        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
        FMLCommonHandler.instance().bus().register((basicKeybinds = new BasicKeybinds()).init());
        FMLCommonHandler.instance().bus().register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @SubscribeEvent
    public void on(LivingSpawnEvent e){
        System.out.println("did");
        EntityLivingBase ent = e.entityLiving;
        if(!(ent instanceof EntityCreature)) return;
        Minecraft.getMinecraft().thePlayer.sendChatMessage(ent.getName());
    }

}
