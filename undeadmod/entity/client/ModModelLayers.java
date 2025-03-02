package net.diverginglensestudios.undeadmod.entity.client;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation UNDEAD_ARCHEOLOGIST_LAYER = new ModelLayerLocation(
        new ResourceLocation(UndeadMod.MOD_ID, "undead_archeologist_layer"), "main");
    public static final ModelLayerLocation FOSSILIZED_ZOMBIE_LAYER = new ModelLayerLocation(
        new ResourceLocation(UndeadMod.MOD_ID, "fossilized_zombie_layer"), "main");

    public static final ModelLayerLocation PINE_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(UndeadMod.MOD_ID, "boat/ash"), "main");
    public static final ModelLayerLocation PINE_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(UndeadMod.MOD_ID, "chest_boat/ash"), "main");

}
