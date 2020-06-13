package com.christopher.enhancedcraft.objects.blocks.others.BlockItem;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class SoulMaterials extends BlockItem {
    public SoulMaterials(Block block) {

        super(block, new Properties().group(EnhancedcraftMod.SOUL_PRODUCTS));
    }
}
