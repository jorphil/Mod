package net.diverginglensestudios.undeadmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.entity.custom.FossilizedZombieEntity;
import net.diverginglensestudios.undeadmod.entity.custom.UndeadArcheologistEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FossilizedZombieRenderer extends MobRenderer<FossilizedZombieEntity, FossilizedZombieModel<FossilizedZombieEntity>> {
    public FossilizedZombieRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FossilizedZombieModel<>(pContext.bakeLayer(ModModelLayers.FOSSILIZED_ZOMBIE_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(FossilizedZombieEntity pEntity) {
        return new ResourceLocation(UndeadMod.MOD_ID, "textures/entity/fossilized_zombie.png");
    }

    @Override
    public void render(FossilizedZombieEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}