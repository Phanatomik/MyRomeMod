package com.rome.datagen;

import com.rome.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor((ArmorItem) ModItems.PRAETORIAN_CHESTPLATE_PURPLE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PRAETORIAN_LEGGINS_PURPLE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PRAETORIAN_BOOTS_PURPLE);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.PRAETORIAN_CHESTPLATE_RED);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PRAETORIAN_LEGGINS_RED);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PRAETORIAN_BOOTS_RED);
    }
}
