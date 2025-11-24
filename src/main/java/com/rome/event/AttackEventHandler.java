package com.rome.event;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.LivingEntity;
import com.rome.effect.ModEffects;

public class AttackEventHandler {
    public static void register() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (!world.isClient && entity instanceof LivingEntity target) {
                if (player.hasStatusEffect(ModEffects.SUPER_STRENGTH)) {
                    int amp = player.getStatusEffect(ModEffects.SUPER_STRENGTH).getAmplifier();
                    double y = 1.2 + 0.3 * amp;  // выше при большем уровне
                    target.addVelocity(0.0, y, 0.0);
                    // В 1.21 иногда полезно "подтолкнуть" обновление скорости:
                    target.velocityDirty = true; // если поле помечено как deprecated — всё равно работает для синхронизации
                    // Дополнительно можно нанести комедийный урон:
                    // target.damage(world.getDamageSources().playerAttack(player), 6.0F);
                }
            }
            return ActionResult.PASS;
        });
    }
}
