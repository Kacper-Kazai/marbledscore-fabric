package dev.kazai.marbledsapi.block;

import dev.kazai.marbledsapi.MarbledsAPI;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MarbledsAPIBlocks {
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F)));

    public static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MarbledsAPI.MODID, name), block);
    }

    public static void register(){

    }
}
