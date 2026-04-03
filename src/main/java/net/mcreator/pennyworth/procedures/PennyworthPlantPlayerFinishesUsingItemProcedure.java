package net.mcreator.pennyworth.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.pennyworth.init.PennyworthModMobEffects;

public class PennyworthPlantPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(PennyworthModMobEffects.RAIL_BREAKER, 36000, 0));
	}
}