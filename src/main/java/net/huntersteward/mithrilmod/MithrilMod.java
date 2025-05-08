package net.huntersteward.mithrilmod;

import net.fabricmc.api.ModInitializer;

import net.huntersteward.mithrilmod.block.ModBlocks;
import net.huntersteward.mithrilmod.item.ModItemGroups;
import net.huntersteward.mithrilmod.item.ModItems;
import net.huntersteward.mithrilmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MithrilMod implements ModInitializer {
	public static final String MOD_ID = "mithrilmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}