package net.diverginglensestudios.undeadmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;

import net.diverginglensestudios.undeadmod.UndeadMod;
import net.diverginglensestudios.undeadmod.entity.custom.UndeadArcheologistEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class UndeadArcheologistRenderer extends MobRenderer<UndeadArcheologistEntity, UndeadArcheologistModel<UndeadArcheologistEntity>> {
    public UndeadArcheologistRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new UndeadArcheologistModel<>(pContext.bakeLayer(ModModelLayers.UNDEAD_ARCHEOLOGIST_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(UndeadArcheologistEntity pEntity) {
        return new ResourceLocation(UndeadMod.MOD_ID, "textures/entity/undead_archeologist.png");
    }

    @Override
    public void render(UndeadArcheologistEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}

