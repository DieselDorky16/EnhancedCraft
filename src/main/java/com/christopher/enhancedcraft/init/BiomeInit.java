package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.config.UniversalConfig;
import com.christopher.enhancedcraft.world.biome.DeepSnowyTundraBiome;
import com.christopher.enhancedcraft.world.biome.FrozenDesertBiome;
import com.christopher.enhancedcraft.world.biome.FrozenDesertHillsBiome;
import com.christopher.enhancedcraft.world.biome.FrozenMushroomFieldShoreBiome;
import com.christopher.enhancedcraft.world.biome.FrozenMushroomFieldsBiome;
import com.christopher.enhancedcraft.world.biome.FrozenSwampBiome;
import com.christopher.enhancedcraft.world.biome.MountainPeak;
import com.christopher.enhancedcraft.world.biome.MountainPeakWithTreesBiome;
import com.christopher.enhancedcraft.world.biome.PlainsHills;
import com.christopher.enhancedcraft.world.biome.PlainsMountains;
import com.christopher.enhancedcraft.world.biome.SnowyDarkForestBiome;
import com.christopher.enhancedcraft.world.biome.SnowySavannaBiome;
import com.christopher.enhancedcraft.world.biome.SnowySavannaPlateauBiome;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("ALL")
public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
            EnhancedcraftMod.MOD_ID);
    public static final RegistryObject<Biome> PLAINS_HILLS = BIOMES
            .register("plains_hills",
                    PlainsHills::new);
    public static final RegistryObject<Biome> PLAINS_MOUNTAINS = BIOMES
            .register("plains_mountains",
                    PlainsMountains::new);
    public static final RegistryObject<Biome> FROZEN_DESERT = BIOMES
            .register("frozen_desert",
                    FrozenDesertBiome::new);
    public static final RegistryObject<Biome> FROZEN_DESERT_HILLS = BIOMES
            .register("frozen_desert_hills",
                    FrozenDesertHillsBiome::new);
    public static final RegistryObject<Biome> MOUNTAIN_PEAKS = BIOMES
            .register("mountain_peaks",
                    MountainPeak::new);
    public static final RegistryObject<Biome> WOODED_MOUNTAIN_PEAKS = BIOMES
            .register("wooded_mountain_peaks",
                    MountainPeakWithTreesBiome::new);
    public static final RegistryObject<Biome> SNOWY_SAVANNA = BIOMES
            .register("snowy_savanna",
                    SnowySavannaBiome::new);
    public static final RegistryObject<Biome> SNOWY_SAVANNA_PLATEAU = BIOMES
            .register("snowy_savanna_plateau",
                    SnowySavannaPlateauBiome::new);
    public static final RegistryObject<Biome> SNOWY_DARK_FOREST = BIOMES
            .register("snowy_dark_forest",
                    SnowyDarkForestBiome::new);
    public static final RegistryObject<Biome> FROZEN_SWAMP = BIOMES
            .register("frozen_swamp",
                    FrozenSwampBiome::new);
    public static final RegistryObject<Biome> DEEP_SNOWY_TUNDRA = BIOMES
            .register("deep_snowy_tundra",
                    DeepSnowyTundraBiome::new);
    public static final RegistryObject<Biome> FROZEN_MUSHROOM_FIELDS = BIOMES
            .register("frozen_mushroom_fields",
                    FrozenMushroomFieldsBiome::new);
    public static final RegistryObject<Biome> FROZEN_MUSHROOM_FIELDS_SHORE = BIOMES
            .register("frozen_mushroom_fields_shore",
                    FrozenMushroomFieldShoreBiome::new);


    public static void registerBiomes() {
        registerBiomes(PLAINS_HILLS.get(), Type.PLAINS, Type.HILLS, Type.OVERWORLD);
        registerBiomes(PLAINS_MOUNTAINS.get(), Type.PLAINS, Type.MOUNTAIN, Type.OVERWORLD);
        registerBiomes(FROZEN_DESERT.get(), Type.COLD, Type.SNOWY, Type.OVERWORLD);
        registerBiomes(FROZEN_DESERT_HILLS.get(), Type.COLD, Type.HILLS, Type.SNOWY, Type.OVERWORLD);
        registerBiomes(MOUNTAIN_PEAKS.get(), Type.MOUNTAIN, Type.RARE, Type.OVERWORLD);
        registerBiomes(WOODED_MOUNTAIN_PEAKS.get(), Type.MOUNTAIN, Type.RARE, Type.OVERWORLD);
        registerBiomes(SNOWY_SAVANNA.get(), Type.COLD, Type.SNOWY, Type.SAVANNA, Type.OVERWORLD);
        registerBiomes(SNOWY_SAVANNA_PLATEAU.get(), Type.COLD, Type.SNOWY, Type.SAVANNA, Type.PLATEAU, Type.OVERWORLD);
        registerBiomes(SNOWY_DARK_FOREST.get(), Type.FOREST, Type.COLD, Type.OVERWORLD);
        registerBiomes(FROZEN_SWAMP.get(), Type.SWAMP, Type.SNOWY, Type.COLD, Type.OVERWORLD);
        registerBiomes(DEEP_SNOWY_TUNDRA.get(), Type.SNOWY, Type.COLD, Type.OVERWORLD);
        registerBiomes(DEEP_SNOWY_TUNDRA.get(), Type.SNOWY, Type.MUSHROOM, Type.RARE, Type.COLD, Type.OVERWORLD);
    }


    private static void registerBiomes(Biome biome, Type... types) {
        // the line below will make it spawn in the overworld
        if(UniversalConfig.biomes_can_generate.get()) {
            BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 5));
            BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(biome, 5));
            BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 5));
            BiomeDictionary.addTypes(biome, types);
            BiomeManager.addSpawnBiome(biome);
        }


    }

    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
    }
}