package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.blocks.AngelDoor;
import com.christopher.enhancedcraft.blocks.AngelFungusBlock;
import com.christopher.enhancedcraft.blocks.AngelHyphae;
import com.christopher.enhancedcraft.blocks.AngelPlanks;
import com.christopher.enhancedcraft.blocks.AngelRoots;
import com.christopher.enhancedcraft.blocks.AngelStem;
import com.christopher.enhancedcraft.blocks.AngelTrapdoor;
import com.christopher.enhancedcraft.blocks.AngelWart;
import com.christopher.enhancedcraft.blocks.CharredSoulSpongeBlock;
import com.christopher.enhancedcraft.blocks.GlazedSoulBlock;
import com.christopher.enhancedcraft.blocks.MagmaGlazedSoulBlock;
import com.christopher.enhancedcraft.blocks.MaroonCarpetBlock;
import com.christopher.enhancedcraft.blocks.PackedGlazedSoulBlock;
import com.christopher.enhancedcraft.blocks.PlatinumBlock;
import com.christopher.enhancedcraft.blocks.PlatinumOre;
import com.christopher.enhancedcraft.blocks.PolishedBricksVariant;
import com.christopher.enhancedcraft.blocks.SoulEndRod;
import com.christopher.enhancedcraft.blocks.SoulFurnaceBlock;
import com.christopher.enhancedcraft.blocks.SoulMagmaBlock;
import com.christopher.enhancedcraft.blocks.SoulRedstoneLamp;
import com.christopher.enhancedcraft.blocks.SoulSpongeBlock;
import com.christopher.enhancedcraft.blocks.Soulstone;
import com.christopher.enhancedcraft.blocks.StoneButtonBlockPublic;
import com.christopher.enhancedcraft.blocks.StonePressurePlateBlockPublic;
import com.christopher.enhancedcraft.blocks.WoodButtonBlockPublic;
import com.christopher.enhancedcraft.util.enums.NewDyeColor;
import com.christopher.enhancedcraft.world.feature.AngelHugeFungus;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.MyceliumBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
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

    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", PlatinumBlock::new);
    public static final RegistryObject<Block> PLATINUM_REMAINS = BLOCKS.register("platinum_remains", PlatinumOre::new);
    public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = BLOCKS.register("soul_magma_block", SoulMagmaBlock::new);
    public static final RegistryObject<Block> SOUL_FURNACE = BLOCKS.register("soul_furnace", SoulFurnaceBlock::new);
    public static final RegistryObject<Block> SOUL_END_ROD = BLOCKS.register("soul_end_rod", SoulEndRod::new);
    public static final RegistryObject<Block> SOUL_REDSTONE_LAMP = BLOCKS.register("soul_redstone_lamp", SoulRedstoneLamp::new);
    public static final RegistryObject<Block> GLAZED_SOUL_BLOCK = BLOCKS.register("glazed_soulstone", GlazedSoulBlock::new);
    public static final RegistryObject<Block> PACKED_GLAZED_SOULSTONE_BLOCK = BLOCKS.register("packed_glazed_soulstone", PackedGlazedSoulBlock::new);
    public static final RegistryObject<Block> MAGMA_GLAZED_SOULSTONE_BLOCK = BLOCKS.register("magma_glazed_soulstone", MagmaGlazedSoulBlock::new);


    //Soulstone BlockBases
    public static final RegistryObject<Block> SOULSTONE = BLOCKS.register("soulstone", Soulstone::new);
    public static final RegistryObject<Block> POLISHED_SOULSTONE = BLOCKS.register("polished_soulstone", Soulstone::new);
    public static final RegistryObject<Block> CHISELED_POLISHED_SOULSTONE = BLOCKS.register("chiseled_polished_soulstone", Soulstone::new);
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICKS = BLOCKS.register("polished_soulstone_bricks", Soulstone::new);
    public static final RegistryObject<Block> CRACKED_POLISHED_SOULSTONE_BRICKS = BLOCKS.register("cracked_polished_soulstone_bricks", Soulstone::new);
    public static final RegistryObject<Block> GILDED_SOULSTONE = BLOCKS.register("gilded_soulstone", Soulstone::new);

    //Soulstone BlockStairs
    public static final RegistryObject<Block> SOULSTONE_STAIRS = BLOCKS.register("soulstone_stairs",
            () -> new StairsBlock(() -> BlockInit.SOULSTONE.get().getDefaultState(),
                    Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(15.0F, 6.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_STAIRS = BLOCKS.register("polished_soulstone_stairs",
            () -> new StairsBlock(() -> BlockInit.POLISHED_SOULSTONE.get().getDefaultState(),
                    Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(15.0F, 6.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICK_STAIRS = BLOCKS.register("polished_soulstone_brick_stairs",
            () -> new StairsBlock(() -> BlockInit.POLISHED_SOULSTONE_BRICKS.get().getDefaultState(),
                    Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(15.0F, 6.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    //Soulstone Slab BlockBases

    public static final RegistryObject<Block> SOULSTONE_SLAB = BLOCKS.register("soulstone_slab", ()-> new SlabBlock(Block.Properties.from(BlockInit.SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_SLAB = BLOCKS.register("polished_soulstone_slab", ()-> new SlabBlock(Block.Properties.from(BlockInit.POLISHED_SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICK_SLAB = BLOCKS.register("polished_soulstone_brick_slab", ()-> new SlabBlock(Block.Properties.from(BlockInit.POLISHED_SOULSTONE_BRICKS.get())));

    //SoulStone Wall BlockBases
    public static final RegistryObject<Block> SOULSTONE_WALL = BLOCKS.register("soulstone_wall",()-> new WallBlock(Block.Properties.from(BlockInit.SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_WALL = BLOCKS.register("polished_soulstone_wall",()-> new WallBlock(Block.Properties.from(BlockInit.POLISHED_SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BRICK_WALL = BLOCKS.register("polished_soulstone_brick_wall",()-> new WallBlock(Block.Properties.from(BlockInit.POLISHED_SOULSTONE_BRICKS.get())));

    //Other Soulstone BlockBases
    public static final RegistryObject<Block> POLISHED_SOULSTONE_BUTTON = BLOCKS.register("polished_soulstone_button",()-> new StoneButtonBlockPublic(Block.Properties.from(BlockInit.POLISHED_SOULSTONE.get())));
    public static final RegistryObject<Block> POLISHED_SOULSTONE_PRESSURE_PLATE = BLOCKS.register("polished_soulstone_pressure_plate", StonePressurePlateBlockPublic::new);

    public static final RegistryObject<Block> SOUL_SPONGE = BLOCKS.register("soul_sponge", () -> new SoulSpongeBlock(Block.Properties.create(Material.SPONGE).hardnessAndResistance(0.6F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARRED_SOUL_SPONGE = BLOCKS.register("charred_soul_sponge", () -> new CharredSoulSpongeBlock(Block.Properties.create(Material.SPONGE).hardnessAndResistance(0.6F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SOUL_GLOWSTONE = BLOCKS.register("soul_glowstone",()-> new Block(Block.Properties.create(Material.GLASS, MaterialColor.SAND).hardnessAndResistance(0.3F).sound(SoundType.GLASS).lightValue(10)));

    /* Wood Blocks */
    public static final RegistryObject<Block> ANGEL_DOOR = BLOCKS.register("angel_door",
            AngelDoor::new);
    public static final RegistryObject<Block> ANGEL_HYPHAE = BLOCKS.register("angel_hyphae", AngelHyphae::new);
    public static final RegistryObject<Block> STRIPPED_ANGEL_HYPHAE = BLOCKS.register("stripped_angel_hyphae", AngelHyphae::new);
    public static final RegistryObject<Block> ANGEL_PLANKS = BLOCKS.register("angel_planks", AngelPlanks::new);
    public static final RegistryObject<Block> ANGEL_STEM = BLOCKS.register("angel_stem", AngelStem::new);
    public static final RegistryObject<Block> STRIPPED_ANGEL_STEM = BLOCKS.register("stripped_angel_stem", AngelStem::new);
    public static final RegistryObject<Block> ANGEL_TRAPDOOR = BLOCKS.register("angel_trapdoor", AngelTrapdoor::new);
    public static final RegistryObject<Block> ANGEL_NYLIUM = BLOCKS.register("angel_nylium", () -> new MyceliumBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
    /* NO SIGNS UNTIL I FIGURE THIS OUT
    public static final RegistryObject<Block> ANGEL_SIGN = BLOCKS.register("angel_sign",()-> new StandingSignBlock(Block.Properties.from(BlockInit.ANGEL_PLANKS.get()), MoreWoodTypes.ANGEL));
    public static final RegistryObject<Block> ANGEL_WALL_SIGN = BLOCKS.register("angel_wall_sign",()-> new WallSignBlock(Block.Properties.from(BlockInit.ANGEL_PLANKS.get()), MoreWoodTypes.ANGEL));
     */

    // Angel Variants
    public static final RegistryObject<Block> ANGEL_SLAB = BLOCKS.register("angel_slab",
            () -> new SlabBlock(Block.Properties.from(BlockInit.ANGEL_PLANKS.get())));
    public static final RegistryObject<Block> ANGEL_WART = BLOCKS.register("angel_wart", AngelWart::new);
    public static final RegistryObject<Block> ANGEL_STAIRS = BLOCKS.register("angel_stairs",
            () -> new StairsBlock(() -> BlockInit.ANGEL_PLANKS.get().getDefaultState(),Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_FENCE = BLOCKS.register("angel_fence",
            () -> new FenceBlock(Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_FENCE_GATE = BLOCKS.register("angel_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_BUTTON = BLOCKS.register("angel_button",
            () -> new WoodButtonBlockPublic(Block.Properties.create(Material.SAND, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_PRESSURE_PLATE = BLOCKS.register("angel_pressure_plate", StonePressurePlateBlockPublic::new);

    /*
    Polished Bricks and/or Bricks Variants Only
     */

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = BLOCKS.register("polished_andesite_bricks", PolishedBricksVariant::new);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = BLOCKS.register("polished_diorite_bricks", PolishedBricksVariant::new);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = BLOCKS.register("polished_granite_bricks", PolishedBricksVariant::new);
    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = BLOCKS.register("red_sandstone_bricks", PolishedBricksVariant::new);
    public static final RegistryObject<Block> SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks", PolishedBricksVariant::new);

    //PLANTS
    public static final RegistryObject<Block> ANGEL_FUNGUS = BLOCKS.register("angel_fungus",
            () -> new AngelFungusBlock(AngelHugeFungus::new, Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ANGEL_ROOTS = BLOCKS.register("angel_roots", AngelRoots::new);
    public static final RegistryObject<Block> ANGEL_SPROUTS = BLOCKS.register("angel_sprouts", AngelRoots::new);
    public static final RegistryObject<Block> ANEMONE = BLOCKS.register("anemone", () -> new FlowerBlock(Effects.CONDUIT_POWER, 6, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.PLANT)));

    //Maroon Blocks
    public static final RegistryObject<Block> MAROON_WOOL = BLOCKS.register("maroon_wool", () -> new Block(Block.Properties.create(Material.WOOL, MaterialColor.ADOBE).hardnessAndResistance(0.8F).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> MAROON_CONCRETE = BLOCKS.register("maroon_concrete", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> MAROON_CONCRETE_POWDER = BLOCKS.register("maroon_concrete_powder", () -> new ConcretePowderBlock(BlockInit.MAROON_CONCRETE.get(), Block.Properties.create(Material.SAND,MaterialColor.ADOBE).hardnessAndResistance(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> MAROON_TERRACOTTA = BLOCKS.register("maroon_terracotta", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(1.25F, 4.2F)));
    public static final RegistryObject<Block> MAROON_GLAZED_TERRACOTTA = BLOCKS.register("maroon_glazed_terracotta", () -> new GlazedTerracottaBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.4F)));
    public static final RegistryObject<Block> MAROON_CARPET = BLOCKS.register("maroon_carpet", () -> new MaroonCarpetBlock(NewDyeColor.MAROON, Block.Properties.create(Material.CARPET, MaterialColor.SNOW).hardnessAndResistance(0.1F).sound(SoundType.CLOTH)));


}
