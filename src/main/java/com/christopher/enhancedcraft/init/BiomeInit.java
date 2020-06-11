package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;

import com.christopher.enhancedcraft.world.biome.FrozenDesert;
import com.christopher.enhancedcraft.world.biome.MountainPeak;
import com.christopher.enhancedcraft.world.biome.PlainsHills;
import com.christopher.enhancedcraft.world.biome.PlainsMountains;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
            EnhancedcraftMod.MOD_ID);
    public static final RegistryObject<Biome> PLAINS_HILLS = BIOMES
            .register("plains_hils",
                    PlainsHills::new);
    public static final RegistryObject<Biome> PLAINS_MOUNTAINS = BIOMES
            .register("plains_mountains",
                    PlainsMountains::new);
    public static final RegistryObject<Biome> FROZEN_DESERT = BIOMES
            .register("frozen_desert",
                    FrozenDesert::new);
    public static final RegistryObject<Biome> MOUNTAIN_PEAKS = BIOMES
            .register("mountain_peaks",
                    MountainPeak::new);

    public static void registerBiomes() {
        registerBiomes(PLAINS_HILLS.get(), Type.PLAINS, Type.OVERWORLD);
        registerBiomes(PLAINS_MOUNTAINS.get(), Type.PLAINS, Type.OVERWORLD);
        registerBiomes(FROZEN_DESERT.get(), Type.SNOWY, Type.OVERWORLD);
        registerBiomes(MOUNTAIN_PEAKS.get(), Type.MOUNTAIN, Type.OVERWORLD);
    }

    private static void registerBiomes(Biome biome, Type... types) {
        // the line below will make it spawn in the overworld
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 5));
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 30));
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);


    }

    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
    }
}