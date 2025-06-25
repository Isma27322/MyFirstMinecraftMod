package com.isma2732.tutorialmod;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(tutorialmod.MODID);

    // --- TEMPLATE ITEMS ---
    public static final Supplier<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block",
            () -> new BlockItem(ModBlocks.EXAMPLE_BLOCK.get(), new Item.Properties()));

    public static final Supplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEdible().nutrition(1).saturationModifier(2f).build())));

    // --- SAPPHIRE ITEMS ---
    public static final Supplier<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final Supplier<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block",
            () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties()));

    public static final Supplier<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(Tiers.DIAMOND, 1.0f, -2.8f))));

    // --- MUSIC DISK (with the corrected class name) ---
    // In ModItems.java
    public static final Supplier<Item> MUSIC_DISK_AINT_THAT_SOME = ITEMS.register(
            "music_disk_aint_that_some",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
                    .component( // This is the key part
                            DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(ModSounds.AINT_THAT_SOME_JUKEBOX_SONG)
                    )
            )
    );
}