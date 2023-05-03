package net.wilson.gemweapons;

import net.fabricmc.api.ModInitializer;
import net.wilson.gemweapons.block.ModBlocks;
import net.wilson.gemweapons.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemWeapons implements ModInitializer {
	public static final String MOD_ID = "gemweapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Moditems.registerModitems();
		ModBlocks.registerModBlocks();
	}
}
