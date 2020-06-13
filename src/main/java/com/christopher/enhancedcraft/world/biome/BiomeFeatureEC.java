package com.christopher.enhancedcraft.world.biome;

import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public class BiomeFeatureEC extends DefaultBiomeFeatures {
    private static final BlockState ANGEL_FUNGUS = BlockInit.ANGEL_FUNGUS.get().getDefaultState();
    public static final BlockClusterFeatureConfig ANGEL_FUNGUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ANGEL_FUNGUS), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
}
