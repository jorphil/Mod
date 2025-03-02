package net.diverginglensestudios.undeadmod.entity;

import java.util.function.Supplier;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.entity.custom.DiceProjectileEntity;
import net.diverginglensestudios.undeadmod.entity.custom.FossilizedZombieEntity;
import net.diverginglensestudios.undeadmod.entity.custom.ModBoatEntity;
import net.diverginglensestudios.undeadmod.entity.custom.ModChestBoatEntity;
import net.diverginglensestudios.undeadmod.entity.custom.UndeadArcheologistEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, UndeadMod.MOD_ID);

        public static final RegistryObject<EntityType<UndeadArcheologistEntity>> UNDEAD_ARCHEOLOGIST =
                ENTITY_TYPES.register("undead_archeologist",  () -> EntityType.Builder.of(UndeadArcheologistEntity::new, MobCategory.MISC)
                    .sized(0.6f, 1.75f).build("undead_archeologist"));

        public static final RegistryObject<EntityType<FossilizedZombieEntity>> FOSSILIZED_ZOMBIE =
                ENTITY_TYPES.register("fossilized_zombie",  () -> EntityType.Builder.of(FossilizedZombieEntity::new, MobCategory.MISC)
                        .sized(0.6f, 1.75f).build("fossilized_zombie"));


        public static final RegistryObject<EntityType<ModBoatEntity>> MOD_BOAT =
                 ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                        .sized(1.375f, 0.5625f).build("mod_boat"));

        public static final RegistryObject<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
                ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                        .sized(1.375f, 0.5625f).build("mod_chest_boat"));


        public static final RegistryObject<EntityType<DiceProjectileEntity>> DICE_PROJECTILE =
                ENTITY_TYPES.register("dice_projectile", () -> EntityType.Builder.<DiceProjectileEntity>of(DiceProjectileEntity::new, MobCategory.MISC)
                        .sized(0.5f, 0.5f).build("dice_projectile"));




    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
