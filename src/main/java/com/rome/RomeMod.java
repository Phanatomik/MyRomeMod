package com.rome;

import com.rome.item.ModItemGroups;
import com.rome.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.fabricmc.api.ModInitializer;
import com.rome.effect.ModEffects;
import com.rome.event.AttackEventHandler;

public class RomeMod implements ModInitializer {
	public static final String MOD_ID = "rome";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
        ModEffects.registerEffects();
        AttackEventHandler.register();
	}
}
