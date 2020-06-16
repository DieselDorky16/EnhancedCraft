package com.christopher.enhancedcraft.util;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = EnhancedcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.ANGEL_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ANGEL_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ANGEL_FUNGUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ANGEL_SPROUTS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ANGEL_ROOTS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GLAZED_SOUL_BLOCK.get(), RenderType.getTranslucent());

    }

}
