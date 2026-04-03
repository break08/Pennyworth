package net.mcreator.pennyworth.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RailBreakerOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double fx = 0;
		double fy = 0;
		double fz = 0;
		sx = -4;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -4;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -4;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:rail_category")))) {
						found = true;
						fx = x + sx;
						fy = y + sy;
						fz = z + sz;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			world.setBlock(BlockPos.containing(fx, fy, fz), Blocks.AIR.defaultBlockState(), 3);
			if (!world.isEmptyBlock(BlockPos.containing(fx, fy - 1, fz)) && (world.getBlockState(BlockPos.containing(fx, fy - 1, fz))).getBlock() == Blocks.BEDROCK) {
				world.setBlock(BlockPos.containing(fx, fy - 1, fz), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}