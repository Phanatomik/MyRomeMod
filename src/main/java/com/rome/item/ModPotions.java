package com.rome.item;

import com.rome.effect.ModEffects;
import net.minecraft.potion.Potion;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion POTION_OF_SUPER_STRENGTH = new Potion(
            new StatusEffectInstance(ModEffects.SUPER_STRENGTH, 20 * 60, 0),
            new StatusEffectInstance(net.minecraft.entity.effect.StatusEffects.STRENGTH, 20 * 60, 3),
            new StatusEffectInstance(net.minecraft.entity.effect.StatusEffects.SPEED, 20 * 60, 1),
            new StatusEffectInstance(net.minecraft.entity.effect.StatusEffects.JUMP_BOOST, 20 * 60, 1)
    );

    public static void registerPotions() {
        // ✅ Новый синтаксис 1.21:
        Registry.register(Registries.POTION, Identifier.of("rome", "super_strength"), POTION_OF_SUPER_STRENGTH);
    }
}
