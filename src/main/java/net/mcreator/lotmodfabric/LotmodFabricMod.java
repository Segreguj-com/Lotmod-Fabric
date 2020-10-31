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
import net.minecraft.block.Block;

import net.mcreator.lotmodfabric.item.BronieItemGroup;
import net.mcreator.lotmodfabric.block.LotmodWoodBlock;
import net.mcreator.lotmodfabric.block.LotmodStairsBlock;
import net.mcreator.lotmodfabric.block.LotmodPlanksBlock;
import net.mcreator.lotmodfabric.block.LotmodLogBlock;
import net.mcreator.lotmodfabric.block.LotmodLeavesBlock;
import net.mcreator.lotmodfabric.block.LotmodFenceGateBlock;
import net.mcreator.lotmodfabric.block.LotmodFenceBlock;

import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class LotmodFabricMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup Bronie = BronieItemGroup.get();
	public static final Block LotmodWood_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_wood"), new LotmodWoodBlock());
	public static final BlockItem LotmodWood_ITEM = Registry.register(Registry.ITEM, id("lotmod_wood"),
			new BlockItem(LotmodWood_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LotmodLog_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_log"), new LotmodLogBlock());
	public static final BlockItem LotmodLog_ITEM = Registry.register(Registry.ITEM, id("lotmod_log"),
			new BlockItem(LotmodLog_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LotmodPlanks_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_planks"), new LotmodPlanksBlock());
	public static final BlockItem LotmodPlanks_ITEM = Registry.register(Registry.ITEM, id("lotmod_planks"),
			new BlockItem(LotmodPlanks_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LotmodLeaves_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_leaves"), new LotmodLeavesBlock());
	public static final BlockItem LotmodLeaves_ITEM = Registry.register(Registry.ITEM, id("lotmod_leaves"),
			new BlockItem(LotmodLeaves_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LotmodStairs_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_stairs"), new LotmodStairsBlock());
	public static final BlockItem LotmodStairs_ITEM = Registry.register(Registry.ITEM, id("lotmod_stairs"),
			new BlockItem(LotmodStairs_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LotmodFence_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_fence"), new LotmodFenceBlock());
	public static final BlockItem LotmodFence_ITEM = Registry.register(Registry.ITEM, id("lotmod_fence"),
			new BlockItem(LotmodFence_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
	public static final Block LotmodFenceGate_BLOCK = Registry.register(Registry.BLOCK, id("lotmod_fence_gate"), new LotmodFenceGateBlock());
	public static final BlockItem LotmodFenceGate_ITEM = Registry.register(Registry.ITEM, id("lotmod_fence_gate"),
			new BlockItem(LotmodFenceGate_BLOCK, new Item.Settings().group(LotmodFabricMod.Bronie)));
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
