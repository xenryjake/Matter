package com.xenry.matter.block;

import com.xenry.matter.block.blocks.aluminum.AluminumBlock;
import com.xenry.matter.block.blocks.carbon.CarbonBlock;
import com.xenry.matter.block.blocks.compressed.CompressedCobblestoneBlock;
import com.xenry.matter.block.blocks.compressed.CompressedDirtBlock;
import com.xenry.matter.block.blocks.compressed.CompressedGravelBlock;
import com.xenry.matter.block.blocks.ruby.RubyBlock;
import com.xenry.matter.block.blocks.ruby.RubyOreBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class BlockRegister {

    public static RubyBlock rubyBlock;
    public static RubyOreBlock rubyOreBlock;
    public static AluminumBlock aluminumBlock;
    public static CarbonBlock carbonBlock;
    public static CompressedCobblestoneBlock compressedCobblestoneBlock;
    public static CompressedDirtBlock compressedDirtBlock;
    public static CompressedGravelBlock compressedGravelBlock;
    //public static ColorBlock colorBlock;
    //public static ColorBlock_old colorBlock;

    public static void registerBlocks(){
        GameRegistry.registerBlock(rubyBlock = new RubyBlock(), RubyBlock.name);
        GameRegistry.registerBlock(rubyOreBlock = new RubyOreBlock(), RubyOreBlock.name);
        GameRegistry.registerBlock(aluminumBlock = new AluminumBlock(), AluminumBlock.name);
        GameRegistry.registerBlock(carbonBlock = new CarbonBlock(), CarbonBlock.name);

        // Compressed
        GameRegistry.registerBlock(compressedCobblestoneBlock = new CompressedCobblestoneBlock(), CompressedCobblestoneBlock.name);
        GameRegistry.registerBlock(compressedDirtBlock = new CompressedDirtBlock(), CompressedDirtBlock.name);
        GameRegistry.registerBlock(compressedGravelBlock = new CompressedGravelBlock(), CompressedGravelBlock.name);

        //GameRegistry.registerBlock(colorBlock = new ColorBlock(), ColorBlock.name);
        //GameRegistry.registerBlock(colorBlock = new ColorBlock_old(), ColorBlockItem_old.class, ColorBlock_old.name);
    }

}
