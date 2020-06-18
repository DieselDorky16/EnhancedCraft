package com.christopher.enhancedcraft.world.dimension;

import com.christopher.enhancedcraft.init.BiomeInit;
import com.christopher.enhancedcraft.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.EndGenerationSettings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class AngelwoodLands extends Dimension {
    private static final Vec3d field_227177_f_ = new Vec3d((double)0.2F, (double)0.03F, (double)0.03F);

    public AngelwoodLands(World worldIn, DimensionType typeIn) {
        super(worldIn, typeIn, 0.1F);
    }

    /**
     * Return Vec3D with biome specific fog color
     */
    @OnlyIn(Dist.CLIENT)
    public Vec3d getFogColor(float celestialAngle, float partialTicks) {
        int i = 10518688;
        float f = MathHelper.cos(celestialAngle * ((float)Math.PI * 2F)) * 2.0F + 0.5F;
        f = MathHelper.clamp(f, 0.0F, 1.0F);
        float f1 = 0.627451F;
        float f2 = 0.5019608F;
        float f3 = 0.627451F;
        f1 = f1 * (f * 0.0F + 0.15F);
        f2 = f2 * (f * 0.0F + 0.15F);
        f3 = f3 * (f * 0.0F + 0.15F);
        return new Vec3d((double)f1, (double)f2, (double)f3);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSkyColored() {
        return false;
    }

    public ChunkGenerator<?> createChunkGenerator() {
        EndGenerationSettings endgenerationsettings = ChunkGeneratorType.FLOATING_ISLANDS.createSettings();
        endgenerationsettings.setDefaultBlock(BlockInit.ANGEL_NYLIUM.get().getDefaultState());
        endgenerationsettings.setDefaultFluid(Blocks.AIR.getDefaultState());
        return ChunkGeneratorType.FLOATING_ISLANDS.create(this.world, BiomeProviderType.FIXED.create(BiomeProviderType.FIXED.createSettings(this.world.getWorldInfo()).setBiome(BiomeInit.ANGELWOOD_FOREST.get())), endgenerationsettings);
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    public boolean isSurfaceWorld() {
        return false;
    }
    @OnlyIn(Dist.CLIENT)
    public float getCloudHeight() {
        return 8.0F;
    }

    @Nullable
    public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid) {
        return null;
    }

    @Nullable
    public BlockPos findSpawn(int posX, int posZ, boolean checkValid) {
        return null;
    }

    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     */
    public float calculateCelestialAngle(long worldTime, float partialTicks) {
        return 0.5F;
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere() {
        return false;
    }

    /**
     * Returns true if the given X,Z coordinate should show environmental fog.
     */
    @OnlyIn(Dist.CLIENT)
    public boolean doesXZShowFog(int x, int z) {
        return true;
    }

    public WorldBorder createWorldBorder() {
        return new WorldBorder() {
            public double getCenterX() {
                return super.getCenterX() / 8.0D;
            }

            public double getCenterZ() {
                return super.getCenterZ() / 8.0D;
            }
        };
    }
}