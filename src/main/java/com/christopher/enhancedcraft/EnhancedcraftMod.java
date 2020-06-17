package com.christopher.enhancedcraft;

import com.christopher.enhancedcraft.init.BiomeInit;
import com.christopher.enhancedcraft.init.BlockInit;
import com.christopher.enhancedcraft.init.BlockItemInit;
import com.christopher.enhancedcraft.init.DimensionInit;
import com.christopher.enhancedcraft.init.EnchantmentInit;
import com.christopher.enhancedcraft.init.ItemInit;
import com.christopher.enhancedcraft.init.PotionInit;
import com.christopher.enhancedcraft.world.gen.PlatinumRemainsGen;
import com.christopher.enhancedcraft.world.gen.SoulstoneVeinGen;
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
        PotionInit.POTIONS.register(modEventBus);
        PotionInit.POTION_EFFECTS.register(modEventBus);
        BlockItemInit.init();

        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("All elements of the mod have been initialized!");
        LOGGER.debug("All elements of the mod should have been initialized!. If you are not seeing anything, or if the mod won't load, please use GitHub to report any issues!");

    }

    @Deprecated //Do not remove or it will break the mod.
    private void setup(final FMLCommonSetupEvent event) {

        DeferredWorkQueue.runLater(PlatinumRemainsGen::generateOre);
        DeferredWorkQueue.runLater(SoulstoneVeinGen::generateOre);
        LOGGER.info("All ores have been registered!");
        LOGGER.debug("The ores in this mod should have been generated. If you are not seeing any ores, please use GitHub to report any issues!");

    } //K9#8016

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
        LOGGER.info("Biomes successfully registered!");
        LOGGER.debug("The biomes in this mod should have been generated. If you are not seeing any biomes naturally generate, please use GitHub to report any issues!");
    }
}
