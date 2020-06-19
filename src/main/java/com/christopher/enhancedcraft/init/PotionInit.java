package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("ALL")
public class PotionInit {
    public static final DeferredRegister<Effect> POTIONS = new DeferredRegister<>(ForgeRegistries.POTIONS,
            EnhancedcraftMod.MOD_ID);
    public static final DeferredRegister<Potion> POTION_EFFECTS = new DeferredRegister<>(ForgeRegistries.POTION_TYPES,
            EnhancedcraftMod.MOD_ID);

    public static final RegistryObject<Potion> ABSORPTION = POTION_EFFECTS.register("absorption", () -> new Potion(new EffectInstance(Effects.ABSORPTION, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_ABSORPTION = POTION_EFFECTS.register("strong_absorption", () -> new Potion("absorption",new EffectInstance(Effects.ABSORPTION, 1800, 1)));
    public static final RegistryObject<Potion> LONG_ABSORPTION = POTION_EFFECTS.register("long_absorption", () -> new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 9600,0)));

    public static final RegistryObject<Potion> BAD_OMEN = POTION_EFFECTS.register("bad_omen", () -> new Potion(new EffectInstance(Effects.BAD_OMEN, 3600, 0)));
    public static final RegistryObject<Potion> LONG_BAD_OMEN = POTION_EFFECTS.register("long_bad_omen", () -> new Potion("bad_omen", new EffectInstance(Effects.BAD_OMEN, 9600, 0)));

    public static final RegistryObject<Potion> BLINDNESS = POTION_EFFECTS.register("blindness", () -> new Potion(new EffectInstance(Effects.BLINDNESS, 3600, 0)));
    public static final RegistryObject<Potion> LONG_BLINDNESS = POTION_EFFECTS.register("long_blindness", () -> new Potion("blindness", new EffectInstance(Effects.BLINDNESS, 9600, 0)));

    public static final RegistryObject<Potion> CONDUIT = POTION_EFFECTS.register("conduit_power", () -> new Potion(new EffectInstance(Effects.CONDUIT_POWER, 3600)));
    public static final RegistryObject<Potion> LONG_CONDUIT = POTION_EFFECTS.register("long_conduit_power", () -> new Potion("conduit_power", new EffectInstance(Effects.CONDUIT_POWER, 9600)));
    public static final RegistryObject<Potion> STRONG_CONDUIT = POTION_EFFECTS.register("strong_conduit_power", () -> new Potion("conduit_power", new EffectInstance(Effects.CONDUIT_POWER, 1800, 1)));


    public static final RegistryObject<Potion> CONFUSION = POTION_EFFECTS.register("confusion", () -> new Potion(new EffectInstance(Effects.NAUSEA, 1800)));
    public static final RegistryObject<Potion> LONG_CONFUSION = POTION_EFFECTS.register("long_confusion", () -> new Potion("confusion", new EffectInstance(Effects.NAUSEA, 4800)));

    public static final RegistryObject<Potion> DECAY = POTION_EFFECTS.register("decay", () -> new Potion(new EffectInstance(Effects.WITHER, 800, 1)));

    public static final RegistryObject<Potion> DOLPHIN = POTION_EFFECTS.register("dolphin_grace", () -> new Potion(new EffectInstance(Effects.DOLPHINS_GRACE, 1800)));
    public static final RegistryObject<Potion> LONG_DOLPHIN = POTION_EFFECTS.register("long_dolphin_grace", () -> new Potion("dolphin_grace", new EffectInstance(Effects.DOLPHINS_GRACE, 4800)));


    public static final RegistryObject<Potion> MINING_FATIGUE = POTION_EFFECTS.register("mining_fatigue", () -> new Potion(new EffectInstance(Effects.MINING_FATIGUE, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_MINING_FATIGUE = POTION_EFFECTS.register("strong_mining_fatigue", () -> new Potion("mining_fatigue",new EffectInstance(Effects.MINING_FATIGUE, 1800, 1)));
    public static final RegistryObject<Potion> LONG_MINING_FATIGUE = POTION_EFFECTS.register("long_mining_fatigue", () -> new Potion("mining_fatigue", new EffectInstance(Effects.MINING_FATIGUE, 9600)));

    public static final RegistryObject<Potion> GLOWING = POTION_EFFECTS.register("glowing", () -> new Potion("glowing", new EffectInstance(Effects.GLOWING, 6000)));


    public static final RegistryObject<Potion> HASTE = POTION_EFFECTS.register("haste", () -> new Potion(new EffectInstance(Effects.HASTE, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_HASTE = POTION_EFFECTS.register("strong_haste", () -> new Potion("haste",new EffectInstance(Effects.HASTE, 1800, 1)));
    public static final RegistryObject<Potion> LONG_HASTE = POTION_EFFECTS.register("long_haste", () -> new Potion("haste", new EffectInstance(Effects.HASTE, 9600,0)));

    public static final RegistryObject<Potion> HEALTH_BOOST = POTION_EFFECTS.register("health_boost", () -> new Potion(new EffectInstance(Effects.HEALTH_BOOST, 3600, 0)));
    public static final RegistryObject<Potion> STRONG_HEALTH_BOOST = POTION_EFFECTS.register("strong_health_boost", () -> new Potion("health_boost",new EffectInstance(Effects.HEALTH_BOOST, 1800, 1)));
    public static final RegistryObject<Potion> LONG_HEALTH_BOOST = POTION_EFFECTS.register("long_health_boost", () -> new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 9600,0)));


    public static final RegistryObject<Potion> HUNGER = POTION_EFFECTS.register("hunger", () -> new Potion(new EffectInstance(Effects.HUNGER, 900)));
    public static final RegistryObject<Potion> LONG_HUNGER = POTION_EFFECTS.register("long_hunger", () -> new Potion("hunger", new EffectInstance(Effects.HUNGER, 1800)));
    public static final RegistryObject<Potion> STRONG_HUNGER = POTION_EFFECTS.register("strong_hunger", () -> new Potion("hunger", new EffectInstance(Effects.HUNGER, 432, 1)));


    public static final RegistryObject<Potion> RESISTANCE = POTION_EFFECTS.register("resistance", () -> new Potion(new EffectInstance(Effects.RESISTANCE, 3600)));
    public static final RegistryObject<Potion> LONG_RESISTANCE = POTION_EFFECTS.register("long_resistance", () -> new Potion("resistance", new EffectInstance(Effects.RESISTANCE, 9600)));
    public static final RegistryObject<Potion> STRONG_RESISTANCE= POTION_EFFECTS.register("strong_resistance", () -> new Potion("resistance", new EffectInstance(Effects.RESISTANCE, 1800, 1)));

    public static final RegistryObject<Potion> SATURATION = POTION_EFFECTS.register("saturation", () -> new Potion(new EffectInstance(Effects.SATURATION, 1)));

    public static final RegistryObject<Potion> UNLUCK = POTION_EFFECTS.register("unluck", () -> new Potion("unluck", new EffectInstance(Effects.UNLUCK, 6000)));

    public static final RegistryObject<Potion> VILLAGER_HERO = POTION_EFFECTS.register("villager_hero", () -> new Potion(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 7200, 0)));
    public static final RegistryObject<Potion> LONG_VILLAGER_HERO = POTION_EFFECTS.register("long_villager_hero", () -> new Potion("villager_hero", new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 19200, 0)));
    public static final RegistryObject<Potion> STRONG_VILLAGER_HERO = POTION_EFFECTS.register("strong_villager_hero", () -> new Potion("villager_hero", new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 3600, 0)));


}
