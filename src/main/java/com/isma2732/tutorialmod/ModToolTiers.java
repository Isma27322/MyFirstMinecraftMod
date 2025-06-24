package com.isma2732.tutorialmod;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier SAPPHIRE = new SimpleTier(
            /* miningLevel */ BlockTags.NEEDS_DIAMOND_TOOL,
            /* durability */ 1750,
            /* miningSpeed */ 9.0f,
            /* attackDamageBonus */ 4.0f,
            /* enchantmentValue */ 15,
            /* repairIngredient */ () -> Ingredient.of(ModItems.SAPPHIRE.get()));
}
