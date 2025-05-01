package net.huntersteward.mithrilmod;

import net.fabricmc.api.ModInitializer;

import net.huntersteward.mithrilmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MithrilMod implements ModInitializer {
	public static final String MOD_ID = "mithrilmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}