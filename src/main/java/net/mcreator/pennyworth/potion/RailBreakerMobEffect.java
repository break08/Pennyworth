package net.mcreator.pennyworth.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.pennyworth.procedures.RailBreakerOnEffectActiveTickProcedure;

public class RailBreakerMobEffect extends MobEffect {
	public RailBreakerMobEffect() {
		super(MobEffectCategory.NEUTRAL, -14222336);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		RailBreakerOnEffectActiveTickProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
		return super.applyEffectTick(level, entity, amplifier);
	}
}