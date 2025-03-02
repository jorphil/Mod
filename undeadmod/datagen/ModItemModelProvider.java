package net.diverginglensestudios.undeadmod.datagen;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.block.ModBlocks;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UndeadMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FOSSIL);
        simpleItem(ModItems.RARE_FOSSIL);
        simpleItem(ModItems.RAW_DEEPSLATE_FOSSIL);
        simpleItem(ModItems.RAW_FOSSIL);

        simpleItem(ModItems.METATORBERNITE);

        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.FOSSILIZED_DRUMSTICK);

        //Crops
        simpleItem(ModItems.CORN);
        simpleItem(ModItems.CORN_SEEDS);
        //Saplings
        saplingItem(ModBlocks.ASH_SAPLING);
        //Music_Discs
        simpleItem(ModItems.BAR_BRAWL_MUSIC_DISC);

        simpleBlockItem(ModBlocks.FOSSIL_DOOR);
        simpleBlockItem(ModBlocks.ASH_DOOR);

        fenceItem(ModBlocks.FOSSIL_FENCE, ModBlocks.FOSSIL_BLOCK);
        buttonItem(ModBlocks.FOSSIL_BUTTON, ModBlocks.FOSSIL_BLOCK);
        wallItem(ModBlocks.FOSSIL_WALL, ModBlocks.FOSSIL_BLOCK);
        fenceItem(ModBlocks.ASH_FENCE, ModBlocks.ASH_PLANKS);
        buttonItem(ModBlocks.ASH_BUTTON, ModBlocks.ASH_PLANKS);

        evenSimplerBlockItem(ModBlocks.FOSSIL_STAIRS);
        evenSimplerBlockItem(ModBlocks.FOSSIL_SLAB);
        evenSimplerBlockItem(ModBlocks.FOSSIL_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.FOSSIL_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.ASH_STAIRS);
        evenSimplerBlockItem(ModBlocks.ASH_SLAB);
        evenSimplerBlockItem(ModBlocks.ASH_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.ASH_FENCE_GATE);

        trapdoorItem(ModBlocks.FOSSIL_TRAPDOOR);
        trapdoorItem(ModBlocks.ASH_TRAPDOOR);

        handheldItem(ModItems.FOSSIL_SWORD);
        handheldItem(ModItems.FOSSIL_PICKAXE);
        handheldItem(ModItems.FOSSIL_AXE);
        handheldItem(ModItems.FOSSIL_SHOVEL);
        handheldItem(ModItems.FOSSIL_HOE);

        trimmedArmorItem(ModItems.FOSSIL_HELMET);
        trimmedArmorItem(ModItems.FOSSIL_CHESTPLATE);
        trimmedArmorItem(ModItems.FOSSIL_LEGGINGS);
        trimmedArmorItem(ModItems.FOSSIL_BOOTS);

        trimmedArmorItem(ModItems.RARE_FOSSIL_HELMET);
        trimmedArmorItem(ModItems.RARE_FOSSIL_CHESTPLATE);
        trimmedArmorItem(ModItems.RARE_FOSSIL_LEGGINGS);
        trimmedArmorItem(ModItems.RARE_FOSSIL_BOOTS);

        simpleBlockItemBlockTexture(ModBlocks.CATMINT);

        withExistingParent(ModItems.UNDEADARCHEOLOGIST_SPANW_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleItem(ModItems.ASH_SIGN);
        simpleItem(ModItems.ASH_HANGING_SIGN);

        simpleItem(ModItems.ASH_BOAT);
        simpleItem(ModItems.ASH_CHEST_BOAT);

        simpleItem(ModItems.DICE);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = UndeadMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(UndeadMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(UndeadMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(UndeadMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(UndeadMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(UndeadMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(UndeadMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(UndeadMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(UndeadMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(UndeadMod.MOD_ID,"block/" + item.getId().getPath()));
    }
}
