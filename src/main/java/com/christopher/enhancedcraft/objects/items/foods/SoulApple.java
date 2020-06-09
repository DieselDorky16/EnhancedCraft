package com.christopher.enhancedcraft.objects.items.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class SoulApple extends Item {
    public SoulApple() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder().fastToEat().hunger(1).saturation(1.2F).effect(new EffectInstance(Effects.POISON, 600, 2), 1.0F).effect(new EffectInstance(Effects.NAUSEA, 600, 2), 1.0F).effect(new EffectInstance(Effects.WEAKNESS, 7200, 1), 1.0F).effect(new EffectInstance(Effects.BLINDNESS, 7200, 1), 1.0F).effect(new EffectInstance(Effects.MINING_FATIGUE, 3200, 3), 1.0F).setAlwaysEdible().build()));
    }
}
