package com.christopher.enhancedcraft.objects.blocks.others.BlockStates;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagmaGlazedSoulBlock extends Block {
    public MagmaGlazedSoulBlock() {
        super(Properties.create(Material.ICE).slipperiness(2.25F).hardnessAndResistance(0.5F).sound(SoundType.GLASS));
    }
}
