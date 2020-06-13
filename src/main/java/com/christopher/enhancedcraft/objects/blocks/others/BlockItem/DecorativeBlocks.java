package com.christopher.enhancedcraft.objects.blocks.others.BlockItem;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class DecorativeBlocks extends BlockItem {
    public DecorativeBlocks(Block block) {

        super(block, new Properties().group(ItemGroup.DECORATIONS));
    }
}
