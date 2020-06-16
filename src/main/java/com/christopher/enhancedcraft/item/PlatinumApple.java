package com.christopher.enhancedcraft.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class PlatinumApple extends Item {
    public PlatinumApple() {
        super(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(1.2F).effect(new EffectInstance(Effects.REGENERATION, 600, 2), 1.0F).effect(new EffectInstance(Effects.RESISTANCE, 7200, 1), 1.0F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 7200, 1), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 3200, 3), 1.0F).setAlwaysEdible().build()));
    }
}
