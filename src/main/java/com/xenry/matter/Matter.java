package com.xenry.matter;

import com.xenry.matter.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
@Mod(modid = Matter.MODID, name = Matter.NAME, version = Matter.VERSION)
public class Matter {

    public static final String NAME = "Matter";
    public static final String MODID = "matter";
    public static final String VERSION = "1.0";

    @Mod.Instance(Matter.MODID)
    public static Matter instance = new Matter();

    @SidedProxy(clientSide = "com.xenry.matter.proxy.ClientProxy", serverSide = "com.xenry.matter.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
