package com.christopher.enhancedcraft.objects.blocks.others.BlockItem;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class RedstoneBlockItemBase extends BlockItem {
    public RedstoneBlockItemBase(Block block) {

        super(block, new Properties().group(ItemGroup.REDSTONE));
    }
}
