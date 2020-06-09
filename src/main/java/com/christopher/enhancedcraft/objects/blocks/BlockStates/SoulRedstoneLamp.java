package com.christopher.enhancedcraft.objects.blocks.BlockStates;


import net.minecraft.block.Block;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class SoulRedstoneLamp extends RedstoneLampBlock {
    public SoulRedstoneLamp() {
        super(Block.Properties.create(Material.REDSTONE_LIGHT).lightValue(10).hardnessAndResistance(0.3F).sound(SoundType.GLASS));
    }
}
