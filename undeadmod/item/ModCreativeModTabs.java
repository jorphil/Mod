package net.diverginglensestudios.undeadmod.item;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UndeadMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOSSIL.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FOSSIL.get());
                        pOutput.accept(ModItems.RARE_FOSSIL.get());
                        pOutput.accept(ModItems.RAW_FOSSIL.get());
                        pOutput.accept(ModItems.RAW_DEEPSLATE_FOSSIL.get());
                        pOutput.accept(ModItems.METATORBERNITE.get());

                        //pOutput.accept(ModItems.METAL_DETECTOR.get());

                        //pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.FOSSILIZED_DRUMSTICK.get());
                        pOutput.accept(ModItems.THE_FOSSILS_EYE.get());
                        //pOutput.accept(ModItems.FOSSIL_STAFF.get());

                        pOutput.accept(ModItems.FOSSIL_SWORD.get());
                        pOutput.accept(ModItems.FOSSIL_PICKAXE.get());
                        pOutput.accept(ModItems.FOSSIL_AXE.get());
                        pOutput.accept(ModItems.FOSSIL_SHOVEL.get());
                        pOutput.accept(ModItems.FOSSIL_HOE.get());

                        pOutput.accept(ModItems.FOSSIL_HELMET.get());
                        pOutput.accept(ModItems.FOSSIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.FOSSIL_LEGGINGS.get());
                        pOutput.accept(ModItems.FOSSIL_BOOTS.get());

                        pOutput.accept(ModItems.RARE_FOSSIL_HELMET.get());
                        pOutput.accept(ModItems.RARE_FOSSIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.RARE_FOSSIL_LEGGINGS.get());
                        pOutput.accept(ModItems.RARE_FOSSIL_BOOTS.get());

                        //pOutput.accept(ModItems.STRAWBERRY_SEEDS.get());

                        //pOutput.accept(ModItems.CORN.get());
                        //pOutput.accept(ModItems.CORN_SEEDS.get());

                        //pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.UNDEADARCHEOLOGIST_SPANW_EGG.get());

                        pOutput.accept(ModItems.ASH_SIGN.get());
                        pOutput.accept(ModItems.ASH_HANGING_SIGN.get());

                        pOutput.accept(ModItems.ASH_BOAT.get());
                        pOutput.accept(ModItems.ASH_CHEST_BOAT.get());

                        //pOutput.accept(ModItems.DICE.get());

                        pOutput.accept(ModBlocks.FOSSIL_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_FOSSIL_BLOCK.get());

                        pOutput.accept(ModBlocks.FOSSIL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FOSSIL_ORE.get());

                        pOutput.accept(ModBlocks.METATORBERNITE_ORE.get());

                        //pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.FOSSIL_STAIRS.get());
                        pOutput.accept(ModBlocks.FOSSIL_SLAB.get());
                        pOutput.accept(ModBlocks.FOSSIL_BUTTON.get());
                        pOutput.accept(ModBlocks.FOSSIL_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.FOSSIL_FENCE.get());
                        pOutput.accept(ModBlocks.FOSSIL_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.FOSSIL_WALL.get());

                        pOutput.accept(ModBlocks.FOSSIL_DOOR.get());
                        pOutput.accept(ModBlocks.FOSSIL_TRAPDOOR.get());

                        //pOutput.accept(ModBlocks.CATMINT.get());
                        pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get());
                        pOutput.accept(ModBlocks.FOSSIL_LUCKY_BLOCK.get());
                        
                        pOutput.accept(ModItems.ASH_SAPLING_ITEM.get());

                        pOutput.accept(ModBlocks.ASH_LOG.get());
                        pOutput.accept(ModBlocks.ASH_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ASH_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_ASH_WOOD.get());

                        pOutput.accept(ModBlocks.ASH_PLANKS.get());
                        pOutput.accept(ModBlocks.ASH_LEAVES.get());

                        pOutput.accept(ModBlocks.ASH_STAIRS.get());
                        pOutput.accept(ModBlocks.ASH_SLAB.get());
                        pOutput.accept(ModBlocks.ASH_BUTTON.get());
                        pOutput.accept(ModBlocks.ASH_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.ASH_FENCE.get());
                        pOutput.accept(ModBlocks.ASH_FENCE_GATE.get());

                        pOutput.accept(ModBlocks.ASH_DOOR.get());
                        pOutput.accept(ModBlocks.ASH_TRAPDOOR.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
