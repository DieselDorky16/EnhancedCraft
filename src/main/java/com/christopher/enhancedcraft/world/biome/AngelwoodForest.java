package com.christopher.enhancedcraft.world.biome;

import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class AngelwoodForest extends Biome {
    public AngelwoodForest() {
        super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.ANGEL_NYLIUM.get().getDefaultState(), Blocks.NETHERRACK.getDefaultState(), Blocks.GRAVEL.getDefaultState())).precipitation(Biome.RainType.NONE).category(Category.PLAINS).depth(0.45F).scale(0.3F).temperature(3.0F).downfall(0.0F).waterColor(4159204).waterFogColor(329011).parent((String)null));
        this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.RANDOM_PATCH.withConfiguration(BiomeFeatureEC.ANGEL_FUNGUS_CONFIG).withPlacement(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(1.0F, 0, 0, 255))));
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addMonsterRooms(this);
        DefaultBiomeFeatures.addSedimentDisks(this);
        DefaultBiomeFeatures.addScatteredSpruceTrees(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addFreezeTopLayer(this);
        this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE_PIGMAN, 100, 4, 4));
    }

    /**
     * returns the chance a creature has to spawn.
     */
    public float getSpawningChance() {
        return 0.07F;
    }
}
