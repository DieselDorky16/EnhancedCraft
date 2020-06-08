package com.christopher.enhancedcraft.contents.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StoneButtonBlockPublic extends StoneButtonBlock {
    public StoneButtonBlockPublic(Properties from) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(6.0f,15.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
    }
}
