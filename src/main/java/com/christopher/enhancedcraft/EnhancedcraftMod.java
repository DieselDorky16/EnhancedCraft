package com.christopher.enhancedcraft;

import com.christopher.enhancedcraft.init.*;
import com.christopher.enhancedcraft.util.RegistryHandler;
import com.christopher.enhancedcraft.world.gen.PlatinumRemainsGen;
import com.christopher.enhancedcraft.world.gen.SoulstoneVeinGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("enhancedcraft")
@Mod.EventBusSubscriber(modid = EnhancedcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnhancedcraftMod {


    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "enhancedcraft";
    public static final ResourceLocation MORE_BIOMES_DIM_TYPE = new ResourceLocation(MOD_ID, "angelwood_lands");


    public EnhancedcraftMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EnchantmentInit.ENCHANTMENTS.register(modEventBus);


        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Deprecated //Do not remove or it will break the mod.
    private void setup(final FMLCommonSetupEvent event) {

        DeferredWorkQueue.runLater(PlatinumRemainsGen::generateOre);
        DeferredWorkQueue.runLater(SoulstoneVeinGen::generateOre);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
//PlatinumRemainsGen.generateOre();
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
        LOGGER.debug("Biomes Registered!");
    }

    public static final ItemGroup SOUL_PRODUCTS = new ItemGroup("soul_products") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.SOUL_MAGMA_BLOCK.get());
        }
    };
}
