package com.christopher.enhancedcraft.world.feature;

import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;

public class BiomeFeatureEC extends DefaultBiomeFeatures {
    private static final BlockState ANGEL_FUNGUS = BlockInit.ANGEL_FUNGUS.get().getDefaultState();
    private static final BlockState ANGEL_ROOTS = BlockInit.ANGEL_ROOTS.get().getDefaultState();
    private static final BlockState ANGEL_SPROUTS = BlockInit.ANGEL_SPROUTS.get().getDefaultState();
    public static final BlockClusterFeatureConfig ANGEL_FUNGUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ANGEL_FUNGUS), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig ANGEL_ROOTS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ANGEL_ROOTS), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig ANGEL_SPROUTS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ANGEL_SPROUTS), new SimpleBlockPlacer())).tries(32).build();
    public static void addAngelRoots(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(ANGEL_ROOTS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(2))));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(ANGEL_SPROUTS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(2))));
    }
}
