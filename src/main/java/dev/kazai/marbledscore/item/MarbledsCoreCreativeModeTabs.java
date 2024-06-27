package dev.kazai.marbledscore.item;

import dev.kazai.marbledscore.MarbledsCore;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class MarbledsCoreCreativeModeTabs {
    public static final CreativeModeTab MARBLEDS_API = registerCreativeModeTab(MarbledsCore.MODID,
            FabricItemGroup.builder()
                .title(Component.translatable("itemGroup.marbledsCore"))
                .icon(MarbledsCoreItems.STEEL_INGOT::getDefaultInstance)
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MarbledsCoreItems.STEEL_BLOCK);
                        output.accept(MarbledsCoreItems.STEEL_INGOT);
                        output.accept(MarbledsCoreItems.STEEL_SHEET);
                        output.accept(MarbledsCoreItems.RAW_STEEL);
                        output.accept(MarbledsCoreItems.HARDENED_STEEL_INGOT);
                        output.accept(MarbledsCoreItems.HARDENED_STEEL_SHEET);
                        output.accept(MarbledsCoreItems.RUBBER);
                    })
                .build()
    );

    public static CreativeModeTab registerCreativeModeTab(String name, CreativeModeTab creativeModeTab) {
        return registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(MarbledsCore.MODID, name), creativeModeTab);
    }

    public static CreativeModeTab registerCreativeModeTab(ResourceLocation location, CreativeModeTab creativeModeTab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, location, creativeModeTab);
    }

    public static void register(){

    }
}
