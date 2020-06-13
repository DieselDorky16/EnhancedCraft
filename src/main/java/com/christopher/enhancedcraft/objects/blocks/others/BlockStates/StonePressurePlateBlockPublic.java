package com.christopher.enhancedcraft.objects.blocks.others.BlockStates;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.material.Material;

public class StonePressurePlateBlockPublic extends PressurePlateBlock {

    public StonePressurePlateBlockPublic() {
        super(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).doesNotBlockMovement().hardnessAndResistance(0.5F));
    }
}
