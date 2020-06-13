package com.christopher.enhancedcraft.world.dimension;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class MoreBiomesBiomeProviderSettings implements IBiomeProviderSettings {

    private final long seed;
    private final WorldType worldType;
    private MoreBiomesGenSettings generatorSettings = new MoreBiomesGenSettings();

    public MoreBiomesBiomeProviderSettings(WorldInfo info) {
        this.seed = info.getSeed();
        this.worldType = info.getGenerator();
    }

    public MoreBiomesBiomeProviderSettings setGeneratorSettings(MoreBiomesGenSettings settings) {
        this.generatorSettings = settings;
        return this;
    }

    public long getSeed() {
        return this.seed;
    }

    public WorldType getWorldType() {
        return this.worldType;
    }

    public MoreBiomesGenSettings getGeneratorSettings() {
        return this.generatorSettings;
    }
}
