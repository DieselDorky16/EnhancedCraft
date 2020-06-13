package com.christopher.enhancedcraft.world.feature;

import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;

import java.util.Random;

public class AngelHugeFungus extends Tree{

    public static final TreeFeatureConfig ANGEL_HUGE_FUNGUS_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.ANGEL_STEM.get().getDefaultState()), new SimpleBlockStateProvider(BlockInit.ANGEL_WART.get().getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(8).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable) BlockInit.ANGEL_FUNGUS.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(ANGEL_HUGE_FUNGUS_CONFIG);
    }
}
