package com.xenry.matter.item.items.ruby;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

/**
 * Matter created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class RubyArmorItem extends ItemArmor {

    public static final String helmetName = "ruby_helmet", chestplateName = "ruby_chestplate", leggingsName = "ruby_leggings", bootsName = "ruby_boots";

    public RubyArmorItem(int type){
        super(ItemRegister.rubyArmorMaterial, type == 2 ? 2 : 1, type);
        this.setUnlocalizedName(type == 0 ? helmetName : type == 1 ? chestplateName : type == 2 ? leggingsName : type == 3 ? bootsName : "");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

}
