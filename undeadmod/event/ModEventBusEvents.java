package net.diverginglensestudios.undeadmod.event;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.entity.ModEntities;
import net.diverginglensestudios.undeadmod.entity.custom.FossilizedZombieEntity;
import net.diverginglensestudios.undeadmod.entity.custom.UndeadArcheologistEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UndeadMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.UNDEAD_ARCHEOLOGIST.get(), UndeadArcheologistEntity.createAttributes().build());
        event.put(ModEntities.FOSSILIZED_ZOMBIE.get(), FossilizedZombieEntity.createAttributes().build());
    }
}
