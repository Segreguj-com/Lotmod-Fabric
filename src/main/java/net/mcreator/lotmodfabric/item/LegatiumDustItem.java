
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
package net.mcreator.lotmodfabric.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

public class LegatiumDustItem extends Item {
	public LegatiumDustItem() {
		super(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	// Needs to be fixed
	/*
	 * @Override public Multimap<EntityAttribute, EntityAttributeModifier>
	 * getAttributeModifiers(EquipmentSlot slot) { Multimap<String,
	 * EntityAttributeModifier> multimap = super.getAttributeModifiers(slot); if
	 * (slot == EquipmentSlot.MAINHAND) {
	 * multimap.put(EntityAttributes.GENERIC_ATTACK_DAMAGE.getTranslationKey(), new
	 * EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "item_damage", (double)
	 * -2, EntityAttributeModifier.Operation.ADDITION));
	 * multimap.put(EntityAttributes.GENERIC_ATTACK_SPEED.getTranslationKey(), new
	 * EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "item_attack_speed", -2.4,
	 * EntityAttributeModifier.Operation.ADDITION)); } return multimap; }
	 */
	@Override
	public int getEnchantability() {
		return 0;
	}
}
