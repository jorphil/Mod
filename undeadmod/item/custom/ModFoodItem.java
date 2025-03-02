package net.diverginglensestudios.undeadmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModFoodItem extends Item{
private int duration;
public ModFoodItem(Properties pProperties, int useDuration) {
            super(pProperties);
            duration=useDuration;
    }


@Override 
public int getUseDuration(ItemStack pStack) {
        return duration;
}

}
