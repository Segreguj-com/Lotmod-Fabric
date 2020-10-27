
package net.mcreator.lotmodfabric.item;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class BronieItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("lotmod_fabric", "bronie")).icon(() -> {
		return new ItemStack(Blocks.TRIPWIRE_HOOK);
	}).build();
}
