package com.christopher.enhancedcraft.objects.blocks.BlockStates;

import net.minecraft.block.Block;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.material.Material;

public class SoulFurnaceBlock extends FurnaceBlock {
    public SoulFurnaceBlock() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F).lightValue(6));
    }
}
