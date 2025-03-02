package net.diverginglensestudios.undeadmod.item;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
        public static final Tier FOSSIL = TierSortingRegistry.registerTier(
                new ForgeTier(5, 1500, 5f, 4f, 25,
                        ModTags.Blocks.NEEDS_FOSSIL_TOOL, () -> Ingredient.of(ModItems.FOSSIL.get())),
                new ResourceLocation(UndeadMod.MOD_ID, "fossil"), List.of(Tiers.IRON), List.of());
        public static final Tier RARE_FOSSIL = TierSortingRegistry.registerTier(
                new ForgeTier(5, 1500, 5f, 4f, 25,
                        ModTags.Blocks.NEEDS_FOSSIL_TOOL, () -> Ingredient.of(ModItems.RARE_FOSSIL.get())),
                new ResourceLocation(UndeadMod.MOD_ID, "rare_fossil"), List.of(Tiers.NETHERITE), List.of());

}
