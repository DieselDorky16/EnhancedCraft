package com.christopher.enhancedcraft.item.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class OreItemBase extends BlockItem {
    public OreItemBase(Block block) {

        super(block, new Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
