package com.christopher.enhancedcraft.objects.blocks.others.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class AngelWart extends Block {

    public AngelWart() {
        super(Block.Properties.create(Material.ORGANIC, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.0F).sound(SoundType.NETHER_WART));
    }
}
