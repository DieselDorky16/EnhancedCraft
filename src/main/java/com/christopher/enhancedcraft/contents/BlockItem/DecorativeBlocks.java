package com.christopher.enhancedcraft.contents.BlockItem;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class DecorativeBlocks extends BlockItem {
    public DecorativeBlocks(Block block) {

        super(block, new Properties().group(ItemGroup.DECORATIONS));
    }
}
