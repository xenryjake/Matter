package com.xenry.matter.item.items.aluminum;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

/**
 * Matter created by Henry Jake on April 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class AluminumArmorItem extends ItemArmor {

    public static final String helmetName = "aluminum_helmet", chestplateName = "aluminum_chestplate", leggingsName = "aluminum_leggings", bootsName = "aluminum_boots";

    public AluminumArmorItem(int type){
        super(ItemRegister.aluminumArmorMaterial, type == 2 ? 2 : 1, type);
        this.setUnlocalizedName(type == 0 ? helmetName : type == 1 ? chestplateName : type == 2 ? leggingsName : type == 3 ? bootsName : "");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

}
