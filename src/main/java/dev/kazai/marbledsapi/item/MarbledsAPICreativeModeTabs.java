package dev.kazai.marbledsapi.item;

import dev.kazai.marbledsapi.MarbledsAPI;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class MarbledsAPICreativeModeTabs {
    public static final CreativeModeTab MARBLEDS_API = registerCreativeModeTab("marbleds_api",
            FabricItemGroup.builder()
                .title(Component.translatable("itemGroup.marbledsAPI"))
                .icon(MarbledsAPIItems.STEEL_INGOT::getDefaultInstance)
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MarbledsAPIItems.STEEL_BLOCK);
                        output.accept(MarbledsAPIItems.STEEL_INGOT);
                        output.accept(MarbledsAPIItems.STEEL_SHEET);
                        output.accept(MarbledsAPIItems.RAW_STEEL);
                        output.accept(MarbledsAPIItems.HARDENED_STEEL_INGOT);
                        output.accept(MarbledsAPIItems.HARDENED_STEEL_SHEET);
                        output.accept(MarbledsAPIItems.RUBBER);
                    })
                .build()
    );

    public static CreativeModeTab registerCreativeModeTab(String name, CreativeModeTab creativeModeTab) {
        return registerCreativeModeTab(new ResourceLocation(MarbledsAPI.MODID, name), creativeModeTab);
    }

    public static CreativeModeTab registerCreativeModeTab(ResourceLocation location, CreativeModeTab creativeModeTab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, location, creativeModeTab);
    }

    public static void register(){

    }
}
