/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pennyworth.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.pennyworth.item.PennyworthPlantItem;
import net.mcreator.pennyworth.PennyworthMod;

import java.util.function.Function;

public class PennyworthModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PennyworthMod.MODID);
	public static final DeferredItem<Item> PENNYWORTH_PLANT;
	static {
		PENNYWORTH_PLANT = register("pennyworth_plant", PennyworthPlantItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}