package com.christopher.enhancedcraft.objects.items.ToolsRegistry.platinum;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Random;

public class PlatinumShears extends ShearsItem {

    public PlatinumShears() {
        super(new Item.Properties().maxStackSize(1).maxDamage(952).group(ItemGroup.TOOLS));
    }

    /**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
    @ParametersAreNonnullByDefault
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (!worldIn.isRemote) {
            stack.damageItem(1, entityLiving, (p_220036_0_) -> p_220036_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND));
        }

        Block block = state.getBlock();
        return state.isIn(BlockTags.LEAVES) || block == Blocks.COBWEB || block == Blocks.GRASS || block == Blocks.FERN || block == Blocks.DEAD_BUSH || block == Blocks.VINE || block == Blocks.TRIPWIRE || block.isIn(BlockTags.WOOL) || super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(BlockState blockIn) {
        Block block = blockIn.getBlock();
        return block == Blocks.COBWEB || block == Blocks.REDSTONE_WIRE || block == Blocks.TRIPWIRE;
    }
    @ParametersAreNonnullByDefault
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Block block = state.getBlock();
        if (block != Blocks.COBWEB && !state.isIn(BlockTags.LEAVES)) {
            return block.isIn(BlockTags.WOOL) ? 5.0F : super.getDestroySpeed(stack, state);
        } else {
            return 15.0F;
        }
    }

    /**
     * Returns true if the item can be used on the given entity, e.g. shears on sheep.
     */
    @SuppressWarnings("deprecation")
    @Override
    @ParametersAreNonnullByDefault
    public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn, LivingEntity entity, Hand hand) {
        if (entity.world.isRemote) return false;
        if (entity instanceof IShearable) {
            IShearable target = (IShearable)entity;
            BlockPos pos = new BlockPos(entity.getPosX(), entity.getPosY(), entity.getPosZ());
            if (target.isShearable(stack, entity.world, pos)) {
                List<ItemStack> drops = target.onSheared(stack, entity.world, pos,
                        EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack));
                Random rand = new Random();
                drops.forEach(d -> {
                    ItemEntity ent = entity.entityDropItem(d, 1.0F);
                    assert ent != null;
                    ent.setMotion(ent.getMotion().add((double)((rand.nextFloat() - rand.nextFloat()) * 0.1F), (double)(rand.nextFloat() * 0.05F), (double)((rand.nextFloat() - rand.nextFloat()) * 0.1F)));
                });
                stack.damageItem(1, entity, e -> e.sendBreakAnimation(hand));
            }
            return true;
        }
        return false;
    }
}
