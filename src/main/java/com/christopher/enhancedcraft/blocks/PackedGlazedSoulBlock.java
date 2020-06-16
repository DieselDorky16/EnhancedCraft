package com.christopher.enhancedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PackedGlazedSoulBlock extends Block {
    public PackedGlazedSoulBlock() {
        super(Properties.create(Material.ICE).slipperiness(1.50F).hardnessAndResistance(0.5F).sound(SoundType.GLASS));
    }
}
