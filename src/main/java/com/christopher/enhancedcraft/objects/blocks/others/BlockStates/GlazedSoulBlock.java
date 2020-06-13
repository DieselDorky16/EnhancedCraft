package com.christopher.enhancedcraft.objects.blocks.others.BlockStates;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

@SuppressWarnings("deprecation")
public class GlazedSoulBlock extends BreakableBlock {
    public GlazedSoulBlock() {
        super(Block.Properties.create(Material.ICE).slipperiness(0.98F).tickRandomly().hardnessAndResistance(0.5F).sound(SoundType.GLASS).notSolid());
    }

    /**
     * Spawns the block's drops in the world. By the time this is called the Block has possibly been set to air via
     * Block.removedByPlayer
     */
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            Material material = worldIn.getBlockState(pos.down()).getMaterial();
            if (material.blocksMovement() || material.isLiquid()) {
                worldIn.setBlockState(pos, Blocks.LAVA.getDefaultState());
            }
        }

    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (worldIn.getLightFor(LightType.BLOCK, pos) < 11 - state.getOpacity(worldIn, pos)) {
            this.turnIntoWater(state, worldIn, pos);
        }

    }

    protected void turnIntoWater(BlockState p_196454_1_, World p_196454_2_, BlockPos p_196454_3_) {
            p_196454_2_.setBlockState(p_196454_3_, Blocks.LAVA.getDefaultState());
            p_196454_2_.neighborChanged(p_196454_3_, Blocks.LAVA, p_196454_3_);
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.NORMAL;
    }

    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return type == EntityType.SKELETON;
    }
}
