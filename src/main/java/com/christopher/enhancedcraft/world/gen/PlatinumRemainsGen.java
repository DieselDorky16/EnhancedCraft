package com.christopher.enhancedcraft.world.gen;

import com.christopher.enhancedcraft.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

public class PlatinumRemainsGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.ICE_SPIKES) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(3, 0, 0, 60));// Count, MinHeight, MaxHeightBase, MaxHeight
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PLATINUM_REMAINS.get().getDefaultState(), 4))
                        .withPlacement(customConfig));
            } else if (biome == Biomes.NETHER) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(0, 0, 0, 0));// Count, MinHeight, MaxHeightBase, MaxHeight
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PLATINUM_REMAINS.get().getDefaultState(), 0))
                        .withPlacement(customConfig));
            } else if (biome == Biomes.THE_END) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(0, 0, 0, 0));// Count, MinHeight, MaxHeightBase, MaxHeight
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PLATINUM_REMAINS.get().getDefaultState(), 0))
                        .withPlacement(customConfig));
            } else if (biome == Biomes.THE_VOID) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(0, 0, 0, 0));// Count, MinHeight, MaxHeightBase, MaxHeight
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PLATINUM_REMAINS.get().getDefaultState(), 0))
                        .withPlacement(customConfig));
            } else {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(2, 0, 0, 30));// Count, MinHeight, MaxHeightBase, MaxHeight
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PLATINUM_REMAINS.get().getDefaultState(), 3))
                        .withPlacement(customConfig));
            }
        }
    }
}
