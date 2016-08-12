package com.xenry.matter.item.items.carbon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Matter created by Henry Jake on February 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class CarbonChunkItem extends Item {

    public static final String name = "carbon_chunk";

    public CarbonChunkItem(){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
