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

import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemGroup;

import net.mcreator.lotmodfabric.item.BronieItemGroup;

import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class LotmodFabricMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup Bronie = BronieItemGroup.get();
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
