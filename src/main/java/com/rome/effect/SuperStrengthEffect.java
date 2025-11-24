package com.rome.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import java.util.UUID;

public class SuperStrengthEffect extends StatusEffect {
    // фиксированные UUID, чтобы не дублировались модификаторы
    private static final UUID DMG_UUID   = UUID.fromString("11111111-1111-1111-1111-111111111111");
    private static final UUID SPD_UUID   = UUID.fromString("22222222-2222-2222-2222-222222222222");
    private static final UUID KB_RES_UUID= UUID.fromString("33333333-3333-3333-3333-333333333333");

    public SuperStrengthEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF4500);
        // +8 урона (~как меч из незералмаза сверху)
        this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, DMG_UUID.toString(), 8.0, EntityAttributeModifier.Operation.ADD_VALUE);
        // +30% скорости
        this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, SPD_UUID.toString(), 0.30, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        // +0.5 устойчивости к отбрасыванию (чтобы тебя сложнее было отбрасывать)
        this.addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, KB_RES_UUID.toString(), 0.5, EntityAttributeModifier.Operation.ADD_VALUE);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        // Тут можно добавлять частицы/звук, если хочешь
        return false;
    }
}
