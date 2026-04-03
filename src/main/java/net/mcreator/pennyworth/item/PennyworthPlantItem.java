package net.mcreator.pennyworth.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.pennyworth.procedures.PennyworthPlantPlayerFinishesUsingItemProcedure;

public class PennyworthPlantItem extends Item {
	public PennyworthPlantItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.01f).build(), Consumables.defaultFood().consumeSeconds(0.25F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		PennyworthPlantPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}