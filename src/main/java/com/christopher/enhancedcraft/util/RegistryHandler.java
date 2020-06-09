package com.christopher.enhancedcraft.util;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.objects.blocks.BlockItem.*;
import com.christopher.enhancedcraft.objects.items.ToolsRegistry.platinum.*;
import com.christopher.enhancedcraft.objects.blocks.BlockStates.*;
import com.christopher.enhancedcraft.objects.items.OtherGroup;
import com.christopher.enhancedcraft.objects.items.SoulMaterialsItem;
import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EnhancedcraftMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, EnhancedcraftMod.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //ITEMS SECTION

    //Raw Materials (No Base Ingots or Equivalent, please see ItemInit Class)
    public static final RegistryObject<Item> PLATINUM_SCRAP = ITEMS.register("platinum_scrap", OtherGroup::new);
    public static final RegistryObject<Item> SOUL_MAGMA_CREAM = ITEMS.register("soul_magma_cream", SoulMaterialsItem::new);

    //Tools
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", PlatinumPick::new);
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", PlatinumAxe::new);
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", PlatinumShovel::new);
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", PlatinumHoe::new);

    //Weapons
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", PlatinumSword::new);
    /*
    CANNOT BE USED, BUT FILES ARE PRESENT
    public static final RegistryObject<Item> PLATINUM_BOW = ITEMS.register("platinum_bow",PlatinumBow::new);
*/

    //BLOCKS
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", PlatinumBlock::new);
    public static final RegistryObject<Block> PLATINUM_REMAINS = BLOCKS.register("platinum_remains", PlatinumOre::new);
    public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = BLOCKS.register("soul_magma_block", SoulMagmaBlock::new);
    public static final RegistryObject<Block> SOUL_FURNACE = BLOCKS.register("soul_furnace", SoulFurnaceBlock::new);
    public static final RegistryObject<Block> SOUL_END_ROD = BLOCKS.register("soul_end_rod", SoulEndRod::new);
    public static final RegistryObject<Block> SOUL_REDSTONE_LAMP = BLOCKS.register("soul_redstone_lamp", SoulRedstoneLamp::new);
    public static final RegistryObject<Block> GLAZED_SOUL_BLOCK = BLOCKS.register("glazed_soulstone", GlazedSoulBlock::new);


    //Soulstone BlockBases
    public static final RegistryObject<Block> SOULSTONE = BLOCKS.register("soulstone", Soulstone::new);
    public static final RegistryObject<Block> POLISHED_SOULSTONE = BLOCKS.register("polished_soulstone", Soulstone::new);
    public static final RegistryObject<Block> CHISELED_POLISHED_SOULSTONE = BLOCKS.register("chiseled_polished_soulstone", Soulstone::new);
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICKS = BLOCKS.register("polished_soulstone_bricks", Soulstone::new);
    public static final RegistryObject<Block> CRACKED_POLISHED_SOULSTONE_BRICKS = BLOCKS.register("cracked_polished_soulstone_bricks", Soulstone::new);
    public static final RegistryObject<Block> GILDED_SOULSTONE = BLOCKS.register("gilded_soulstone", Soulstone::new);

    //Soulstone BlockStairs
    public static final RegistryObject<Block> SOULSTONE_STAIRS = BLOCKS.register("soulstone_stairs",
            () -> new StairsBlock(() -> RegistryHandler.SOULSTONE.get().getDefaultState(),
                    Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(15.0F, 6.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_STAIRS = BLOCKS.register("polished_soulstone_stairs",
            () -> new StairsBlock(() -> RegistryHandler.POLISHED_SOULSTONE.get().getDefaultState(),
                    Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(15.0F, 6.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICK_STAIRS = BLOCKS.register("polished_soulstone_brick_stairs",
            () -> new StairsBlock(() -> RegistryHandler.POLISHED_SOULSTONE_BRICKS.get().getDefaultState(),
                    Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(15.0F, 6.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    //Soulstone Slab BlockBases

    public static final RegistryObject<Block> SOULSTONE_SLAB = BLOCKS.register("soulstone_slab", ()-> new SlabBlock(Block.Properties.from(RegistryHandler.SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_SLAB = BLOCKS.register("polished_soulstone_slab", ()-> new SlabBlock(Block.Properties.from(RegistryHandler.POLISHED_SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICK_SLAB = BLOCKS.register("polished_soulstone_brick_slab", ()-> new SlabBlock(Block.Properties.from(RegistryHandler.POLISHED_SOULSTONE_BRICKS.get())));

    //SoulStone Wall BlockBases
    public static final RegistryObject<Block> SOULSTONE_WALL = BLOCKS.register("soulstone_wall",()-> new WallBlock(Block.Properties.from(RegistryHandler.SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_WALL = BLOCKS.register("polished_soulstone_wall",()-> new WallBlock(Block.Properties.from(RegistryHandler.POLISHED_SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICK_WALL = BLOCKS.register("polished_soulstone_brick_wall",()-> new WallBlock(Block.Properties.from(RegistryHandler.POLISHED_SOULSTONE_BRICKS.get())));

    //Other Soulstone BlockBases
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BUTTON = BLOCKS.register("polished_soulstone_button",()-> new StoneButtonBlockPublic(Block.Properties.from(RegistryHandler.POLISHED_SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_PRESSURE_PLATE = BLOCKS.register("polished_soulstone_pressure_plate", StonePressurePlateBlockPublic::new);

    //BLOCK-ITEMS
    public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block", () -> new MetalicItemBase(PLATINUM_BLOCK.get()));
    public static final RegistryObject<Item> PLATINUM_REMAINS_ITEM = ITEMS.register("platinum_remains", () -> new OreItemBase(PLATINUM_REMAINS.get()));
    public static final RegistryObject<Item> SOUL_MAGMA_BLOCK_ITEM = ITEMS.register("soul_magma_block", () -> new SoulMaterials(SOUL_MAGMA_BLOCK.get()));
    public static final RegistryObject<Item> SOUL_FURNACE_BLOCK_ITEM = ITEMS.register("soul_furnace", () -> new DecorativeBlocks(SOUL_FURNACE.get()));
    public static final RegistryObject<Item> SOUL_END_ROD_ITEM = ITEMS.register("soul_end_rod", () -> new DecorativeBlocks(SOUL_END_ROD.get()));
    public static final RegistryObject<Item> SOUL_REDSTONE_LAMP_ITEM = ITEMS.register("soul_redstone_lamp", () -> new RedstoneBlockItemBase(SOUL_REDSTONE_LAMP.get()));
    public static final RegistryObject<Item> SOUL_GLOWSTONE_ITEM = ITEMS.register("soul_glowstone", () -> new BuildBlockItemBase(BlockInit.SOUL_GLOWSTONE.get()));
    public static final RegistryObject<Item> GLAZED_SOUL_BLOCK_ITEM = ITEMS.register("glazed_soulstone", () -> new BuildBlockItemBase(GLAZED_SOUL_BLOCK.get()));

    //Soulstone BlockItem
    public static final RegistryObject<Item> SOULSTONE_ITEM = ITEMS.register("soulstone", () -> new BuildBlockItemBase(SOULSTONE.get()));
    public static final RegistryObject<Item> CHISELED_POLISHED_SOULSTONE_ITEM = ITEMS.register("chiseled_polished_soulstone", () -> new BuildBlockItemBase(CHISELED_POLISHED_SOULSTONE.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_ITEM = ITEMS.register("polished_soulstone", () -> new BuildBlockItemBase(POLISHED_SOULSTONE.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_ITEM = ITEMS.register("polished_soulstone_bricks", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_BRICKS.get()));
    public static final RegistryObject<Item> CRACKED_POLISHED_SOULSTONE_BRICK_ITEM = ITEMS.register("cracked_polished_soulstone_bricks", () -> new BuildBlockItemBase(CRACKED_POLISHED_SOULSTONE_BRICKS.get()));
    public static final RegistryObject<Item> GILDED_SOULSTONE_ITEM = ITEMS.register("gilded_soulstone", () -> new BuildBlockItemBase(GILDED_SOULSTONE.get()));


    //Soulstone Stairs BlockItem
    public static final RegistryObject<Item> SOULSTONE_STAIRS_ITEM = ITEMS.register("soulstone_stairs", () -> new BuildBlockItemBase(SOULSTONE_STAIRS.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_STAIRS_ITEM = ITEMS.register("polished_soulstone_stairs", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_STAIRS.get()));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_STAIRS_ITEM = ITEMS.register("polished_soulstone_brick_stairs", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_BRICK_STAIRS.get()
    ));

    //Soulstone Slab BlockItem
    public static final RegistryObject<Item> SOULSTONE_SLAB_ITEM = ITEMS.register("soulstone_slab", () -> new BuildBlockItemBase(SOULSTONE_SLAB.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_SLAB_ITEM = ITEMS.register("polished_soulstone_slab", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_SLAB.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_SLAB_ITEM = ITEMS.register("polished_soulstone_brick_slab", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_BRICK_SLAB.get()
    ));

    //Soulstone Wall BlockItem
    public static final RegistryObject<Item> SOULSTONE_WALL_ITEM = ITEMS.register("soulstone_wall", () -> new BuildBlockItemBase(SOULSTONE_WALL.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_WALL_ITEM = ITEMS.register("polished_soulstone_wall", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_WALL.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BRICK_WALL_ITEM = ITEMS.register("polished_soulstone_brick_wall", () -> new BuildBlockItemBase(POLISHED_SOULSTONE_BRICK_WALL.get()
    ));

    //Other Soulstone BlockItem
    public static final RegistryObject<Item> POLISHED_SOULSTONE_BUTTON_ITEM = ITEMS.register("polished_soulstone_button", () -> new RedstoneBlockItemBase(POLISHED_SOULSTONE_BUTTON.get()
    ));
    public static final RegistryObject<Item> POLISHED_SOULSTONE_PRESSURE_PLATE_ITEM = ITEMS.register("polished_soulstone_pressure_plate", () -> new RedstoneBlockItemBase(POLISHED_SOULSTONE_PRESSURE_PLATE.get()
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
    public static final RegistryObject<Item> ANGEL_TRAPDOOR = ITEMS.register("angel_trapdoor", () -> new RedstoneBlockItemBase(BlockInit.ANGEL_TRAPDOOR.get())
    );
    public static final RegistryObject<Item> ANGEL_WART = ITEMS.register("angel_wart", () -> new DecorativeBlocks(BlockInit.ANGEL_WART.get())
    );
    public static final RegistryObject<Item> ANGEL_HYPHAE_ITEM = ITEMS.register("angel_hyphae", () -> new BuildBlockItemBase(BlockInit.ANGEL_HYPHAE.get())
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
    public static final RegistryObject<Item> ANGEL_FENCE_GATE_ITEM = ITEMS.register("angel_fence_gate", () -> new DecorativeBlocks(BlockInit.ANGEL_FENCE_GATE.get())
    );
}