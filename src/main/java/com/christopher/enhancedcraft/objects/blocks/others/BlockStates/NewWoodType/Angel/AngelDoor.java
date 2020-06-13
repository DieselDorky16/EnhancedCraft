package com.christopher.enhancedcraft.objects.blocks.others.BlockStates.NewWoodType.Angel;

import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class AngelDoor extends DoorBlock {
    public AngelDoor() {
        super(Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid());
    }
}
