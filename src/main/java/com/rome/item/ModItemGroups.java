package com.rome.item;

import com.rome.RomeMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ROME_ARMOR_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RomeMod.MOD_ID, "rome_armor_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PRAETORIAN_HAT_RED))
                    .displayName(Text.translatable("Рим"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PRAETORIAN_HAT_RED);
                        entries.add(ModItems.PRAETORIAN_CHESTPLATE_RED);
                        entries.add(ModItems.PRAETORIAN_LEGGINS_RED);
                        entries.add(ModItems.PRAETORIAN_BOOTS_RED);

                        entries.add(ModItems.PRAETORIAN_HAT_PURPLE);
                        entries.add(ModItems.PRAETORIAN_CHESTPLATE_PURPLE);
                        entries.add(ModItems.PRAETORIAN_LEGGINS_PURPLE);
                        entries.add(ModItems.PRAETORIAN_BOOTS_PURPLE);

                        entries.add(ModItems.LEGIONER_HELMET);
                        entries.add(ModItems.LEGIONER_CHESTPLATE);
                        entries.add(ModItems.LEGIONER_LEGGINS);
                        entries.add(ModItems.LEGIONER_BOOTS);

                        entries.add(ModItems.HASTATUS_HELMET);
                        entries.add(ModItems.HASTATUS_CHESTPLATE);
                        entries.add(ModItems.HASTATUS_LEGGINS);
                        entries.add(ModItems.HASTATUS_BOOTS);

                        entries.add(ModItems.GENERAL_HELMET);
                        entries.add(ModItems.GENERAL_CHESTPLATE);
                        entries.add(ModItems.GENERAL_LEGGINS);
                        entries.add(ModItems.GENERAL_BOOTS);

                        entries.add(ModItems.AQUILIFER_HELMET);
                        entries.add(ModItems.AQUILIFER_CHESTPLATE);
                        entries.add(ModItems.AQUILIFER_LEGGINS);
                        entries.add(ModItems.AQUILIFER_BOOTS);

                        entries.add(ModItems.CENTURION_HELMET_RED);
                        entries.add(ModItems.CENTURION_HELMET_PURPLE);
                        entries.add(ModItems.CENTURION_HELMET_WHITE);
                        entries.add(ModItems.CENTURION_CHESTPLATE);
                        entries.add(ModItems.CENTURION_LEGGINS);
                        entries.add(ModItems.CENTURION_BOOTS);

                        entries.add(ModItems.ROMANELITE_HELMET);
                        entries.add(ModItems.ROMANELITE_CHESTPLATE);
                        entries.add(ModItems.ROMANELITE_LEGGINS);
                        entries.add(ModItems.ROMANELITE_BOOTS);

                        entries.add(ModItems.EMPEROR_HELMET);
                        entries.add(ModItems.EMPEROR_CHESTPLATE);
                        entries.add(ModItems.EMPEROR_LEGGINS);
                        entries.add(ModItems.EMPEROR_BOOTS);
                    })


                    .build());

    public static final ItemGroup GAUL_ARMOR_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RomeMod.MOD_ID, "gaul_armor_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHIEF_HELMET))
                    .displayName(Text.translatable("Галлия"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GAUL_HELMET);
                        entries.add(ModItems.GAUL_CHESTPLATE);
                        entries.add(ModItems.GAUL_LEGGINS);
                        entries.add(ModItems.GAUL_BOOTS);

                        entries.add(ModItems.CHIEF_HELMET);
                        entries.add(ModItems.CHIEF_CHESTPLATE);
                        entries.add(ModItems.CHIEF_LEGGINS);
                        entries.add(ModItems.CHIEF_BOOTS);


                    })


                    .build());


    public static void registerItemGroups() {
        RomeMod.LOGGER.info("Registering Item Groups for " + RomeMod.MOD_ID);
    }
}
