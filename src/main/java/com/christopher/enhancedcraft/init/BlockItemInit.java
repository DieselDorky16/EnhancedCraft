package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.item.blockitems.BuildBlockItemBase;
import com.christopher.enhancedcraft.item.blockitems.DecorativeBlocks;
import com.christopher.enhancedcraft.item.blockitems.MetalicItemBase;
import com.christopher.enhancedcraft.item.blockitems.OreItemBase;
import com.christopher.enhancedcraft.item.blockitems.RedstoneBlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
IMPORTANT:
This java class is only to be used for initializing BlockItems. For blocks, inside the same location as this file; see BlockInit class. For Items itself, see ItemInit class.

WARNINGS:
DO NOT DELETE THIS, or the items will only be available through the /setblock command.

In Christ,
Christopher Lewis, lead and only developer of EnhancedcraftMod
*/

public class BlockItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EnhancedcraftMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, EnhancedcraftMod.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //BLOCK-ITEMS
    public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block", () -> new MetalicItemBase(BlockInit.PLATINUM_BLOCK.get()));
    public static final RegistryObject<Item> PLATINUM_REMAINS_ITEM = ITEMS.register("platinum_remains", () -> new OreItemBase(BlockInit.PLATINUM_REMAINS.get()));
    public static final RegistryObject<Item> SOUL_MAGMA_BLOCK_ITEM = ITEMS.register("soul_magma_block", () -> new BuildBlockItemBase(BlockInit.SOUL_MAGMA_BLOCK.get()));
    public static final RegistryObject<Item> SOUL_FURNACE_BLOCK_ITEM = ITEMS.register("soul_furnace", () -> new DecorativeBlocks(BlockInit.SOUL_FURNACE.get()));
    public static final RegistryObject<Item> SOUL_END_ROD_ITEM = ITEMS.register("soul_end_rod", () -> new DecorativeBlocks(BlockInit.SOUL_END_ROD.get()));
    public static final RegistryObject<Item> SOUL_REDSTONE_LAMP_ITEM = ITEMS.register("soul_redstone_lamp", () -> new RedstoneBlockItemBase(BlockInit.SOUL_REDSTONE_LAMP.get()));
    public static final RegistryObject<Item> SOUL_GLOWSTONE_ITEM = ITEMS.register("soul_glowstone", () -> new BuildBlockItemBase(BlockInit.SOUL_GLOWSTONE.get()));
    public static final RegistryObject<Item> GLAZED_SOUL_BLOCK_ITEM = ITEMS.register("glazed_soulstone", () -> new BuildBlockItemBase(BlockInit.GLAZED_SOUL_BLOCK.get()));
    public static final RegistryObject<Item> PACKED_GLAZED_SOUL_BLOCK_ITEM = ITEMS.register("packed_glazed_soulstone", () -> new BuildBlockItemBase(BlockInit.PACKED_GLAZED_SOULSTONE_BLOCK.get()));
    public static final RegistryObject<Item> MAGMA_GLAZED_SOUL_BLOCK_ITEM = ITEMS.register("magma_glazed_soulstone", () -> new BuildBlockItemBase(BlockInit.MAGMA_GLAZED_SOULSTONE_BLOCK.get()));


    //Soulstone BlockItem
    public static final RegistryObject<Item> SOULSTONE_ITEM = ITEMS.register("soulstone", () -> new BuildBlockItemBase(BlockInit.SOULSTONE.get()));
    public static final RegistryObject<Item> CHISELED_POLISHED_SOULSTONE_ITEM = ITEMS.register("chiseled_polished_soulstone", () -> new BuildBlockItemBase(BlockInit.CHISELED_POLISHED_SOULSTONE.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_ITEM = ITEMS.register("polished_soulstone", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_ITEM = ITEMS.register("polished_soulstone_bricks", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_BRICKS.get()));
    public static final RegistryObject<Item> CRACKED_POLISHED_SOULSTONE_BRICK_ITEM = ITEMS.register("cracked_polished_soulstone_bricks", () -> new BuildBlockItemBase(BlockInit.CRACKED_POLISHED_SOULSTONE_BRICKS.get()));
    public static final RegistryObject<Item> GILDED_SOULSTONE_ITEM = ITEMS.register("gilded_soulstone", () -> new BuildBlockItemBase(BlockInit.GILDED_SOULSTONE.get()));


    //Soulstone Stairs BlockItem
    public static final RegistryObject<Item> SOULSTONE_STAIRS_ITEM = ITEMS.register("soulstone_stairs", () -> new BuildBlockItemBase(BlockInit.SOULSTONE_STAIRS.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_STAIRS_ITEM = ITEMS.register("polished_soulstone_stairs", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_STAIRS.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_STAIRS_ITEM = ITEMS.register("polished_soulstone_brick_stairs", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_BRICK_STAIRS.get()
    ));

    //Soulstone Slab BlockItem
    public static final RegistryObject<Item> SOULSTONE_SLAB_ITEM = ITEMS.register("soulstone_slab", () -> new BuildBlockItemBase(BlockInit.SOULSTONE_SLAB.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_SLAB_ITEM = ITEMS.register("polished_soulstone_slab", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_SLAB.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_SLAB_ITEM = ITEMS.register("polished_soulstone_brick_slab", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_BRICK_SLAB.get()
    ));

    //Soulstone Wall BlockItem
    public static final RegistryObject<Item> SOULSTONE_WALL_ITEM = ITEMS.register("soulstone_wall", () -> new BuildBlockItemBase(BlockInit.SOULSTONE_WALL.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_WALL_ITEM = ITEMS.register("polished_soulstone_wall", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_WALL.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_WALL_ITEM = ITEMS.register("polished_soulstone_brick_wall", () -> new BuildBlockItemBase(BlockInit.POLISHED_SOULSTONE_BRICK_WALL.get()
    ));

    //Other Soulstone BlockItem
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BUTTON_ITEM = ITEMS.register("polished_soulstone_button", () -> new RedstoneBlockItemBase(BlockInit.POLISHED_SOULSTONE_BUTTON.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_soulstone_pressure_plate", () -> new RedstoneBlockItemBase(BlockInit.POLISHED_SOULSTONE_PRESSURE_PLATE.get()
    ));

    //Lava Sponges
    public static final RegistryObject<Item> SOUL_SPONGE_ITEM = ITEMS.register("soul_sponge", () -> new BuildBlockItemBase(BlockInit.SOUL_SPONGE.get())
    );
    public static final RegistryObject<Item> CHARRED_SOUL_SPONGE_ITEM = ITEMS.register("charred_soul_sponge", () -> new BuildBlockItemBase(BlockInit.CHARRED_SOUL_SPONGE.get()
    ));

    //Wood Blocks
    public static final RegistryObject<Item> ANGEL_DOOR_ITEM = ITEMS.register("angel_door", () -> new RedstoneBlockItemBase(BlockInit.ANGEL_DOOR.get())
    );
    public static final RegistryObject<Item> ANGEL_PLANKS_ITEM = ITEMS.register("angel_planks", () -> new BuildBlockItemBase(BlockInit.ANGEL_PLANKS.get())
    );
    public static final RegistryObject<Item> ANGEL_STEM_ITEM = ITEMS.register("angel_stem", () -> new BuildBlockItemBase(BlockInit.ANGEL_STEM.get())
    );
    public static final RegistryObject<Item> STRIPPED_ANGEL_STEM_ITEM = ITEMS.register("stripped_angel_stem", () -> new BuildBlockItemBase(BlockInit.STRIPPED_ANGEL_STEM.get())
    );
    public static final RegistryObject<Item> ANGEL_TRAPDOOR = ITEMS.register("angel_trapdoor", () -> new RedstoneBlockItemBase(BlockInit.ANGEL_TRAPDOOR.get())
    );
    public static final RegistryObject<Item> ANGEL_WART = ITEMS.register("angel_wart", () -> new DecorativeBlocks(BlockInit.ANGEL_WART.get())
    );
    public static final RegistryObject<Item> ANGEL_HYPHAE_ITEM = ITEMS.register("angel_hyphae", () -> new BuildBlockItemBase(BlockInit.ANGEL_HYPHAE.get())
    );
    public static final RegistryObject<Item> STRIPPED_ANGEL_HYPHAE_ITEM = ITEMS.register("stripped_angel_hyphae", () -> new BuildBlockItemBase(BlockInit.STRIPPED_ANGEL_HYPHAE.get())
    );
    public static final RegistryObject<Item> ANGEL_SLAB_ITEM = ITEMS.register("angel_slab", () -> new BuildBlockItemBase(BlockInit.ANGEL_SLAB.get())
    );
    public static final RegistryObject<Item> ANGEL_STAIRS_ITEM= ITEMS.register("angel_stairs", () -> new BuildBlockItemBase(BlockInit.ANGEL_STAIRS.get())
    );
    public static final RegistryObject<Item> ANGEL_BUTTON_ITEM = ITEMS.register("angel_button", () -> new RedstoneBlockItemBase(BlockInit.ANGEL_BUTTON.get())
    );
    public static final RegistryObject<Item> ANGEL_PRESSURE_PLATE_ITEM = ITEMS.register("angel_pressure_plate", () -> new RedstoneBlockItemBase(BlockInit.ANGEL_PRESSURE_PLATE.get())
    );
    public static final RegistryObject<Item> ANGEL_FENCE_ITEM = ITEMS.register("angel_fence", () -> new DecorativeBlocks(BlockInit.ANGEL_FENCE.get())
    );
    public static final RegistryObject<Item> ANGEL_FENCE_GATE_ITEM = ITEMS.register("angel_fence_gate", () -> new RedstoneBlockItemBase(BlockInit.ANGEL_FENCE_GATE.get())
    );

    /*
    Polished Bricks and/or Brick variants
     */
    public static final RegistryObject<Item> POLISHED_ANDESITE_BRICK_ITEM = ITEMS.register("polished_andesite_bricks", () -> new BuildBlockItemBase(BlockInit.POLISHED_ANDESITE_BRICKS.get())
    );
    public static final RegistryObject<Item> POLISHED_DIORITE_BRICK_ITEM = ITEMS.register("polished_diorite_bricks", () -> new BuildBlockItemBase(BlockInit.POLISHED_DIORITE_BRICKS.get())
    );
    public static final RegistryObject<Item> POLISHED_GRANITE_BRICK_ITEM = ITEMS.register("polished_granite_bricks", () -> new BuildBlockItemBase(BlockInit.POLISHED_GRANITE_BRICKS.get())
    );
    public static final RegistryObject<Item> RED_SANDSTONE_BRICK_ITEM = ITEMS.register("red_sandstone_bricks", () -> new BuildBlockItemBase(BlockInit.RED_SANDSTONE_BRICKS.get())
    );
    public static final RegistryObject<Item> SANDSTONE_BRICK_ITEM = ITEMS.register("sandstone_bricks", () -> new BuildBlockItemBase(BlockInit.SANDSTONE_BRICKS.get())
    );

    //LIFE
    public static final RegistryObject<Item> ANGEL_FUNGUS_ITEM = ITEMS.register("angel_fungus", () -> new DecorativeBlocks(BlockInit.ANGEL_FUNGUS.get())
    );
    public static final RegistryObject<Item> ANGEL_NYLIUM_ITEM = ITEMS.register("angel_nylium", () -> new BuildBlockItemBase(BlockInit.ANGEL_NYLIUM.get())
    );
    public static final RegistryObject<Item> ANGEL_ROOTS_ITEM = ITEMS.register("angel_roots", () -> new DecorativeBlocks(BlockInit.ANGEL_ROOTS.get())
    );
    public static final RegistryObject<Item> ANGEL_SPROUTS_ITEM = ITEMS.register("angel_sprouts", () -> new DecorativeBlocks(BlockInit.ANGEL_SPROUTS.get())
    );

    //Maroon
    public static final RegistryObject<Item> MAROON_WOOL_ITEM = ITEMS.register("maroon_wool", () -> new BuildBlockItemBase(BlockInit.MAROON_WOOL.get())
    );
    public static final RegistryObject<Item> MAROON_CONCRETE_ITEM = ITEMS.register("maroon_concrete", () -> new BuildBlockItemBase(BlockInit.MAROON_CONCRETE.get())
    );
    public static final RegistryObject<Item> MAROON_CONCRETE_POWDER_ITEM = ITEMS.register("maroon_concrete_powder", () -> new BuildBlockItemBase(BlockInit.MAROON_CONCRETE_POWDER.get())
    );
    public static final RegistryObject<Item> MAROON_TERRACOTTA_ITEM = ITEMS.register("maroon_terracotta", () -> new BuildBlockItemBase(BlockInit.MAROON_TERRACOTTA.get())
    );
    public static final RegistryObject<Item> MAROON_GLAZED_TERRACOTTA_ITEM = ITEMS.register("maroon_glazed_terracotta", () -> new BuildBlockItemBase(BlockInit.MAROON_GLAZED_TERRACOTTA.get())
    );
    public static final RegistryObject<Item> MAROON_CARPET = ITEMS.register("maroon_carpet", () -> new BuildBlockItemBase(BlockInit.MAROON_CARPET.get())
    );

    //Plant Life
    public static final RegistryObject<Item> ANEMONE_ITEM = ITEMS.register("anemone", () -> new BuildBlockItemBase(BlockInit.ANEMONE.get())
    );
}