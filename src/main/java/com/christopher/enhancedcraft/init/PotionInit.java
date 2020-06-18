package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionInit {
    public static final DeferredRegister<Effect> POTIONS = new DeferredRegister<>(ForgeRegistries.POTIONS,
            EnhancedcraftMod.MOD_ID);
    public static final DeferredRegister<Potion> POTION_EFFECTS = new DeferredRegister<>(ForgeRegistries.POTION_TYPES,
            EnhancedcraftMod.MOD_ID);
    public static final RegistryObject<Potion> DECAY = POTION_EFFECTS.register("decay", () -> new Potion(new EffectInstance(Effects.WITHER, 800, 1)));

    public static final RegistryObject<Potion> ABSORPTION = POTION_EFFECTS.register("absorption", () -> new Potion(new EffectInstance(Effects.ABSORPTION, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_ABSORPTION = POTION_EFFECTS.register("strong_absorption", () -> new Potion("absorption",new EffectInstance(Effects.ABSORPTION, 1800, 1)));
    RegistryObject<Potion> LONG_ABSORPTION = POTION_EFFECTS.register("long_absorption", () -> new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 9600,0)));

    public static final RegistryObject<Potion> MINING_FATIGUE = POTION_EFFECTS.register("mining_fatigue", () -> new Potion(new EffectInstance(Effects.MINING_FATIGUE, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_MINING_FATIGUE = POTION_EFFECTS.register("strong_mining_fatigue", () -> new Potion("mining_fatigue",new EffectInstance(Effects.MINING_FATIGUE, 1800, 1)));
    RegistryObject<Potion> LONG_MINING_FATIGUE = POTION_EFFECTS.register("long_mining_fatigue", () -> new Potion("mining_fatigue", new EffectInstance(Effects.MINING_FATIGUE, 9600)));
    public static final RegistryObject<Potion> BLINDNESS = POTION_EFFECTS.register("blindness", () -> new Potion(new EffectInstance(Effects.BLINDNESS, 3600, 0)));
    public static final RegistryObject<Potion> LONG_BLINDNESS = POTION_EFFECTS.register("long_blindness", () -> new Potion("blindness", new EffectInstance(Effects.BLINDNESS, 9600, 0)));


    public static final RegistryObject<Potion> HASTE = POTION_EFFECTS.register("haste", () -> new Potion(new EffectInstance(Effects.HASTE, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_HASTE = POTION_EFFECTS.register("strong_haste", () -> new Potion("haste",new EffectInstance(Effects.HASTE, 1800, 1)));
    RegistryObject<Potion> LONG_HASTE = POTION_EFFECTS.register("long_haste", () -> new Potion("haste", new EffectInstance(Effects.HASTE, 9600,0)));


}
