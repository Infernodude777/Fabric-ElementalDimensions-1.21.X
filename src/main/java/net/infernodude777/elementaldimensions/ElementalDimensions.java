package net.infernodude777.elementaldimensions;

import net.fabricmc.api.ModInitializer;

import net.infernodude777.elementaldimensions.block.ModBlocks;
import net.infernodude777.elementaldimensions.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalDimensions implements ModInitializer {
	public static final String MOD_ID = "elementaldimensions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}