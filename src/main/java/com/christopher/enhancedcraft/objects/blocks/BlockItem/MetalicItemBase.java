package com.christopher.enhancedcraft.objects.blocks.BlockItem;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class MetalicItemBase extends BlockItem {
    public MetalicItemBase(Block block) {

        super(block, new Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
