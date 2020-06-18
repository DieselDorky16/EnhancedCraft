package com.christopher.enhancedcraft.world.gen;

import com.christopher.enhancedcraft.config.UniversalConfig;
import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

/*
When Forge 1.16 comes out, replace Biomes.NETHER with Biomes.netherBiomeNew, and make sure you add the else if statement for every biome.
Make sure not to use just else. Otherwise, Soulstone WILL GENERATE IN THE OVERWORLD, which is something we do not want in this mod.
 */

public class SoulstoneVeinGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.NETHER) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(UniversalConfig.enhancedcraft_chance.get(), 0, 0, 120));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.SOULSTONE.get().getDefaultState(), UniversalConfig.soulstone_vein_size.get()))
                        .withPlacement(customConfig));
            }
        }
    }
}
