/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pennyworth.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.pennyworth.block.PennyworthBlock;
import net.mcreator.pennyworth.PennyworthMod;

import java.util.function.Function;

public class PennyworthModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PennyworthMod.MODID);
	public static final DeferredBlock<Block> PENNYWORTH;
	static {
		PENNYWORTH = register("pennyworth", PennyworthBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}