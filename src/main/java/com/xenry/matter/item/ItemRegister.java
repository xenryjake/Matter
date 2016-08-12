package com.xenry.matter.item;

import com.xenry.matter.item.items.aluminum.*;
import com.xenry.matter.item.items.carbon.CarbonBitItem;
import com.xenry.matter.item.items.carbon.CarbonChunkItem;
import com.xenry.matter.item.items.emerald.*;
import com.xenry.matter.item.items.random.DiamondShardItem;
import com.xenry.matter.item.items.random.IronNuggetItem;
import com.xenry.matter.item.items.ruby.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Matter created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public final class ItemRegister {

    // ruby
    public static RubyItem rubyItem;
    public static RubySwordItem rubySwordItem;
    public static RubyPickaxeItem rubyPickaxeItem;
    public static RubyAxeItem rubyAxeItem;
    public static RubySpadeItem rubySpadeItem;
    public static RubyHoeItem rubyHoeItem;
    public static RubyArmorItem rubyHelmetItem, rubyChestplateItem, rubyLeggingsItem, rubyBootsItem;

    // emerald
    public static EmeraldSwordItem emeraldSwordItem;
    public static EmeraldPickaxeItem emeraldPickaxeItem;
    public static EmeraldAxeItem emeraldAxeItem;
    public static EmeraldSpadeItem emeraldSpadeItem;
    public static EmeraldHoeItem emeraldHoeItem;
    public static EmeraldArmorItem emeraldHelmetItem, emeraldChestplateItem, emeraldLeggingsItem, emeraldBootsItem;

    // aluminum
    public static AluminumIngotItem aluminumIngotItem;
    public static AluminumSwordItem aluminumSwordItem;
    public static AluminumPickaxeItem aluminumPickaxeItem;
    public static AluminumAxeItem aluminumAxeItem;
    public static AluminumSpadeItem aluminumSpadeItem;
    public static AluminumHoeItem aluminumHoeItem;
    public static AluminumArmorItem aluminumHelmetItem, aluminumChestplateItem, aluminumLeggingsItem, aluminumBootsItem;

    // tools & armor
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial", 3, 1000, 10F, 3F, 15);
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("rubyArmorMaterial", "matter:ruby", 30, new int[]{3,8,6,3}, 15);
    public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 3, 1500, 12F, 4F, 12);
    public static final ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emeraldArmorMaterial", "matter:emerald", 35, new int[]{3,8,6,3}, 12);
    public static final Item.ToolMaterial aluminumToolMaterial = EnumHelper.addToolMaterial("aluminumToolMaterial", 2, 500, 3.8F, 1.5F, 4);
    public static final ItemArmor.ArmorMaterial aluminumArmorMaterial = EnumHelper.addArmorMaterial("aluminumArmorMaterial", "matter:aluminum", 13, new int[]{2,5,4,1}, 4);

    // stuff
    public static IronNuggetItem ironNuggetItem;

    // carbon & diamond shards
    public static CarbonBitItem carbonBitItem;
    public static CarbonChunkItem carbonChunkItem;
    public static DiamondShardItem diamondShardItem;
    
    public static void registerItems(){

        // ruby
        GameRegistry.registerItem(rubyItem = new RubyItem(), RubyItem.name);
        GameRegistry.registerItem(rubySwordItem = new RubySwordItem(), RubySwordItem.name);
        GameRegistry.registerItem(rubyPickaxeItem = new RubyPickaxeItem(), RubyPickaxeItem.name);
        GameRegistry.registerItem(rubyAxeItem = new RubyAxeItem(), RubyAxeItem.name);
        GameRegistry.registerItem(rubySpadeItem = new RubySpadeItem(), RubySpadeItem.name);
        GameRegistry.registerItem(rubyHoeItem = new RubyHoeItem(), RubyHoeItem.name);
        GameRegistry.registerItem(rubyHelmetItem = new RubyArmorItem(0), RubyArmorItem.helmetName);
        GameRegistry.registerItem(rubyChestplateItem = new RubyArmorItem(1), RubyArmorItem.chestplateName);
        GameRegistry.registerItem(rubyLeggingsItem = new RubyArmorItem(2), RubyArmorItem.leggingsName);
        GameRegistry.registerItem(rubyBootsItem = new RubyArmorItem(3), RubyArmorItem.bootsName);

        // emerald
        GameRegistry.registerItem(emeraldSwordItem = new EmeraldSwordItem(), EmeraldSwordItem.name);
        GameRegistry.registerItem(emeraldPickaxeItem = new EmeraldPickaxeItem(), EmeraldPickaxeItem.name);
        GameRegistry.registerItem(emeraldAxeItem = new EmeraldAxeItem(), EmeraldAxeItem.name);
        GameRegistry.registerItem(emeraldSpadeItem = new EmeraldSpadeItem(), EmeraldSpadeItem.name);
        GameRegistry.registerItem(emeraldHoeItem = new EmeraldHoeItem(), EmeraldHoeItem.name);
        GameRegistry.registerItem(emeraldHelmetItem = new EmeraldArmorItem(0), EmeraldArmorItem.helmetName);
        GameRegistry.registerItem(emeraldChestplateItem = new EmeraldArmorItem(1), EmeraldArmorItem.chestplateName);
        GameRegistry.registerItem(emeraldLeggingsItem = new EmeraldArmorItem(2), EmeraldArmorItem.leggingsName);
        GameRegistry.registerItem(emeraldBootsItem = new EmeraldArmorItem(3), EmeraldArmorItem.bootsName);

        // aluminum
        GameRegistry.registerItem(aluminumIngotItem = new AluminumIngotItem(), AluminumIngotItem.name);
        GameRegistry.registerItem(aluminumSwordItem = new AluminumSwordItem(), AluminumSwordItem.name);
        GameRegistry.registerItem(aluminumPickaxeItem = new AluminumPickaxeItem(), AluminumPickaxeItem.name);
        GameRegistry.registerItem(aluminumAxeItem = new AluminumAxeItem(), AluminumAxeItem.name);
        GameRegistry.registerItem(aluminumSpadeItem = new AluminumSpadeItem(), AluminumSpadeItem.name);
        GameRegistry.registerItem(aluminumHoeItem = new AluminumHoeItem(), AluminumHoeItem.name);
        GameRegistry.registerItem(aluminumHelmetItem = new AluminumArmorItem(0), AluminumArmorItem.helmetName);
        GameRegistry.registerItem(aluminumChestplateItem = new AluminumArmorItem(1), AluminumArmorItem.chestplateName);
        GameRegistry.registerItem(aluminumLeggingsItem = new AluminumArmorItem(2), AluminumArmorItem.leggingsName);
        GameRegistry.registerItem(aluminumBootsItem = new AluminumArmorItem(3), AluminumArmorItem.bootsName);

        // stuff
        GameRegistry.registerItem(ironNuggetItem = new IronNuggetItem(), IronNuggetItem.name);

        // carbon
        GameRegistry.registerItem(carbonBitItem = new CarbonBitItem(), CarbonBitItem.name);
        GameRegistry.registerItem(carbonChunkItem = new CarbonChunkItem(), CarbonChunkItem.name);
        GameRegistry.registerItem(diamondShardItem = new DiamondShardItem(), DiamondShardItem.name);

    }

}
