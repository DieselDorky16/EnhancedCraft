package com.christopher.enhancedcraft.world.dimension;

import com.christopher.enhancedcraft.init.BiomeInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MoreBiomesBiomeProvider  extends BiomeProvider {

    private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.ANGELWOOD_FOREST.get());
    private Random rand;
    private final double biomeSize = 32.0D;
    private VoronoiGenerator biomeNoise;

    public MoreBiomesBiomeProvider(MoreBiomesBiomeProviderSettings settings) {
        super(biomeList);
        rand = new Random();
        this.biomeNoise = new VoronoiGenerator();
        this.biomeNoise.setSeed((int) settings.getSeed());
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return getBiome(new LinkedList<Biome>(biomeList),
                biomeNoise.getValue((double) x / biomeSize, (double) y / biomeSize, (double) z / biomeSize));
    }

    public Biome getBiome(List<Biome> biomeList, double noiseVal) {
        for (int i = biomeList.size(); i >= 0; i--) {
            if (noiseVal > (2.0f / biomeList.size()) * i - 1)
                return biomeList.get(i);
        }
        return biomeList.get(biomeList.size() - 1);
    }
}