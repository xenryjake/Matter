package com.xenry.matter.item.items.ruby;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class RubyItem extends Item {

    public static final String name = "ruby";

    public RubyItem(){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
