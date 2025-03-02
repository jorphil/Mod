package net.diverginglensestudios.undeadmod.datagen;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> FOSSIL_SMELTABLES = List.of(
        ModItems.RAW_FOSSIL.get(),
        ModItems.RAW_DEEPSLATE_FOSSIL.get());
    private static final List<ItemLike> FOSSIL_BLOCK_SMELTABLES = List.of(
            ModBlocks.RAW_FOSSIL_BLOCK.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, FOSSIL_SMELTABLES, RecipeCategory.MISC, ModItems.FOSSIL.get(), 0.25f, 200, "fossil");
        oreBlasting(pWriter, FOSSIL_SMELTABLES, RecipeCategory.MISC, ModItems.FOSSIL.get(), 0.25f, 100, "fossil");
        oreSmelting(pWriter, FOSSIL_BLOCK_SMELTABLES, RecipeCategory.MISC, ModItems.FOSSIL.get(), 2.5f, 2000, "fossil");
        oreBlasting(pWriter, FOSSIL_BLOCK_SMELTABLES, RecipeCategory.MISC, ModItems.FOSSIL.get(), 2.5f, 1000, "fossil");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FOSSIL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_FOSSIL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "raw_fossil")))) 
                .unlockedBy(getHasName(ModItems.RARE_FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "raw_fossil"))))
                .save(pWriter);
        

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_BOOTS.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FOSSIL_LUCKY_BLOCK.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.RARE_FOSSIL.get())
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ModItems.FOSSIL.get()))
                .define('A', Items.RABBIT_FOOT)
                .unlockedBy(getHasName(Items.RABBIT_FOOT), has(ModItems.RARE_FOSSIL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" A ")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil"))))
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_AXE.get())
                .pattern("SS ")
                .pattern("SA ")
                .pattern(" A ")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil"))))
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FOSSIL_SHOVEL.get())
                .pattern(" S ")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', Ingredient.of(ItemTags.create(new ResourceLocation("forge", "fossil"))))
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.FOSSIL.get()), has(ItemTags.create(new ResourceLocation("forge", "fossil")))) 
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FOSSIL.get(), 9)
                .requires(ModBlocks.FOSSIL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.FOSSIL_BLOCK.get()), has(ModBlocks.FOSSIL_BLOCK.get()))
                .save(pWriter);
}



protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
}

protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
}

protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                pExperience, pCookingTime, pCookingSerializer)
                .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                .save(pFinishedRecipeConsumer,  UndeadMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
}
}
