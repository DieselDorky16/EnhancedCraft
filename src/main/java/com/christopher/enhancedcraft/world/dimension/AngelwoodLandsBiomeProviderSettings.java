package com.christopher.enhancedcraft.world.dimension;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class AngelwoodLandsBiomeProviderSettings implements IBiomeProviderSettings {

    private final long seed;
    private final WorldType worldType;
    private AngelwoodLandsGenSettings generatorSettings = new AngelwoodLandsGenSettings();

    public AngelwoodLandsBiomeProviderSettings(WorldInfo info) {
        this.seed = info.getSeed();
        this.worldType = info.getGenerator();
    }

    public AngelwoodLandsBiomeProviderSettings setGeneratorSettings(AngelwoodLandsGenSettings settings) {
        this.generatorSettings = settings;
        return this;
    }

    public long getSeed() {
        return this.seed;
    }

    public WorldType getWorldType() {
        return this.worldType;
    }

    public AngelwoodLandsGenSettings getGeneratorSettings() {
        return this.generatorSettings;
    }
}
