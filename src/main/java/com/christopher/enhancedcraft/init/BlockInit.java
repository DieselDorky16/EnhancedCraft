package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.contents.blocks.CharredSoulSpongeBlock;
import com.christopher.enhancedcraft.contents.blocks.SoulSpongeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, EnhancedcraftMod.MOD_ID);
    public static void init() {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    /*
    Add the blocks that are needed to be separated
    */

    public static final RegistryObject<Block> SOUL_SPONGE = BLOCKS.register("soul_sponge", () -> new SoulSpongeBlock(Block.Properties.create(Material.SPONGE).hardnessAndResistance(0.6F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARRED_SOUL_SPONGE = BLOCKS.register("charred_soul_sponge", () -> new CharredSoulSpongeBlock(Block.Properties.create(Material.SPONGE).hardnessAndResistance(0.6F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SOUL_GLOWSTONE = BLOCKS.register("soul_glowstone",()-> new Block(Block.Properties.create(Material.GLASS, MaterialColor.SAND).hardnessAndResistance(0.3F).sound(SoundType.GLASS).lightValue(10)));
}
