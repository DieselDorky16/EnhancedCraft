package com.christopher.enhancedcraft.objects.blocks.others.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class AngelHyphae extends RotatedPillarBlock {
    public AngelHyphae() {
        super(Block.Properties.create(Material.EARTH, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    }
}
