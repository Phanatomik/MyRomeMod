// src/client/java/com/rome/RomeModClient.java
package com.rome;

import com.rome.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;

public class RomeModClient implements ClientModInitializer {
    @Override public void onInitializeClient() {
        ArmorRenderer.register(new ItemRenderer(),
                ModItems.PRAETORIAN_HAT_RED,
                ModItems.PRAETORIAN_HAT_PURPLE,
                ModItems.GENERAL_HELMET,
                ModItems.CENTURION_HELMET_RED,
                ModItems.CENTURION_HELMET_PURPLE,
                ModItems.CENTURION_HELMET_WHITE,
                ModItems.ROMANELITE_HELMET,
                ModItems.CHIEF_HELMET

                // можно перечислить сразу все шлемы
        );
    }
}
