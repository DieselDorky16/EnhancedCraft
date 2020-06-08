package com.christopher.enhancedcraft.contents.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SoulMagmaBlock extends Block {

    public SoulMagmaBlock() {
        super(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).lightValue(1).tickRandomly().hardnessAndResistance(0.5F));
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (!entityIn.isImmuneToFire() && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
            entityIn.attackEntityFrom(
                    DamageSource.HOT_FLOOR, 2.0F
            );
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}
