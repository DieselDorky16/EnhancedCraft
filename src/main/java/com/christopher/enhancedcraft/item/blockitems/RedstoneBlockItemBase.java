package com.christopher.enhancedcraft.item.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class RedstoneBlockItemBase extends BlockItem {
    public RedstoneBlockItemBase(Block block) {

        super(block, new Properties().group(ItemGroup.REDSTONE));
    }
}
