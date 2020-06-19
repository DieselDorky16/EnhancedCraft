package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.world.biome.AngelwoodForest;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class UnusedBiomesInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
            EnhancedcraftMod.MOD_ID);
    public static final RegistryObject<Biome> ANGELWOOD_FOREST = BIOMES
            .register("angelwood_forest",
                    AngelwoodForest::new);
    public static void registerBiomes() {
        registerBiomes(ANGELWOOD_FOREST.get(), BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.NETHER);
    }
    private static void registerBiomes(Biome biome, BiomeDictionary.Type... types) {
        // the line below will make it spawn in the overworld
            BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 5));
            BiomeDictionary.addTypes(biome, types);
            BiomeManager.addSpawnBiome(biome);
        }
    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
    }
}
