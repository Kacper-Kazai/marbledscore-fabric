package dev.kazai.marbledsapi;

import dev.kazai.marbledsapi.block.MarbledsAPIBlocks;
import dev.kazai.marbledsapi.item.MarbledsAPICreativeModeTabs;
import dev.kazai.marbledsapi.item.MarbledsAPIItems;
import net.fabricmc.api.ModInitializer;

public class MarbledsAPI implements ModInitializer {
	public static final String MODID = "marbledsapi";

	@Override
	public void onInitialize() {
		MarbledsAPIBlocks.register();
		MarbledsAPIItems.register();
		MarbledsAPICreativeModeTabs.register();
	}
}