package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.objects.blocks.BlockStates.*;
import com.christopher.enhancedcraft.objects.blocks.BlockStates.NewWoodType.Angel.*;
import net.minecraft.block.*;
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

    /* Wood Blocks */
    public static final RegistryObject<Block> ANGEL_DOOR = BLOCKS.register("angel_door",
            AngelDoor::new);
    public static final RegistryObject<Block> ANGEL_HYPHAE = BLOCKS.register("angel_hyphae", AngelHyphae::new);
    public static final RegistryObject<Block> STRIPPED_ANGEL_HYPHAE = BLOCKS.register("stripped_angel_hyphae", AngelHyphae::new);
    public static final RegistryObject<Block> ANGEL_PLANKS = BLOCKS.register("angel_planks", AngelPlanks::new);
    public static final RegistryObject<Block> ANGEL_STEM = BLOCKS.register("angel_stem", AngelStem::new);
    public static final RegistryObject<Block> STRIPPED_ANGEL_STEM = BLOCKS.register("stripped_angel_stem", AngelStem::new);
    public static final RegistryObject<Block> ANGEL_TRAPDOOR = BLOCKS.register("angel_trapdoor", AngelTrapdoor::new);
    /* NO SIGNS UNTIL I FIGURE THIS OUT
    public static final RegistryObject<Block> ANGEL_SIGN = BLOCKS.register("angel_sign",()-> new StandingSignBlock(Block.Properties.from(BlockInit.ANGEL_PLANKS.get()), MoreWoodTypes.ANGEL));
    public static final RegistryObject<Block> ANGEL_WALL_SIGN = BLOCKS.register("angel_wall_sign",()-> new WallSignBlock(Block.Properties.from(BlockInit.ANGEL_PLANKS.get()), MoreWoodTypes.ANGEL));
     */

    // Angel Variants
    public static final RegistryObject<Block> ANGEL_SLAB = BLOCKS.register("angel_slab",
            () -> new SlabBlock(Block.Properties.from(BlockInit.ANGEL_PLANKS.get())));
    public static final RegistryObject<Block> ANGEL_WART = BLOCKS.register("angel_wart", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ANGEL_STAIRS = BLOCKS.register("angel_stairs",
            () -> new StairsBlock(() -> BlockInit.ANGEL_PLANKS.get().getDefaultState(),Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_FENCE = BLOCKS.register("angel_fence",
            () -> new FenceBlock(Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_FENCE_GATE = BLOCKS.register("angel_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.EARTH, MaterialColor.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ANGEL_BUTTON = BLOCKS.register("example_button",
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

}
