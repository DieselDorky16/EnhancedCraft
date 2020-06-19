package com.christopher.enhancedcraft.init.vanilla;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
/*
IMPORTANT:
This class is specifically for registering modded variants of vanilla blocks. No, this does not include new full block variants, just for stairs, slabs, walls, fences, etc.
*/

@SuppressWarnings("ALL")
public class VanillaBlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, EnhancedcraftMod.MOD_ID);
    public static void init() {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
        public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = BLOCKS.register("smooth_stone_stairs",
                () -> new StairsBlock(Blocks.SMOOTH_STONE::getDefaultState,Block.Properties.from(Blocks.SMOOTH_STONE)));
    }
