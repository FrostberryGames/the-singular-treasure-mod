package net.frostberrynstuff.singulartreasure;

import net.fabricmc.api.ModInitializer;

import net.frostberrynstuff.singulartreasure.block.ModBlocks;
import net.frostberrynstuff.singulartreasure.item.ModItemGroups;
import net.frostberrynstuff.singulartreasure.item.ModItems;
import net.frostberrynstuff.singulartreasure.networking.ModPackets;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingularTreasure implements ModInitializer {
	public static final String MOD_ID = "singulartreasure";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//Identifiers

	public static final Identifier INITIAL_SYNC = new Identifier(MOD_ID, "initial_sync");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModPackets.registerC2SPackets();
	}
}