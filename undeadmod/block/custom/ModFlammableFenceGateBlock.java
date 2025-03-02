package net.diverginglensestudios.undeadmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModFlammableFenceGateBlock extends FenceGateBlock {
    public ModFlammableFenceGateBlock(Properties props, SoundEvent openSound, SoundEvent closeSound, int flammability, int firespread) {
        super(props, openSound, closeSound);
        this.flammability = flammability;
        this.firespread = firespread;
        //TODO Auto-generated constructor stub
    }

    private final int flammability;
    private final int firespread;



    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true; // Assuming all instances of ModPlankBlocks are flammable
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return this.flammability; // Return the stored flammability value
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return this.firespread; // Default fire spread speed, or you can pass it as a parameter too
    }
}