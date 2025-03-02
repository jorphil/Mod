package net.diverginglensestudios.undeadmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModLeavesBlock extends LeavesBlock {
    private final int flammability;
    private final int firespread;

    public ModLeavesBlock(Properties pProperties, int flammability, int firespread) {
        super(pProperties);
        this.flammability = flammability;
        this.firespread = firespread;
    }

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