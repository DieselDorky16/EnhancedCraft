package com.christopher.enhancedcraft.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class UniversalConfig {
    public static ForgeConfigSpec.IntValue enhancedcraft_chance;
    public static ForgeConfigSpec.BooleanValue biomes_can_generate;
    public static ForgeConfigSpec.IntValue soulstone_vein_size;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Universal Settings Config. Customize your main mod settings here.");

        enhancedcraft_chance = server
                .comment("Maximum number of Soulstone veins that can spawn in one chunk")
                .defineInRange("morebiomes.enhancedcraft_chance", 10, 0, 20);
        biomes_can_generate = server
                .comment ("Should the biomes generate at all. This only applies to custom ones.")
                .define ("biomegen.biomes_can_generate",true);
        soulstone_vein_size = server
                .comment ("The size of an individual soulstone vein that can generate in the Nether.")
                .defineInRange("soulstone.soulstone_vein_size",12,0,64);
    }
}
