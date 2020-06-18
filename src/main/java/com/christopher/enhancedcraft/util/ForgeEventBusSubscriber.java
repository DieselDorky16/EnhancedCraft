package com.christopher.enhancedcraft.util;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.init.DimensionInit;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {
    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
if (DimensionType.byName(EnhancedcraftMod.ANGELWOOD_LANDS_DIM_TYPE) == null) {
            DimensionManager.registerDimension(EnhancedcraftMod.ANGELWOOD_LANDS_DIM_TYPE, DimensionInit.ANGELWOOD_LANDS_DIM.get(),null, false);
        }
        EnhancedcraftMod.LOGGER.info("Dimensions Registered!");
    }
}
