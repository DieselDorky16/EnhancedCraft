package com.christopher.enhancedcraft.objects.blocks.BlockStates;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Soulstone extends Block {
    public Soulstone() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(6.0f,15.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
    }
}