package com.christopher.enhancedcraft.contents.ToolsRegistry.platinum;

import com.christopher.enhancedcraft.init.ItemInit;
import com.christopher.enhancedcraft.util.RegistryHandler;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

public class PlatinumPick extends PickaxeItem {
    public PlatinumPick() {
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
        }, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS));
    }
}
