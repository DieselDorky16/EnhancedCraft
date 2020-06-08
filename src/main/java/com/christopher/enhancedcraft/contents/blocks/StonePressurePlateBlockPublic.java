package com.christopher.enhancedcraft.contents.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StonePressurePlateBlockPublic extends PressurePlateBlock {

    public StonePressurePlateBlockPublic() {
        super(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).doesNotBlockMovement().hardnessAndResistance(0.5F));
    }
}
