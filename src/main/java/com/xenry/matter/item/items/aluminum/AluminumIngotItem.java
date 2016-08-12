package com.xenry.matter.item.items.aluminum;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Matter created by Henry Jake on April 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class AluminumIngotItem extends Item {

    public static final String name = "aluminum_ingot";

    public AluminumIngotItem(){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
