package com.christopher.enhancedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PolishedBricksVariant extends Block {
    public PolishedBricksVariant() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(6.0f,1.5f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
    }
}