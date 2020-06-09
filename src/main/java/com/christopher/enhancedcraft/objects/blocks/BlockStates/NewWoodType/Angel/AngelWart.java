package com.christopher.enhancedcraft.objects.blocks.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AngelWart extends LeavesBlock {
    public AngelWart() {
        super(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.NETHER_WART).notSolid());
    }
}
