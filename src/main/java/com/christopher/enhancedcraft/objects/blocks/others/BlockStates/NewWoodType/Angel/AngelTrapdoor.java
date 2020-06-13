package com.christopher.enhancedcraft.objects.blocks.others.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class AngelTrapdoor extends TrapDoorBlock {
    public AngelTrapdoor() {
        super((Block.Properties.create(Material.EARTH, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
    }
}
