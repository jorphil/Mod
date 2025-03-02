package net.diverginglensestudios.undeadmod.block.custom;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import net.diverginglensestudios.undeadmod.entity.ModEntities;
import net.diverginglensestudios.undeadmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.storage.loot.LootParams;

public class FossilLuckyBlock extends Block {

    public FossilLuckyBlock(Properties pProperties) {
        super(pProperties);
    }
@Override
public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
    super.destroy(pLevel, pPos, pState);
    if (pLevel instanceof ServerLevel serverLevel) {
        Random random = new Random();
        int choice = random.nextInt(4) + 1; // Generates 1, 2, or 3

        if (choice==1){//////////EVENT_1//////////
            //UndeadArcheologistEntity customEntity = new UndeadArcheologistEntity(ModEntities.UNDEADARCHEOLOGIST.get(), serverLevel);
           // customEntity.moveTo(pPos.getX() + 0.5, pPos.getY(), pPos.getZ() + 0.5, 0, 0);
           // serverLevel.addFreshEntity(customEntity);

        } else if (choice==2){//////////EVENT_2//////////
            LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
            if (lightningBolt != null) {
                lightningBolt.moveTo(pPos.getX() + 0.5, pPos.getY(), pPos.getZ() + 0.5);
                lightningBolt.setVisualOnly(false); // Ensures it causes fire and damage
                serverLevel.addFreshEntity(lightningBolt);
            }
        } else if (choice==3) {//////////EVENT_3//////////
            // Drop a random Rare Fossil Armor piece
            ItemStack armorDrop;
            int armorChoice = random.nextInt(4); // 0-3 for different armor pieces

            switch (armorChoice) {
                case 0 -> armorDrop = new ItemStack(ModItems.RARE_FOSSIL_HELMET.get());
                case 1 -> armorDrop = new ItemStack(ModItems.RARE_FOSSIL_CHESTPLATE.get());
                case 2 -> armorDrop = new ItemStack(ModItems.RARE_FOSSIL_LEGGINGS.get());
                case 3 -> armorDrop = new ItemStack(ModItems.RARE_FOSSIL_BOOTS.get());
                default -> armorDrop = ItemStack.EMPTY;
            }

            if (!armorDrop.isEmpty()) {
                Block.popResource(serverLevel, pPos, armorDrop);
            }
        } else if (choice==4) {//////////EVENT_4//////////

        }


        }
    }
    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        return List.of(); // Prevents default block drops
    }
}

