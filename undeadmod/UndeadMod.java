package net.diverginglensestudios.undeadmod; //This line of code specifies what the code is actaully doing, and how it is called

//Import the stuff you need from the core game and from Forge and other Logging tools.
import com.mojang.logging.LogUtils;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

//Import all the subfiles that are needed for the Mod
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.block.entity.ModBlockEntities;
import net.diverginglensestudios.undeadmod.entity.ModEntities;
import net.diverginglensestudios.undeadmod.entity.client.FossilizedZombieRenderer;
import net.diverginglensestudios.undeadmod.entity.client.ModBoatRenderer;
import net.diverginglensestudios.undeadmod.entity.client.UndeadArcheologistRenderer;
import net.diverginglensestudios.undeadmod.item.ModCreativeModTabs;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.diverginglensestudios.undeadmod.loot.ModLootModifiers;
import net.diverginglensestudios.undeadmod.recipe.ModRecipes;
import net.diverginglensestudios.undeadmod.screen.GemPolishingStationScreen;
import net.diverginglensestudios.undeadmod.screen.ModMenuTypes;
import net.diverginglensestudios.undeadmod.sound.ModSounds;
import net.diverginglensestudios.undeadmod.util.ModWoodTypes;
import net.diverginglensestudios.undeadmod.villager.ModVillagers;

/*
Das ist ein Kommentar von mehreren Zeilen.
*/

@Mod(UndeadMod.MOD_ID) // The value here should match an entry in the META-INF/mods.toml file
public class UndeadMod { //Define the Class for the Mod
    public static final String MOD_ID = "undeadmod"; //Set the name, so forge recognizes and can access the mod.
    public static final Logger LOGGER = LogUtils.getLogger(); //

    public UndeadMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CATMINT.getId(), ModBlocks.POTTED_CATMINT);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.FOSSIL);
            event.accept(ModItems.RAW_FOSSIL);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.ASH);

            EntityRenderers.register(ModEntities.UNDEAD_ARCHEOLOGIST.get(), pContext -> new UndeadArcheologistRenderer(pContext));
            EntityRenderers.register(ModEntities.FOSSILIZED_ZOMBIE.get(), pContext -> new FossilizedZombieRenderer(pContext));
            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

            EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);

            MenuScreens.register(ModMenuTypes.GEM_POLISHING_MENU.get(), GemPolishingStationScreen::new);
        }
    }
}
