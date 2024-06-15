package dev.kazai.marbledsapi.item;

import dev.kazai.marbledsapi.MarbledsAPI;
import dev.kazai.marbledsapi.block.MarbledsAPIBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MarbledsAPIItems {
    public static final Item STEEL_BLOCK = registerBlock(MarbledsAPIBlocks.STEEL_BLOCK);

    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new Item.Properties()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Properties()));
    public static final Item STEEL_SHEET = registerItem("steel_sheet", new Item(new Item.Properties()));
    public static final Item HARDENED_STEEL_INGOT = registerItem("hardened_steel_ingot", new Item(new Item.Properties()));
    public static final Item HARDENED_STEEL_SHEET = registerItem("hardened_steel_sheet", new Item(new Item.Properties()));
    public static final Item RUBBER = registerItem("rubber", new Item(new Item.Properties()));

    public static Item registerItem(String name, Item item) {
        return registerItem(ResourceLocation.fromNamespaceAndPath(MarbledsAPI.MODID, name), item);
    }
    public static Item registerItem(ResourceLocation location, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, location, item);
    }

    public static Item registerBlock(Block block) {
        return registerBlock(new BlockItem(block, new Item.Properties()));
    }
    public static Item registerBlock(BlockItem blockItem) {
        return registerBlock(blockItem.getBlock(), (Item)blockItem);
    }
    public static Item registerBlock(Block block, Item item) {
        return registerItem(BuiltInRegistries.BLOCK.getKey(block).getPath(), item);
    }

    public static void register(){

    }
}
