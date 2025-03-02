package net.diverginglensestudios.undeadmod.datagen.loot;

import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.block.custom.CornCropBlock;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {


        this.add(ModBlocks.FOSSIL_ORE.get(),
                block -> createFossilLikeOreDrops(ModBlocks.FOSSIL_ORE.get(), ModItems.RAW_FOSSIL.get(), ModItems.RARE_FOSSIL.get()));

        this.add(ModBlocks.METATORBERNITE_ORE.get(),
        block -> createMetatorberniteLikeOreDrops(ModBlocks.METATORBERNITE_ORE.get(), ModItems.METATORBERNITE.get()));
        
        this.add(ModBlocks.DEEPSLATE_FOSSIL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_FOSSIL_ORE.get(), ModItems.RAW_FOSSIL.get()));

        this.dropSelf(ModBlocks.FOSSIL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FOSSIL_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.FOSSIL_STAIRS.get());
        this.dropSelf(ModBlocks.FOSSIL_BUTTON.get());
        this.dropSelf(ModBlocks.FOSSIL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FOSSIL_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FOSSIL_FENCE.get());
        this.dropSelf(ModBlocks.FOSSIL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FOSSIL_WALL.get());
        this.dropSelf(ModBlocks.ASH_STAIRS.get());
        this.dropSelf(ModBlocks.ASH_BUTTON.get());
        this.dropSelf(ModBlocks.ASH_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ASH_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ASH_FENCE.get());
        this.dropSelf(ModBlocks.ASH_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FOSSIL_LUCKY_BLOCK.get());
        this.dropSelf(ModBlocks.ASH_SAPLING.get());


        this.add(ModBlocks.FOSSIL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FOSSIL_SLAB.get()));
        this.add(ModBlocks.FOSSIL_DOOR.get(),
                block -> createDoorTable(ModBlocks.FOSSIL_DOOR.get()));
        
        this.add(ModBlocks.ASH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ASH_SLAB.get()));
        this.add(ModBlocks.ASH_DOOR.get(),
                block -> createDoorTable(ModBlocks.ASH_DOOR.get()));


        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 7))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8)));

        // LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
        //         .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //         .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8));

        this.add(ModBlocks.CORN_CROP.get(), createCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN.get(),
                ModItems.CORN_SEEDS.get(), lootitemcondition$builder2));

        this.dropSelf(ModBlocks.CATMINT.get());
        this.add(ModBlocks.POTTED_CATMINT.get(), createPotFlowerItemTable(ModBlocks.CATMINT.get()));

        this.dropSelf(ModBlocks.GEM_POLISHING_STATION.get());

        this.dropSelf(ModBlocks.ASH_LOG.get());
        this.dropSelf(ModBlocks.ASH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ASH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ASH_WOOD.get());
        this.dropSelf(ModBlocks.ASH_PLANKS.get());

        this.add(ModBlocks.ASH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ASH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!

        this.add(ModBlocks.ASH_SIGN.get(), block ->
                createSingleItemTable(ModItems.ASH_SIGN.get()));
        this.add(ModBlocks.ASH_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.ASH_SIGN.get()));
        this.add(ModBlocks.ASH_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ASH_HANGING_SIGN.get()));
        this.add(ModBlocks.ASH_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ASH_HANGING_SIGN.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createMetatorberniteLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    
    }
    protected LootTable.Builder createFossilLikeOreDrops(Block pBlock, Item item, Item seconditem) {
        return LootTable.lootTable()
            .withPool(LootPool.lootPool() // Regular fossil drop
                    .setRolls(UniformGenerator.between(1.0F, 1.0F))
                    .add(LootItem.lootTableItem(item)
                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                            .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    )
            )
            .withPool(LootPool.lootPool() // Rare fossil drop (1 in 5 chance)
                    .setRolls(UniformGenerator.between(1.0F, 1.0F))
                    .add(LootItem.lootTableItem(seconditem)
                            .when(LootItemRandomChanceCondition.randomChance(0.2F)) // 20% chance
                    ));
}

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
