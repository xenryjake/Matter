package com.xenry.matter.item.items.random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Matter created by Henry Jake on February 23, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class IronNuggetItem extends Item {

    public static final String name = "iron_nugget";

    public IronNuggetItem(){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
