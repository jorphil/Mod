package net.diverginglensestudios.undeadmod.datagen;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.diverginglensestudios.undeadmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, UndeadMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //METAL_DETECTOR_VALUABLES
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.FOSSIL_ORE.get()).addTag(Tags.Blocks.ORES);

        //MINEABLE_WITH_PICKAXE
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FOSSIL_BLOCK.get(),
                        ModBlocks.RAW_FOSSIL_BLOCK.get(),
                        ModBlocks.FOSSIL_ORE.get(),
                        ModBlocks.DEEPSLATE_FOSSIL_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.METATORBERNITE_ORE.get());


        //NEEDS_IRON_TOOL
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_FOSSIL_BLOCK.get())
                .add(ModBlocks.METATORBERNITE_ORE.get());

        //NEEDS_FOSSIL_TOOL
        this.tag(ModTags.Blocks.NEEDS_FOSSIL_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());


        //LOGS_THAT_BURN
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ASH_LOG.get())
                .add(ModBlocks.ASH_WOOD.get())
                .add(ModBlocks.STRIPPED_ASH_LOG.get())
                .add(ModBlocks.STRIPPED_ASH_WOOD.get());

        //LOGS
        this.tag(BlockTags.LOGS)
        .add(ModBlocks.ASH_LOG.get())
        .add(ModBlocks.ASH_WOOD.get())
        .add(ModBlocks.STRIPPED_ASH_LOG.get())
        .add(ModBlocks.STRIPPED_ASH_WOOD.get());

        //PLANKS
        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ASH_PLANKS.get());

        //STAIRS
        this.tag(BlockTags.STAIRS)
        .add(ModBlocks.ASH_STAIRS.get())
        .add(ModBlocks.FOSSIL_STAIRS.get());

        //SLABS
        this.tag(BlockTags.SLABS)
        .add(ModBlocks.ASH_SLAB.get())
        .add(ModBlocks.FOSSIL_SLAB.get());

        //FENCES
        this.tag(BlockTags.FENCES)
        .add(ModBlocks.ASH_FENCE.get())
        .add(ModBlocks.FOSSIL_FENCE.get());

        //FENCE_GATES
        this.tag(BlockTags.FENCE_GATES)
        .add(ModBlocks.ASH_FENCE_GATE.get())
        .add(ModBlocks.FOSSIL_FENCE_GATE.get());

        //BUTTONS
        this.tag(BlockTags.BUTTONS)
        .add(ModBlocks.ASH_BUTTON.get())
        .add(ModBlocks.FOSSIL_BUTTON.get());

        //DOORS
        this.tag(BlockTags.DOORS)
        .add(ModBlocks.ASH_DOOR.get())
        .add(ModBlocks.FOSSIL_DOOR.get());

        //WALLS
        this.tag(BlockTags.WALLS)
        .add(ModBlocks.FOSSIL_WALL.get());

        //TRAPDOORS
        this.tag(BlockTags.TRAPDOORS)
        .add(ModBlocks.ASH_TRAPDOOR.get())
        .add(ModBlocks.FOSSIL_TRAPDOOR.get());
        
        //ALL_HANGING_SIGNS
        this.tag(BlockTags.ALL_HANGING_SIGNS)
        .add(ModBlocks.ASH_HANGING_SIGN.get());

        //SIGNS
        this.tag(BlockTags.SIGNS)
        .add(ModBlocks.ASH_SIGN.get());


        //LEAVES
        this.tag(BlockTags.LEAVES)
        .add(ModBlocks.ASH_LEAVES.get());

        //ORES
        this.tag(Tags.Blocks.ORES)
                .add(ModBlocks.FOSSIL_ORE.get());

        //ORES
        this.tag(Tags.Blocks.STORAGE_BLOCKS)
        .add(ModBlocks.FOSSIL_ORE.get())
        .add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get())
        .add(ModBlocks.METATORBERNITE_ORE.get());

//CUSTOM FORGE TAGS

this.tag(BlockTags.create(new ResourceLocation("forge", "storage_blocks")))
.add(ModBlocks.FOSSIL_BLOCK.get());

this.tag(BlockTags.create(new ResourceLocation("forge", "storage_blocks/fossil")))
.add(ModBlocks.FOSSIL_BLOCK.get());

this.tag(BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_fossil")))
.add(ModBlocks.RAW_FOSSIL_BLOCK.get());

//CUSTOM MINECRAFT TAGS

this.tag(BlockTags.create(new ResourceLocation("minecraft", "ash_logs")))
.add(ModBlocks.STRIPPED_ASH_WOOD.get());

}}
