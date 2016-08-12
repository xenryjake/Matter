package com.xenry.matter.item.items.emerald;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

/**
 * mod1 created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class EmeraldSpadeItem extends ItemSpade {

    public static final String name = "emerald_shovel";

    public EmeraldSpadeItem(){
        super(ItemRegister.emeraldToolMaterial);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

}
