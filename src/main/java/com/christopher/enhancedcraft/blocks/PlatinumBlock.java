package com.christopher.enhancedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PlatinumBlock extends Block {
    public PlatinumBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(25.0f,600.0f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL));
    }
}