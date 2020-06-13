package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.world.dimension.MoreBiomesDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {
    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<> (ForgeRegistries.MOD_DIMENSIONS, EnhancedcraftMod.MOD_ID);
    public static final RegistryObject<ModDimension> MORE_BIOMES_DIM = MOD_DIMENSIONS.register("angelwood_lands",()-> new MoreBiomesDimension());
}
