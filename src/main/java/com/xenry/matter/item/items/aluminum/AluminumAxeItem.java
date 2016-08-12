package com.xenry.matter.item.items.aluminum;

import com.xenry.matter.item.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * mod1 created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class AluminumAxeItem extends ItemAxe {

    public static final String name = "aluminum_axe";

    public AluminumAxeItem(){
        super(ItemRegister.aluminumToolMaterial);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

}
