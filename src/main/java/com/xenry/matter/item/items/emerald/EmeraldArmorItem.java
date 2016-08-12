package com.xenry.matter.item.items.emerald;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

/**
 * mod1 created by Henry Jake on December 22, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class EmeraldArmorItem extends ItemArmor {

    public static final String helmetName = "emerald_helmet", chestplateName = "emerald_chestplate", leggingsName = "emerald_leggings", bootsName = "emerald_boots";

    public EmeraldArmorItem(int type){
        super(ItemRegister.emeraldArmorMaterial, type == 2 ? 2 : 1, type);
        this.setUnlocalizedName(type == 0 ? helmetName : type == 1 ? chestplateName : type == 2 ? leggingsName : type == 3 ? bootsName : "");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

}
