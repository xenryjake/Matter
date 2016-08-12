package com.xenry.matter.block.blocks.color;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Matter created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
@Deprecated
public class ColorBlockItem_old extends ItemBlock {

    public ColorBlockItem_old(Block block){
        super(block);
        if(!(block instanceof ColorBlock_old))
            throw new IllegalArgumentException(block.getUnlocalizedName() + " isn't a color block.");
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "." + ((ColorBlock_old)this.block).getSpecialName(stack);
    }

}
