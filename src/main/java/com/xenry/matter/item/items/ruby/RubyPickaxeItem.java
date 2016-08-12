package com.xenry.matter.item.items.ruby;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * mod1 created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class RubyPickaxeItem extends ItemPickaxe {

    public static final String name = "ruby_pickaxe";

    public RubyPickaxeItem(){
        super(ItemRegister.rubyToolMaterial);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

}
