package net.diverginglensestudios.undeadmod.block;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.custom.*;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.diverginglensestudios.undeadmod.sound.ModSounds;
import net.diverginglensestudios.undeadmod.util.ModWoodTypes;
import net.diverginglensestudios.undeadmod.worldgen.tree.AshTreeGrower;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, UndeadMod.MOD_ID);

//Normal Blocks
public static final RegistryObject<Block> FOSSIL_BLOCK = registerBlock("fossil_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.BONE_BLOCK)));

public static final RegistryObject<Block> RAW_FOSSIL_BLOCK = registerBlock("raw_fossil_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.BONE_BLOCK)));


public static final RegistryObject<Block> FOSSIL_ORE = registerBlock("fossil_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

public static final RegistryObject<Block> DEEPSLATE_FOSSIL_ORE = registerBlock("deepslate_fossil_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

public static final RegistryObject<Block> METATORBERNITE_ORE = registerBlock("metatorbernite_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(2, 4)));

//Advanced Blocks
public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
        () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(ModSounds.SOUND_BLOCK_SOUNDS)));

public static final RegistryObject<Block> GEM_POLISHING_STATION = registerBlock("gem_polishing_station",
        () -> new GemPolishingStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

public static final RegistryObject<Block> DICE_BLOCK = BLOCKS.register("dice_block",
        () -> new DiceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noLootTable()));

        public static final RegistryObject<Block> FOSSIL_LUCKY_BLOCK = registerBlock("fossil_lucky_block",
        () -> new FossilLuckyBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.BONE_BLOCK)));



//Differenty shaped blocks
public static final RegistryObject<Block> FOSSIL_STAIRS = registerBlock("fossil_stairs",
        () -> new StairBlock(() -> ModBlocks.FOSSIL_BLOCK.get().defaultBlockState(),
                BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.BONE_BLOCK)));

public static final RegistryObject<Block> FOSSIL_SLAB = registerBlock("fossil_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.BONE_BLOCK)));

public static final RegistryObject<Block> FOSSIL_BUTTON = registerBlock("fossil_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.BONE_BLOCK),
                BlockSetType.IRON, 10, true));

public static final RegistryObject<Block> FOSSIL_PRESSURE_PLATE = registerBlock("fossil_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST),
                BlockSetType.IRON));

public static final RegistryObject<Block> FOSSIL_FENCE = registerBlock("fossil_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

public static final RegistryObject<Block> FOSSIL_FENCE_GATE = registerBlock("fossil_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
public static final RegistryObject<Block> FOSSIL_WALL = registerBlock("fossil_wall",
        () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

public static final RegistryObject<Block> FOSSIL_DOOR = registerBlock("fossil_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));

public static final RegistryObject<Block> FOSSIL_TRAPDOOR = registerBlock("fossil_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));


//Crops

        public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop",
        () -> new CornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

//Saplings
public static final RegistryObject<Block> ASH_SAPLING = BLOCKS.register("ash_sapling",
        () -> new SaplingBlock(new AshTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion().noCollission()));


//Flowers/Plants
public static final RegistryObject<Block> CATMINT = registerBlock("catmint",
        () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));

public static final RegistryObject<Block> POTTED_CATMINT = BLOCKS.register("potted_catmint",
        () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CATMINT,
                BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));


//Wood
public static final RegistryObject<Block> ASH_LOG = registerBlock("ash_log",
        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
        
public static final RegistryObject<Block> ASH_WOOD = registerBlock("ash_wood",
        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));

public static final RegistryObject<Block> STRIPPED_ASH_LOG = registerBlock("stripped_ash_log",
        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));

public static final RegistryObject<Block> STRIPPED_ASH_WOOD = registerBlock("stripped_ash_wood",
        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

public static final RegistryObject<Block> ASH_PLANKS = registerBlock("ash_planks",
        () -> new ModPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS),20,5));

public static final RegistryObject<Block> ASH_LEAVES = registerBlock("ash_leaves",
        () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES),60,30));

public static final RegistryObject<Block> ASH_SIGN = BLOCKS.register("ash_sign",
        () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ASH));


//Differently Shaped Wood
public static final RegistryObject<Block> ASH_WALL_SIGN = BLOCKS.register("ash_wall_sign",
        () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ASH));

public static final RegistryObject<Block> ASH_HANGING_SIGN = BLOCKS.register("ash_hanging_sign",
        () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ASH));

public static final RegistryObject<Block> ASH_WALL_HANGING_SIGN = BLOCKS.register("ash_wall_hanging_sign",
        () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ASH));

public static final RegistryObject<Block> ASH_STAIRS = registerBlock("ash_stairs",
        () -> new ModFlammableStairBlock(() -> ModBlocks.ASH_PLANKS.get().defaultBlockState(),
                BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD),20,5));

public static final RegistryObject<Block> ASH_SLAB = registerBlock("ash_slab",
        () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD),20,5));

public static final RegistryObject<Block> ASH_BUTTON = registerBlock("ash_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                BlockSetType.OAK, 10, true));

public static final RegistryObject<Block> ASH_PRESSURE_PLATE = registerBlock("ash_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)
        .sound(SoundType.WOOD),BlockSetType.OAK));

public static final RegistryObject<Block> ASH_FENCE = registerBlock("ash_fence",
        () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD),20,5));

public static final RegistryObject<Block> ASH_FENCE_GATE = registerBlock("ash_fence_gate",
        () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE,20,5));

public static final RegistryObject<Block> ASH_DOOR = registerBlock("ash_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));

public static final RegistryObject<Block> ASH_TRAPDOOR = registerBlock("ash_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));



private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
RegistryObject<T> toReturn = BLOCKS.register(name, block);
registerBlockItem(name, toReturn);
return toReturn;
}
private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
}
public static void register(IEventBus eventBus) {
BLOCKS.register(eventBus);
}
}
