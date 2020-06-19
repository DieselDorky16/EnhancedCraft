package com.christopher.enhancedcraft.world.biome;

import com.christopher.enhancedcraft.init.BlockInit;
import com.christopher.enhancedcraft.world.feature.AngelHugeFungus;
import com.christopher.enhancedcraft.world.feature.BiomeFeatureEC;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

@SuppressWarnings("ALL")
public class AngelwoodForest extends Biome {
    public AngelwoodForest() {
        super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.ANGEL_NYLIUM.get().getDefaultState(), Blocks.NETHERRACK.getDefaultState(), Blocks.NETHERRACK.getDefaultState())).precipitation(Biome.RainType.NONE).category(Category.NETHER).depth(0.45F).scale(0.3F).temperature(3.0F).downfall(0.0F).waterColor(4159204).waterFogColor(329011).parent((String)null));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                Feature.NORMAL_TREE.withConfiguration(AngelHugeFungus.ANGEL_HUGE_FUNGUS_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.1f, 1))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SPRING_FEATURE.withConfiguration(DefaultBiomeFeatures.LAVA_SPRING_CONFIG).withPlacement(Placement.COUNT_VERY_BIASED_RANGE.configure(new CountRangeConfig(20, 8, 16, 256))));
        this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SPRING_FEATURE.withConfiguration(DefaultBiomeFeatures.NETHER_SPRING_CONFIG).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 4, 8, 128))));
        this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BiomeFeatureEC.ANGEL_ROOTS_CONFIG).withPlacement(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(1.0F, 0, 0, 128))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BiomeFeatureEC.ANGEL_ROOTS_CONFIG).withPlacement(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(1.0F, 0, 0, 120))));
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addFreezeTopLayer(this);
        BiomeFeatureEC.addAngelRoots(this);
        this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE_PIGMAN, 100, 4, 4));
        this.addSpawn(EntityClassification.MISC, new Biome.SpawnListEntry(EntityType.PIG, 100, 4, 4));
    }

    /**
     * returns the chance a creature has to spawn.
     */
    public float getSpawningChance() {
        return 0.07F;
    }
}
