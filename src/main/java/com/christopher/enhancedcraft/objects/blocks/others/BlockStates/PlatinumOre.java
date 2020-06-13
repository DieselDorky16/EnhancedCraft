package com.christopher.enhancedcraft.objects.blocks.others.BlockStates;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PlatinumOre extends Block {
    public PlatinumOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(15.0f,600.0f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
    }
}