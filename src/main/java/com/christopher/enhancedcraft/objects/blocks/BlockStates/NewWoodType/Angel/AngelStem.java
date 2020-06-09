package com.christopher.enhancedcraft.objects.blocks.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class AngelStem extends LogBlock {
    public AngelStem() {
        super(MaterialColor.WOOD, Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    }
}
