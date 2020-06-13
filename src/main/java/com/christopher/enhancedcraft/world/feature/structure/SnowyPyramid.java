package com.christopher.enhancedcraft.world.feature.structure;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.ScatteredStructure;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.function.Function;

public class SnowyPyramid extends ScatteredStructure<NoFeatureConfig> {
public SnowyPyramid(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49888_1_) {
        super(p_i49888_1_);
        }

public String getStructureName() {
        return "Snowy_Pyramid";
        }

public int getSize() {
        return 3;
        }

public Structure.IStartFactory getStartFactory() {
        return SnowyPyramid.Start::new;
        }

protected int getSeedModifier() {
        return 14357617;
        }

public static class Start extends StructureStart {
    public Start(Structure<?> p_i225801_1_, int p_i225801_2_, int p_i225801_3_, MutableBoundingBox p_i225801_4_, int p_i225801_5_, long p_i225801_6_) {
        super(p_i225801_1_, p_i225801_2_, p_i225801_3_, p_i225801_4_, p_i225801_5_, p_i225801_6_);
    }

    public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {
        SnowyPyramidPiece snowypyramidpiece = new SnowyPyramidPiece(this.rand, chunkX * 16, chunkZ * 16);
        this.components.add(snowypyramidpiece);
        this.recalculateStructureSize();
    }
}
}