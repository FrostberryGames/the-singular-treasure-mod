package net.frostberrynstuff.singulartreasure;

import net.fabricmc.api.ModInitializer;

import net.frostberrynstuff.singulartreasure.block.ModBlocks;
import net.frostberrynstuff.singulartreasure.item.ModItemGroups;
import net.frostberrynstuff.singulartreasure.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingularTreasure implements ModInitializer {
	public static final String MOD_ID = "singulartreasure";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}