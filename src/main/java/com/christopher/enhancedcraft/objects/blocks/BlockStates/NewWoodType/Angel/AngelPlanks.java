package com.christopher.enhancedcraft.objects.blocks.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class AngelPlanks extends Block {
    public AngelPlanks() {
        super(Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));
    }
}
