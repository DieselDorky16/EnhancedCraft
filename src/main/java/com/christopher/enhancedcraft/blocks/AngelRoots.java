package com.christopher.enhancedcraft.blocks;

import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class AngelRoots extends TallGrassBlock {
    public AngelRoots() {
        super(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().sound(SoundType.NETHER_WART));
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == Blocks.NETHERRACK || block == BlockInit.ANGEL_NYLIUM.get();
    }
}
