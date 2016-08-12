package com.xenry.matter.item.items.random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Matter created by Henry Jake on February 24, 2016.
 * Copyright 2016 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class DiamondShardItem extends Item {

    public static final String name = "diamond_shard";

    public DiamondShardItem(){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
