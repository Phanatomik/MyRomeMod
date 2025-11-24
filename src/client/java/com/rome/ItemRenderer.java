package com.rome;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

@Environment(EnvType.CLIENT)
public class ItemRenderer implements ArmorRenderer {

    // Вспомогательный метод, чтобы не дублировать код рендера
    private void renderAsItem(ItemStack stack,
                              MatrixStack matrices,
                              VertexConsumerProvider vertices,
                              int light,
                              LivingEntity entity,
                              ModelTransformationMode mode) {
        MinecraftClient.getInstance().getItemRenderer().renderItem(
                stack,
                mode,
                light,
                OverlayTexture.DEFAULT_UV,
                matrices,
                vertices,
                entity.getWorld(),
                0
        );
    }

    @Override
    public void render(MatrixStack matrices,
                       VertexConsumerProvider vertices,
                       ItemStack stack,
                       LivingEntity entity,
                       EquipmentSlot slot,
                       int light,
                       BipedEntityModel<LivingEntity> ctx) {

        switch (slot) {
            case HEAD -> {
                matrices.push();
                ctx.head.rotate(matrices);
                renderAsItem(stack, matrices, vertices, light, entity, ModelTransformationMode.HEAD);

                matrices.pop();
            }
            case CHEST, LEGS -> {
                matrices.push();
                ctx.body.rotate(matrices);
                renderAsItem(stack, matrices, vertices, light, entity, ModelTransformationMode.NONE);
                matrices.pop();
            }
            case FEET -> {
                matrices.push();
                ctx.leftLeg.rotate(matrices);
                renderAsItem(stack, matrices, vertices, light, entity, ModelTransformationMode.NONE);
                matrices.pop();

                matrices.push();
                ctx.rightLeg.rotate(matrices);
                renderAsItem(stack, matrices, vertices, light, entity, ModelTransformationMode.NONE);
                matrices.pop();
            }
            default -> {
                // ничего не делаем
            }
        }
    }
}
