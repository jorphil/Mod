package net.diverginglensestudios.undeadmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties THE_FOSSILS_EYE = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 0.1f).build();
            
        public static final FoodProperties FOSSILIZED_DRUMSTICK = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200), 0.1f).build();

}
