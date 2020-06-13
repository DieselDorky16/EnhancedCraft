package com.christopher.enhancedcraft.objects.blocks.others.BlockItem;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BuildBlockItemBase extends BlockItem {
    public BuildBlockItemBase(Block block) {

        super(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
