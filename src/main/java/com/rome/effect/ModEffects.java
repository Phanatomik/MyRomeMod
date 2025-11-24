package com.rome.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    // Храним именно RegistryEntry<StatusEffect>
    public static final RegistryEntry<StatusEffect> SUPER_STRENGTH =
            Registry.registerReference(
                    Registries.STATUS_EFFECT,
                    Identifier.of("rome", "super_strength"),
                    new SuperStrengthEffect()
            );

    public static void registerEffects() {
        // ничего больше не нужно: регистрация уже выполнена в статическом поле
    }

    // Если где-то понадобится сам объект эффекта:
    // public static StatusEffect superStrength() { return SUPER_STRENGTH.value(); }
}
