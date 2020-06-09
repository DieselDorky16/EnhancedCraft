package com.christopher.enhancedcraft.objects.blocks.BlockStates;

import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;

public class WoodButtonBlockPublic  extends AbstractButtonBlock {
    public WoodButtonBlockPublic(Block.Properties properties) {
        super(true, properties);
    }

    protected SoundEvent getSoundEvent(boolean p_196369_1_) {
        return p_196369_1_ ? SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON : SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF;
    }
}
