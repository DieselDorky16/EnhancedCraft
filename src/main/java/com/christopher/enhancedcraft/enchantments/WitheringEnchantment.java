package com.christopher.enhancedcraft.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class WitheringEnchantment extends Enchantment {
    public WitheringEnchantment(Rarity rarityIn, EnchantmentType weapon, EquipmentSlotType... slots) {
        super(rarityIn, EnchantmentType.WEAPON, slots);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 5 + 20 * (enchantmentLevel - 1);
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    @Override
    public boolean isTreasureEnchantment() {
        return true;
    }


    @Override
    public boolean canApply(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || super.canApply(stack);
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return !(ench instanceof DamageEnchantment) && super.canApplyTogether(ench);
    }

    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            LivingEntity livingentity = (LivingEntity) target;
            if (level == 1) {
                int i = 20 + user.getRNG().nextInt(10 * level);
                livingentity.addPotionEffect(new EffectInstance(Effects.WITHER, 5 * i, level));
            } else if (level == 2) {
                int i = 40 + user.getRNG().nextInt(10 * level);
                livingentity.addPotionEffect(new EffectInstance(Effects.WITHER, 5 * i, 1 + level));

            } else {
                int i = 20 * level + user.getRNG().nextInt(10 * level);
                livingentity.addPotionEffect(new EffectInstance(Effects.WITHER, 5 * i, level - 2 + level));
            }
        }
    }
}