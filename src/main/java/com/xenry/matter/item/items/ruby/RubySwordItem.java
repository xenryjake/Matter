package com.xenry.matter.item.items.ruby;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * mod1 created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class RubySwordItem extends ItemSword {

    public static final String name = "ruby_sword";

    public RubySwordItem(){
        super(ItemRegister.rubyToolMaterial);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

}
