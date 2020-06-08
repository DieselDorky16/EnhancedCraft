package com.christopher.enhancedcraft.contents.BlockItem;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class SoulMaterials extends BlockItem {
    public SoulMaterials(Block block) {

        super(block, new Properties().group(EnhancedcraftMod.SOUL_PRODUCTS));
    }
}
