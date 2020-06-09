package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.enchantments.UltrasharpnessEnchantment;
import com.christopher.enhancedcraft.enchantments.WitheringEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS,
            EnhancedcraftMod.MOD_ID);
public static final RegistryObject<Enchantment> ULTRASHARPNESS = ENCHANTMENTS.register("ultrasharpness",
        () -> new UltrasharpnessEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                EquipmentSlotType.MAINHAND));
public static final RegistryObject<Enchantment> WITHERING = ENCHANTMENTS.register("withering",
        () -> new WitheringEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
        EquipmentSlotType.MAINHAND));
        }

