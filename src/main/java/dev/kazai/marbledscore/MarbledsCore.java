package dev.kazai.marbledscore;

import dev.kazai.marbledscore.block.MarbledsCoreBlocks;
import dev.kazai.marbledscore.item.MarbledsCoreCreativeModeTabs;
import dev.kazai.marbledscore.item.MarbledsCoreItems;
import net.fabricmc.api.ModInitializer;

public class MarbledsCore implements ModInitializer {
	public static final String MODID = "mcore";

	@Override
	public void onInitialize() {
		MarbledsCoreBlocks.register();
		MarbledsCoreItems.register();
		MarbledsCoreCreativeModeTabs.register();
	}
}