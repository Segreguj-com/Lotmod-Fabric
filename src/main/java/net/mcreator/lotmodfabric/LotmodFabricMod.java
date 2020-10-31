/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.lotmodfabric;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.block.Block;

import net.mcreator.lotmodfabric.item.LegatiumDustItem;
import net.mcreator.lotmodfabric.item.BronieItemGroup;
import net.mcreator.lotmodfabric.block.LegatiumOreBlock;
import net.mcreator.lotmodfabric.block.LegatiumBlockBlock;
import net.mcreator.lotmodfabric.block.CaloricWoodBlock;
import net.mcreator.lotmodfabric.block.CaloricStairsBlock;
import net.mcreator.lotmodfabric.block.CaloricSlabBlock;
import net.mcreator.lotmodfabric.block.CaloricPlanksBlock;
import net.mcreator.lotmodfabric.block.CaloricLogBlock;
import net.mcreator.lotmodfabric.block.CaloricLeavesBlock;
import net.mcreator.lotmodfabric.block.CaloricFenceGateBlock;
import net.mcreator.lotmodfabric.block.CaloricFenceBlock;

import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class LotmodFabricMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item LegatiumDust_ITEM = Registry.register(Registry.ITEM, id("legatium_dust"), new LegatiumDustItem());
	public static final ItemGroup Bronie = BronieItemGroup.get();
	public static final Block CaloricWood_BLOCK = Registry.register(Registry.BLOCK, id("caloric_wood"), new CaloricWoodBlock());
	public static final BlockItem CaloricWood_ITEM = Registry.register(Registry.ITEM, id("caloric_wood"),
			new BlockItem(CaloricWood_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricLog_BLOCK = Registry.register(Registry.BLOCK, id("caloric_log"), new CaloricLogBlock());
	public static final BlockItem CaloricLog_ITEM = Registry.register(Registry.ITEM, id("caloric_log"),
			new BlockItem(CaloricLog_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricPlanks_BLOCK = Registry.register(Registry.BLOCK, id("caloric_planks"), new CaloricPlanksBlock());
	public static final BlockItem CaloricPlanks_ITEM = Registry.register(Registry.ITEM, id("caloric_planks"),
			new BlockItem(CaloricPlanks_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricLeaves_BLOCK = Registry.register(Registry.BLOCK, id("caloric_leaves"), new CaloricLeavesBlock());
	public static final BlockItem CaloricLeaves_ITEM = Registry.register(Registry.ITEM, id("caloric_leaves"),
			new BlockItem(CaloricLeaves_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricStairs_BLOCK = Registry.register(Registry.BLOCK, id("caloric_stairs"), new CaloricStairsBlock());
	public static final BlockItem CaloricStairs_ITEM = Registry.register(Registry.ITEM, id("caloric_stairs"),
			new BlockItem(CaloricStairs_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricSlab_BLOCK = Registry.register(Registry.BLOCK, id("caloric_slab"), new CaloricSlabBlock());
	public static final BlockItem CaloricSlab_ITEM = Registry.register(Registry.ITEM, id("caloric_slab"),
			new BlockItem(CaloricSlab_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricFence_BLOCK = Registry.register(Registry.BLOCK, id("caloric_fence"), new CaloricFenceBlock());
	public static final BlockItem CaloricFence_ITEM = Registry.register(Registry.ITEM, id("caloric_fence"),
			new BlockItem(CaloricFence_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block CaloricFenceGate_BLOCK = Registry.register(Registry.BLOCK, id("caloric_fence_gate"), new CaloricFenceGateBlock());
	public static final BlockItem CaloricFenceGate_ITEM = Registry.register(Registry.ITEM, id("caloric_fence_gate"),
			new BlockItem(CaloricFenceGate_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LegatiumOre_BLOCK = Registry.register(Registry.BLOCK, id("legatium_ore"), new LegatiumOreBlock());
	public static final BlockItem LegatiumOre_ITEM = Registry.register(Registry.ITEM, id("legatium_ore"),
			new BlockItem(LegatiumOre_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LegatiumBlock_BLOCK = Registry.register(Registry.BLOCK, id("legatium_block"), new LegatiumBlockBlock());
	public static final BlockItem LegatiumBlock_ITEM = Registry.register(Registry.ITEM, id("legatium_block"),
			new BlockItem(LegatiumBlock_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Item LegatiumArmor_HELMET = Registry.register(Registry.ITEM, id("legatium_armor"),
			new ArmorItem(LegatiumArmorArmorMaterial.LEGATIUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item LegatiumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("legatium_armor"),
			new ArmorItem(LegatiumArmorArmorMaterial.LEGATIUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item LegatiumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("legatium_armor"),
			new ArmorItem(LegatiumArmorArmorMaterial.LEGATIUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item LegatiumArmor_BOOTS = Registry.register(Registry.ITEM, id("legatium_armor"),
			new ArmorItem(LegatiumArmorArmorMaterial.LEGATIUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item LegatiumPickaxe_TOOL = Registry.register(Registry.ITEM, id("legatium_pickaxe"), LegatiumPickaxeTool.INSTANCE);
	public static final Item LegatiumAxe_TOOL = Registry.register(Registry.ITEM, id("legatium_axe"), LegatiumAxeTool.INSTANCE);
	public static final Item LegatiumSword_TOOL = Registry.register(Registry.ITEM, id("legatium_sword"), LegatiumSwordTool.INSTANCE);
	public static final Item LegatiumShovel_TOOL = Registry.register(Registry.ITEM, id("legatium_shovel"), LegatiumShovelTool.INSTANCE);
	public static final Item LegatiumHoe_TOOL = Registry.register(Registry.ITEM, id("legatium_hoe"), LegatiumHoeTool.INSTANCE);
	public void onInitialize() {
		LOGGER.info("[LotmodFabricMod] Initializing");
		WorldTickCallback.EVENT.register((world) -> {
		});
		UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
			return ActionResult.PASS;
		});
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			return ActionResult.PASS;
		});
		UseItemCallback.EVENT.register((player, world, hand) -> {
			return TypedActionResult.pass(player.getStackInHand(hand));
		});
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("lotmod_fabric", s);
	}
}
