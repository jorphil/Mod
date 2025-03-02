package net.diverginglensestudios.undeadmod.datagen;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.block.custom.CornCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UndeadMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //BlockWithItem
        blockWithItem(ModBlocks.FOSSIL_BLOCK);
        blockWithItem(ModBlocks.RAW_FOSSIL_BLOCK);
        blockWithItem(ModBlocks.FOSSIL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FOSSIL_ORE);
        blockWithItem(ModBlocks.SOUND_BLOCK);
        blockWithItem(ModBlocks.ASH_PLANKS);
        blockWithItem(ModBlocks.FOSSIL_LUCKY_BLOCK);
        blockWithItem(ModBlocks.METATORBERNITE_ORE);

        //Differently Shaped Blocks
        stairsBlock(((StairBlock) ModBlocks.FOSSIL_STAIRS.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FOSSIL_SLAB.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.FOSSIL_BUTTON.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FOSSIL_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.FOSSIL_FENCE.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FOSSIL_FENCE_GATE.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.FOSSIL_WALL.get()), blockTexture(ModBlocks.FOSSIL_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.FOSSIL_DOOR.get()), modLoc("block/fossil_door_bottom"), modLoc("block/fossil_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FOSSIL_TRAPDOOR.get()), modLoc("block/fossil_trapdoor"), true, "cutout");

        //Crops
        makeCornCrop(((CropBlock) ModBlocks.CORN_CROP.get()), "corn_stage_", "corn_stage_");

        //Saplings
        saplingBlock(ModBlocks.ASH_SAPLING);
        
        //SimpleBlockWithItem
        simpleBlockWithItem(ModBlocks.CATMINT.get(), models().cross(blockTexture(ModBlocks.CATMINT.get()).getPath(),
                blockTexture(ModBlocks.CATMINT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.POTTED_CATMINT.get(), models().singleTexture("potted_catmint", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CATMINT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.GEM_POLISHING_STATION.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/gem_polishing_station")));

        //Wood
        logBlock(((RotatedPillarBlock) ModBlocks.ASH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ASH_WOOD.get()), blockTexture(ModBlocks.ASH_LOG.get()), blockTexture(ModBlocks.ASH_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ASH_LOG.get()), blockTexture(ModBlocks.STRIPPED_ASH_LOG.get()),
                new ResourceLocation(UndeadMod.MOD_ID, "block/stripped_ash_log_top"));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ASH_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ASH_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ASH_LOG.get()));

        leavesBlock(ModBlocks.ASH_LEAVES);
        //BlockItem

        blockItem(ModBlocks.ASH_LOG);
        blockItem(ModBlocks.ASH_WOOD);
        blockItem(ModBlocks.STRIPPED_ASH_LOG);
        blockItem(ModBlocks.STRIPPED_ASH_WOOD);

        
        //DifferentlyShapedWood
        signBlock(((StandingSignBlock) ModBlocks.ASH_SIGN.get()), ((WallSignBlock) ModBlocks.ASH_WALL_SIGN.get()),
                blockTexture(ModBlocks.ASH_PLANKS.get()));

        hangingSignBlock(ModBlocks.ASH_HANGING_SIGN.get(), ModBlocks.ASH_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.ASH_PLANKS.get()));

        stairsBlock(((StairBlock) ModBlocks.ASH_STAIRS.get()), blockTexture(ModBlocks.ASH_PLANKS.get()));

        slabBlock(((SlabBlock) ModBlocks.ASH_SLAB.get()), blockTexture(ModBlocks.ASH_PLANKS.get()), 
                blockTexture(ModBlocks.ASH_PLANKS.get()));
        
        buttonBlock(((ButtonBlock) ModBlocks.ASH_BUTTON.get()), blockTexture(ModBlocks.ASH_PLANKS.get()));

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ASH_PRESSURE_PLATE.get()),
                blockTexture(ModBlocks.ASH_PLANKS.get()));
        
        fenceBlock(((FenceBlock) ModBlocks.ASH_FENCE.get()), blockTexture(ModBlocks.ASH_PLANKS.get()));

        fenceGateBlock(((FenceGateBlock) ModBlocks.ASH_FENCE_GATE.get()), blockTexture(ModBlocks.ASH_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.ASH_DOOR.get()), 
                modLoc("block/ash_door_bottom"),modLoc("block/ash_door_top"), "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ASH_TRAPDOOR.get()), 
                modLoc("block/ash_trapdoor"), true, "cutout");
}

private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
}

public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
}

public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
}

private String name(Block block) {
        return key(block).getPath();
}

private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
}

private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
}

private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(UndeadMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
}




public void makeCornCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cornStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
}

private ConfiguredModel[] cornStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CornCropBlock) block).getAgeProperty()),
                new ResourceLocation(UndeadMod.MOD_ID, "block/" + textureName + state.getValue(((CornCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
}

private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
}
}
