package com.rome.item;

import com.rome.RomeMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> PRAETORIAN_ARMOR_MATERIAL_RED = registerArmorMaterial("praetorian_armor_red",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.DIAMOND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "praetorian_armor_red"))), 2, 0 ));

    public static final RegistryEntry<ArmorMaterial> PRAETORIAN_ARMOR_MATERIAL_PURPLE = registerArmorMaterial("praetorian_armor_purple",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.DIAMOND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "praetorian_armor_purple"))), 2, 0 ));

    public static final RegistryEntry<ArmorMaterial> LEGIONER_ARMOR_MATERIAL = registerArmorMaterial("legioner_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.IRON_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "legioner_armor"))), 0, 0 ));

    public static final RegistryEntry<ArmorMaterial> HASTATUS_ARMOR_MATERIAL = registerArmorMaterial("hastatus_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.COPPER_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "hastatus_armor"))), 0, 0 ));

    public static final RegistryEntry<ArmorMaterial> GENERAL_ARMOR_MATERIAL = registerArmorMaterial("general_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.DIAMOND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "general_armor"))), 2, 0 ));

    public static final RegistryEntry<ArmorMaterial> AQUILIFER_ARMOR_MATERIAL = registerArmorMaterial("aquilifer_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.IRON_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "aquilifer_armor"))), 0, 0 ));

    public static final RegistryEntry<ArmorMaterial> CENTURION_ARMOR_MATERIAL = registerArmorMaterial("centurion_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.DIAMOND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "centurion_armor"))), 2, 0 ));

    public static final RegistryEntry<ArmorMaterial> ROMANELITE_ARMOR_MATERIAL = registerArmorMaterial("romanelite_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.IRON_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "romanelite_armor"))), 3, 1 ));

    public static final RegistryEntry<ArmorMaterial> EMPEROR_ARMOR_MATERIAL = registerArmorMaterial("emperor_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Ingredient.ofItems(Items.GOLD_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "emperor_armor"))), 3, 1 ));

    public static final RegistryEntry<ArmorMaterial> GAUL_ARMOR_MATERIAL = registerArmorMaterial("gaul_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.IRON_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "gaul_armor"))), 0, 0 ));

    public static final RegistryEntry<ArmorMaterial> CHIEF_ARMOR_MATERIAL = registerArmorMaterial("chief_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.GOLD_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RomeMod.MOD_ID, "chief_armor"))), 2, 0 ));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(RomeMod.MOD_ID, name), material.get());
    }

}

