package net.diverginglensestudios.undeadmod.datagen;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, UndeadMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
        .add(ModItems.FOSSIL_HELMET.get(),
        ModItems.FOSSIL_CHESTPLATE.get(),
        ModItems.FOSSIL_LEGGINGS.get(),
        ModItems.FOSSIL_BOOTS.get())
        .add(ModItems.RARE_FOSSIL_HELMET.get(),
        ModItems.RARE_FOSSIL_CHESTPLATE.get(),
        ModItems.RARE_FOSSIL_LEGGINGS.get(),
        ModItems.RARE_FOSSIL_BOOTS.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());

        this.tag(ItemTags.BOATS)
                .add(ModItems.ASH_BOAT.get())
                .add(ModItems.ASH_CHEST_BOAT.get());

        this.tag(ItemTags.CHEST_BOATS)
                .add(ModItems.ASH_CHEST_BOAT.get());

                this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());

        this.tag(ItemTags.TOOLS)
                .add(ModItems.FOSSIL_SHOVEL.get())
                .add(ModItems.FOSSIL_PICKAXE.get())
                .add(ModItems.FOSSIL_AXE.get())
                .add(ModItems.FOSSIL_HOE.get())
                .add(ModItems.FOSSIL_SWORD.get());

        this.tag(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.FOSSIL_SHOVEL.get())
                .add(ModItems.FOSSIL_PICKAXE.get())
                .add(ModItems.FOSSIL_AXE.get())
                .add(ModItems.FOSSIL_HOE.get())
                .add(ModItems.FOSSIL_SWORD.get());

        this.tag(ItemTags.SHOVELS)
                .add(ModItems.FOSSIL_SHOVEL.get());

        this.tag(ItemTags.PICKAXES)
                .add(ModItems.FOSSIL_PICKAXE.get());
        
        this.tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.FOSSIL_PICKAXE.get());

        this.tag(ItemTags.AXES)
                .add(ModItems.FOSSIL_AXE.get());

        this.tag(ItemTags.HOES)
                .add(ModItems.FOSSIL_HOE.get());

        this.tag(ItemTags.SWORDS)
                .add(ModItems.FOSSIL_SWORD.get());
        

        this.tag(ItemTags.LOGS_THAT_BURN)
        .add(ModBlocks.ASH_LOG.get().asItem())
        .add(ModBlocks.ASH_WOOD.get().asItem())
        .add(ModBlocks.STRIPPED_ASH_LOG.get().asItem())
        .add(ModBlocks.STRIPPED_ASH_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
        .add(ModBlocks.ASH_PLANKS.get().asItem());

        this.tag(ItemTags.LEAVES)
        .add(ModBlocks.ASH_LEAVES.get().asItem());

        this.tag(ItemTags.COMPLETES_FIND_TREE_TUTORIAL)
        .add(ModBlocks.ASH_LEAVES.get().asItem());

        this.tag(ItemTags.SIGNS)
        .add(ModBlocks.ASH_SIGN.get().asItem());

        this.tag(ItemTags.HANGING_SIGNS)
        .add(ModBlocks.ASH_HANGING_SIGN.get().asItem());

        this.tag(ItemTags.STAIRS)
        .add(ModBlocks.FOSSIL_STAIRS.get().asItem())
        .add(ModBlocks.ASH_STAIRS.get().asItem());

        this.tag(ItemTags.SLABS)
        .add(ModBlocks.FOSSIL_SLAB.get().asItem())
        .add(ModBlocks.ASH_SLAB.get().asItem());

        this.tag(ItemTags.BUTTONS)
        .add(ModBlocks.FOSSIL_BUTTON.get().asItem())
        .add(ModBlocks.ASH_BUTTON.get().asItem());

        this.tag(ItemTags.FENCES)
        .add(ModBlocks.FOSSIL_FENCE.get().asItem())
        .add(ModBlocks.ASH_FENCE.get().asItem());

        this.tag(ItemTags.FENCE_GATES)
        .add(ModBlocks.FOSSIL_FENCE_GATE.get().asItem())
        .add(ModBlocks.ASH_FENCE_GATE.get().asItem());

        this.tag(ItemTags.DOORS)
        .add(ModBlocks.FOSSIL_DOOR.get().asItem())
        .add(ModBlocks.ASH_DOOR.get().asItem());

        this.tag(ItemTags.TRAPDOORS)
        .add(ModBlocks.FOSSIL_TRAPDOOR.get().asItem())
        .add(ModBlocks.ASH_TRAPDOOR.get().asItem());

        this.tag(ItemTags.WALLS)
        .add(ModBlocks.FOSSIL_WALL.get().asItem());


//Custom Forge Tags
this.tag(ItemTags.create(new ResourceLocation("forge", "raw_fossil")))
.add(ModItems.RAW_FOSSIL.get())
.add(ModItems.RAW_DEEPSLATE_FOSSIL.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "fossil")))
.add(ModItems.FOSSIL.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "raw_materials")))
.add(ModItems.RAW_DEEPSLATE_FOSSIL.get())
.add(ModItems.RAW_FOSSIL.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "raw_materials/fossil")))
.add(ModItems.RAW_DEEPSLATE_FOSSIL.get())
.add(ModItems.RAW_FOSSIL.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "armors")))
.add(ModItems.FOSSIL_HELMET.get(),
        ModItems.FOSSIL_CHESTPLATE.get(),
        ModItems.FOSSIL_LEGGINGS.get(),
        ModItems.FOSSIL_BOOTS.get())
.add(ModItems.RARE_FOSSIL_HELMET.get(),
        ModItems.RARE_FOSSIL_CHESTPLATE.get(),
        ModItems.RARE_FOSSIL_LEGGINGS.get(),
        ModItems.RARE_FOSSIL_BOOTS.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "armors/helmets")))
.add(ModItems.FOSSIL_HELMET.get())
.add(ModItems.RARE_FOSSIL_HELMET.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "armors/chestplate")))
.add(ModItems.FOSSIL_CHESTPLATE.get())
.add(ModItems.RARE_FOSSIL_CHESTPLATE.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "armors/leggings")))
.add(ModItems.FOSSIL_LEGGINGS.get())
.add(ModItems.RARE_FOSSIL_LEGGINGS.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "armors/boots")))
.add(ModItems.FOSSIL_BOOTS.get())
.add(ModItems.RARE_FOSSIL_BOOTS.get());

this.tag(ItemTags.create(new ResourceLocation("forge", "storage_blocks")))
.add(ModBlocks.FOSSIL_BLOCK.get().asItem())
.add(ModBlocks.RAW_FOSSIL_BLOCK.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_fossil")))
.add(ModBlocks.RAW_FOSSIL_BLOCK.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "storage_blocks/fossil")))
.add(ModBlocks.FOSSIL_BLOCK.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "ores_in_ground/stone")))
.add(ModBlocks.FOSSIL_ORE.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "ores_in_ground/deepslate")))
.add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "ore_rates/singular")))
.add(ModBlocks.FOSSIL_ORE.get().asItem())
.add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "ores/fossil")))
.add(ModBlocks.FOSSIL_ORE.get().asItem())
.add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get().asItem());

this.tag(ItemTags.create(new ResourceLocation("forge", "ores")))
.add(ModBlocks.FOSSIL_ORE.get().asItem())
.add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get().asItem());

//Custom Minecraft Tags

this.tag(ItemTags.create(new ResourceLocation("minecraft", "fossil_ores")))
.add(ModBlocks.FOSSIL_ORE.get().asItem())
.add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get().asItem());

}}
