package com.rome.item;

import com.rome.RomeMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //-----------------------------------РИМ----------------------------------------------------------------------------
    public static final Item PRAETORIAN_HAT_RED = registerItem(
            "praetorian_hat_red",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_RED, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,                 // какой тип брони
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item PRAETORIAN_CHESTPLATE_RED = registerItem(
            "praetorian_chestplate_red",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_RED, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item PRAETORIAN_LEGGINS_RED = registerItem(
            "praetorian_leggins_red",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_RED, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item PRAETORIAN_BOOTS_RED = registerItem(
            "praetorian_boots_red",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_RED, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item PRAETORIAN_HAT_PURPLE = registerItem(
            "praetorian_hat_purple",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_PURPLE, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item PRAETORIAN_CHESTPLATE_PURPLE = registerItem(
            "praetorian_chestplate_purple",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_PURPLE, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item PRAETORIAN_LEGGINS_PURPLE = registerItem(
            "praetorian_leggins_purple",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_PURPLE, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item PRAETORIAN_BOOTS_PURPLE = registerItem(
            "praetorian_boots_purple",
            new ArmorItem(
                    ModArmorMaterials.PRAETORIAN_ARMOR_MATERIAL_PURPLE, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item LEGIONER_HELMET = registerItem(
            "legioner_helmet",
            new ArmorItem(
                    ModArmorMaterials.LEGIONER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item LEGIONER_CHESTPLATE = registerItem(
            "legioner_chestplate",
            new ArmorItem(
                    ModArmorMaterials.LEGIONER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item LEGIONER_LEGGINS = registerItem(
            "legioner_leggins",
            new ArmorItem(
                    ModArmorMaterials.LEGIONER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item LEGIONER_BOOTS = registerItem(
            "legioner_boots",
            new ArmorItem(
                    ModArmorMaterials.LEGIONER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item HASTATUS_HELMET = registerItem(
            "hastatus_helmet",
            new ArmorItem(
                    ModArmorMaterials.HASTATUS_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(14)) // множитель прочности
            )
    );
    public static final Item HASTATUS_CHESTPLATE = registerItem(
            "hastatus_chestplate",
            new ArmorItem(
                    ModArmorMaterials.HASTATUS_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(14)) // множитель прочности
            )
    );
    public static final Item HASTATUS_LEGGINS = registerItem(
            "hastatus_leggins",
            new ArmorItem(
                    ModArmorMaterials.HASTATUS_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(14)) // множитель прочности
            )
    );
    public static final Item HASTATUS_BOOTS = registerItem(
            "hastatus_boots",
            new ArmorItem(
                    ModArmorMaterials.HASTATUS_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(14)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item GENERAL_HELMET = registerItem(
            "general_helmet",
            new ArmorItem(
                    ModArmorMaterials.GENERAL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item GENERAL_CHESTPLATE = registerItem(
            "general_chestplate",
            new ArmorItem(
                    ModArmorMaterials.GENERAL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item GENERAL_LEGGINS = registerItem(
            "general_leggins",
            new ArmorItem(
                    ModArmorMaterials.GENERAL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item GENERAL_BOOTS = registerItem(
            "general_boots",
            new ArmorItem(
                    ModArmorMaterials.GENERAL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item AQUILIFER_HELMET = registerItem(
            "aquilifer_helmet",
            new ArmorItem(
                    ModArmorMaterials.AQUILIFER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item AQUILIFER_CHESTPLATE = registerItem(
            "aquilifer_chestplate",
            new ArmorItem(
                    ModArmorMaterials.AQUILIFER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item AQUILIFER_LEGGINS = registerItem(
            "aquilifer_leggins",
            new ArmorItem(
                    ModArmorMaterials.AQUILIFER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item AQUILIFER_BOOTS = registerItem(
            "aquilifer_boots",
            new ArmorItem(
                    ModArmorMaterials.AQUILIFER_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item CENTURION_HELMET_RED = registerItem(
            "centurion_helmet_red",
            new ArmorItem(
                    ModArmorMaterials.CENTURION_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item CENTURION_HELMET_PURPLE = registerItem(
            "centurion_helmet_purple",
            new ArmorItem(
                    ModArmorMaterials.CENTURION_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item CENTURION_HELMET_WHITE = registerItem(
            "centurion_helmet_white",
            new ArmorItem(
                    ModArmorMaterials.CENTURION_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item CENTURION_CHESTPLATE = registerItem(
            "centurion_chestplate",
            new ArmorItem(
                    ModArmorMaterials.CENTURION_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item CENTURION_LEGGINS = registerItem(
            "centurion_leggins",
            new ArmorItem(
                    ModArmorMaterials.CENTURION_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)) // множитель прочности
            )
    );
    public static final Item CENTURION_BOOTS = registerItem(
            "centurion_boots",
            new ArmorItem(
                    ModArmorMaterials.CENTURION_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item ROMANELITE_HELMET = registerItem(
            "romanelite_helmet",
            new ArmorItem(
                    ModArmorMaterials.ROMANELITE_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35)) // множитель прочности
            )
    );
    public static final Item ROMANELITE_CHESTPLATE = registerItem(
            "romanelite_chestplate",
            new ArmorItem(
                    ModArmorMaterials.ROMANELITE_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35)) // множитель прочности
            )
    );
    public static final Item ROMANELITE_LEGGINS = registerItem(
            "romanelite_leggins",
            new ArmorItem(
                    ModArmorMaterials.ROMANELITE_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35)) // множитель прочности
            )
    );
    public static final Item ROMANELITE_BOOTS = registerItem(
            "romanelite_boots",
            new ArmorItem(
                    ModArmorMaterials.ROMANELITE_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item EMPEROR_HELMET = registerItem(
            "emperor_helmet",
            new ArmorItem(
                    ModArmorMaterials.EMPEROR_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35)) // множитель прочности
            )
    );
    public static final Item EMPEROR_CHESTPLATE = registerItem(
            "emperor_chestplate",
            new ArmorItem(
                    ModArmorMaterials.EMPEROR_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35)) // множитель прочности
            )
    );
    public static final Item EMPEROR_LEGGINS = registerItem(
            "emperor_leggins",
            new ArmorItem(
                    ModArmorMaterials.EMPEROR_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35)) // множитель прочности
            )
    );
    public static final Item EMPEROR_BOOTS = registerItem(
            "emperor_boots",
            new ArmorItem(
                    ModArmorMaterials.EMPEROR_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35)) // множитель прочности
            )
    );

    //-----------------------------------ГАЛЛИЯ-------------------------------------------------------------------------

    public static final Item GAUL_HELMET = registerItem(
            "gaul_helmet",
            new ArmorItem(
                    ModArmorMaterials.GAUL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item GAUL_CHESTPLATE = registerItem(
            "gaul_chestplate",
            new ArmorItem(
                    ModArmorMaterials.GAUL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item GAUL_LEGGINS = registerItem(
            "gaul_leggins",
            new ArmorItem(
                    ModArmorMaterials.GAUL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15)) // множитель прочности
            )
    );
    public static final Item GAUL_BOOTS = registerItem(
            "gaul_boots",
            new ArmorItem(
                    ModArmorMaterials.GAUL_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    public static final Item CHIEF_HELMET = registerItem(
            "chief_helmet",
            new ArmorItem(
                    ModArmorMaterials.CHIEF_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20)) // множитель прочности
            )
    );
    public static final Item CHIEF_CHESTPLATE = registerItem(
            "chief_chestplate",
            new ArmorItem(
                    ModArmorMaterials.CHIEF_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20)) // множитель прочности
            )
    );
    public static final Item CHIEF_LEGGINS = registerItem(
            "chief_leggins",
            new ArmorItem(
                    ModArmorMaterials.CHIEF_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20)) // множитель прочности
            )
    );
    public static final Item CHIEF_BOOTS = registerItem(
            "chief_boots",
            new ArmorItem(
                    ModArmorMaterials.CHIEF_ARMOR_MATERIAL, // твой ArmorMaterial
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20)) // множитель прочности
            )
    );

    //--------------------------------------------------------------------------------------------------------------

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RomeMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        RomeMod.LOGGER.info("Registering Mod Items for" + RomeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
        });
    }
}
