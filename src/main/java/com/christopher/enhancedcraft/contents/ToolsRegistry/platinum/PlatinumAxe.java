package com.christopher.enhancedcraft.contents.ToolsRegistry.platinum;

import com.christopher.enhancedcraft.init.ItemInit;
import com.christopher.enhancedcraft.util.RegistryHandler;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;

public class PlatinumAxe extends AxeItem {
    public PlatinumAxe() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return 1843;
            }

            @Override
            public float getEfficiency() {
                return 12.0F;
            }

            @Override
            public float getAttackDamage() {
                return 4.0F;
            }

            @Override
            public int getHarvestLevel() {
                return 4;
            }

            @Override
            public int getEnchantability() {
                return 25;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return Ingredient.fromItems(ItemInit.PLATINUM_INGOT.get());
            }
        }, 7.0F, -3.0F, (new Properties()).group(ItemGroup.TOOLS));
    }
}
