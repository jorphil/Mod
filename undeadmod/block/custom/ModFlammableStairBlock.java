package net.diverginglensestudios.undeadmod.block.custom;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModFlammableStairBlock extends StairBlock {
    private final int flammability;
    private final int firespread;
    public ModFlammableStairBlock(Supplier<BlockState> state, Properties properties, int flammability, int firespread) {
        super(state, properties);
        this.flammability = flammability;
        this.firespread = firespread;
        //TODO Auto-generated constructor stub
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