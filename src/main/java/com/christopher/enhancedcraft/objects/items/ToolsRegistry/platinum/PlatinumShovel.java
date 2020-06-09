package com.christopher.enhancedcraft.objects.items.ToolsRegistry.platinum;

import com.christopher.enhancedcraft.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.crafting.Ingredient;

public class PlatinumShovel extends ShovelItem {
    public PlatinumShovel() {
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
        },
                1.5F,-3.0F, (new Item.Properties()).group(ItemGroup.TOOLS));
    }
}
