package net.diverginglensestudios.undeadmod.util;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType ASH = WoodType.register(new WoodType(UndeadMod.MOD_ID + ":ash", BlockSetType.OAK));
}
