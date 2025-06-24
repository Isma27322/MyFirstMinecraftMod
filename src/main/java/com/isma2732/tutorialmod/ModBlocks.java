package com.isma2732.tutorialmod;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(tutorialmod.MODID);

    // From your template
    public static final Supplier<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));

    // Your Sapphire Block
    public static final Supplier<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .strength(5.0f, 6.0f).requiresCorrectToolForDrops()));
}