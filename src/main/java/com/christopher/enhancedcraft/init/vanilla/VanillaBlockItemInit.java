package com.christopher.enhancedcraft.init.vanilla;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.item.blockitems.BuildBlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
/*
IMPORTANT:
This class is specifically for registering modded variants of vanilla blocks. No, this does not include new full block variants, just for stairs, slabs, walls, fences, etc.
*/
public class VanillaBlockItemInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, EnhancedcraftMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EnhancedcraftMod.MOD_ID);
    public static void init() {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Item> SMOOTH_STONE_STAIRS_ITEM = ITEMS.register("smooth_stone_stairs", () -> new BuildBlockItemBase(VanillaBlockInit.SMOOTH_STONE_STAIRS.get()));
}
