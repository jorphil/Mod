package net.diverginglensestudios.undeadmod.item;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.entity.ModEntities;
import net.diverginglensestudios.undeadmod.entity.custom.ModBoatEntity;
import net.diverginglensestudios.undeadmod.item.custom.*;
import net.diverginglensestudios.undeadmod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, UndeadMod.MOD_ID);
//Normal Items
public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",// Giving Item a name
        () -> new Item(new Item.Properties())); //Defining item as being "item" class and giving it properties
public static final RegistryObject<Item> RARE_FOSSIL = ITEMS.register("rare_fossil",// Giving Item a name
        () -> new Item(new Item.Properties()));//Defining item as being "item" class and giving it properties
public static final RegistryObject<Item> RAW_FOSSIL = ITEMS.register("raw_fossil",// Giving Item a name
        () -> new Item(new Item.Properties()));//Defining item as being "item" class and giving it properties
public static final RegistryObject<Item> RAW_DEEPSLATE_FOSSIL = ITEMS.register("raw_deepslate_fossil",// Giving Item a name
        () -> new Item(new Item.Properties()));//Defining item as being "item" class and giving it properties

//METATORBERNIT
public static final RegistryObject<Item> METATORBERNITE = ITEMS.register("metatorbernite",// Giving Item a name
        () -> new Item(new Item.Properties()));//Defining item as being "item" class and giving it properties
//Advanced Items
public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
        () -> new MetalDetectorItem(new Item.Properties().durability(100)));
        public static final RegistryObject<Item> FOSSIL_STAFF = ITEMS.register("fossil_staff",
        () -> new Item(new Item.Properties().stacksTo(1)));

//Food Items
public static final RegistryObject<Item> THE_FOSSILS_EYE = ITEMS.register("the_fossils_eye",
        () -> new Item(new Item.Properties().food(ModFoods.THE_FOSSILS_EYE)));
public static final RegistryObject<Item> FOSSILIZED_DRUMSTICK = ITEMS.register("fossilized_drumstick",
        () -> new ModFoodItem(new Item.Properties().food(ModFoods.FOSSILIZED_DRUMSTICK),200));

//Fuel Items

//Tools
public static final RegistryObject<Item> FOSSIL_SWORD = ITEMS.register("fossil_sword",
        () -> new SwordItem(ModToolTiers.FOSSIL, 4, 2, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_PICKAXE = ITEMS.register("fossil_pickaxe",
        () -> new PickaxeItem(ModToolTiers.FOSSIL, 1, 1, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_AXE = ITEMS.register("fossil_axe",
        () -> new AxeItem(ModToolTiers.FOSSIL, 7, 1, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_SHOVEL = ITEMS.register("fossil_shovel",
        () -> new ShovelItem(ModToolTiers.FOSSIL, 0, 0, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_HOE = ITEMS.register("fossil_hoe",
        () -> new HoeItem(ModToolTiers.FOSSIL, 0, 0, new Item.Properties()));

//Armor
//Fossil
public static final RegistryObject<Item> FOSSIL_HELMET = ITEMS.register("fossil_helmet",
        () -> new ModArmorItem(ModArmorMaterials.FOSSIL, ArmorItem.Type.HELMET, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_CHESTPLATE = ITEMS.register("fossil_chestplate",
        () -> new ArmorItem(ModArmorMaterials.FOSSIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_LEGGINGS = ITEMS.register("fossil_leggings",
        () -> new ArmorItem(ModArmorMaterials.FOSSIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
public static final RegistryObject<Item> FOSSIL_BOOTS = ITEMS.register("fossil_boots",
        () -> new ArmorItem(ModArmorMaterials.FOSSIL, ArmorItem.Type.BOOTS, new Item.Properties()));
//RARE_FOSSIL
public static final RegistryObject<Item> RARE_FOSSIL_HELMET = ITEMS.register("rare_fossil_helmet",
        () -> new ModArmorItem(ModArmorMaterials.RARE_FOSSIL, ArmorItem.Type.HELMET, new Item.Properties()));
public static final RegistryObject<Item> RARE_FOSSIL_CHESTPLATE = ITEMS.register("rare_fossil_chestplate",
        () -> new ArmorItem(ModArmorMaterials.RARE_FOSSIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
public static final RegistryObject<Item> RARE_FOSSIL_LEGGINGS = ITEMS.register("rare_fossil_leggings",
        () -> new ArmorItem(ModArmorMaterials.RARE_FOSSIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
public static final RegistryObject<Item> RARE_FOSSIL_BOOTS = ITEMS.register("rare_fossil_boots",
        () -> new ArmorItem(ModArmorMaterials.RARE_FOSSIL, ArmorItem.Type.BOOTS, new Item.Properties()));

//Crops
public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
        () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));
public static final RegistryObject<Item> CORN = ITEMS.register("corn",
        () -> new Item(new Item.Properties()));

//Saplings
        public static final RegistryObject<Item> ASH_SAPLING_ITEM = ITEMS.register("ash_sapling",
        () -> new BlockItem(ModBlocks.ASH_SAPLING.get(), new Item.Properties()));

//Music
public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
        () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

//Mobs
public static final RegistryObject<Item> UNDEADARCHEOLOGIST_SPANW_EGG = ITEMS.register("undeadarcheologist_spawn_egg",
        () -> new ForgeSpawnEggItem(ModEntities.UNDEAD_ARCHEOLOGIST, 0x6B5B44, 0xA0A48B, new Item.Properties()));

//Signs
public static final RegistryObject<Item> ASH_SIGN = ITEMS.register("ash_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ASH_SIGN.get(), ModBlocks.ASH_WALL_SIGN.get()));
public static final RegistryObject<Item> ASH_HANGING_SIGN = ITEMS.register("ash_hanging_sign",
        () -> new HangingSignItem(ModBlocks.ASH_HANGING_SIGN.get(), ModBlocks.ASH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

//Boats
public static final RegistryObject<Item> ASH_BOAT = ITEMS.register("ash_boat",
        () -> new ModBoatItem(false, ModBoatEntity.Type.ASH, new Item.Properties()));
public static final RegistryObject<Item> ASH_CHEST_BOAT = ITEMS.register("ash_chest_boat",
        () -> new ModBoatItem(true, ModBoatEntity.Type.ASH, new Item.Properties()));
//Throwable Projectiles
public static final RegistryObject<Item> DICE = ITEMS.register("dice",
        () -> new DiceItem(new Item.Properties()));

public static void register(IEventBus eventBus) {
ITEMS.register(eventBus);
}
}
