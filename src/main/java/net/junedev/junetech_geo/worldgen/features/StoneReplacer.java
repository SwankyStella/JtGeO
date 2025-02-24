package net.junedev.junetech_geo.worldgen.features;
//TODO: from Hyle, will need to look at the code more and also probably get permission to make a fork

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

import java.util.Objects;
/*
public class StoneReplacer extends Feature<StoneReplacerConfiguration> {
    private boolean isSeedSet = false;
    BlockPos basePos;

    public StoneReplacer() {
        super(StoneReplacerConfiguration.CODEC);
    }

    private boolean canReplace(ChunkGenerator generator) {
        if (generator instanceof NoiseBasedChunkGenerator nbcg) {
            return ((NoiseGeneratorSettings)nbcg.m_224341_().get()).f_64440_().m_60713_(Blocks.f_50069_);
        } else {
            return false;
        }
    }

    public boolean m_142674_(FeaturePlaceContext<StoneReplacerConfiguration> ctx) {
        if (!this.canReplace(ctx.m_159775_())) {
            return false;
        } else {
            WorldGenLevel level = ctx.m_159774_();
            StoneReplacerConfiguration config = (StoneReplacerConfiguration)ctx.m_159778_();
            if (!this.isSeedSet) {
                int seed = (int)level.m_7328_();
                StoneReplacerConfiguration.Frequencies frequencies = config.getFrequencies();
                NoiseHolder.setSeed(seed - 193864, frequencies.region());
                PrimaryNoiseSampler.setSeed(seed + 777261, frequencies.primary());
                SecondaryNoiseSampler.setSeed(seed + 390271, frequencies.secondary());
                RoughNoiseSampler.setSeed(seed + 1567241, frequencies.tertiary(), frequencies.unconformity());
                this.isSeedSet = true;
            }

            BlockPos pos = ctx.m_159777_();
            this.basePos = pos;
            int minY = Math.max(pos.m_123342_(), level.m_141937_());
            ChunkAccess chunkAccess = level.m_46865_(pos);
            NoiseHolder noiseHolder = new NoiseHolder(config, level, pos.m_123341_(), minY, pos.m_123343_());
            int maxHeight = noiseHolder.getMaxHeight(chunkAccess);
            if (maxHeight <= minY) {
                return false;
            } else {
                ChunkFiller filler = new ChunkFiller(level.m_7328_(), new BlockPos(pos.m_123341_(), minY, pos.m_123343_()), maxHeight - minY + 1);
                if (Constants.CONFIG.enableDebug()) {
                    Objects.requireNonNull(noiseHolder);
                    filler.fillIn(2, noiseHolder::getRoughNoise);
                    Objects.requireNonNull(noiseHolder);
                    filler.fillEmpty(2, noiseHolder::getStrataNoise);
                    filler.fillInEdgesAndFaces(1);
                    filler.fillInCentersRandom(1);
                } else {
                    Objects.requireNonNull(noiseHolder);
                    filler.fillIn(16, noiseHolder::getRoughNoise);
                    filler.fillInEdgesAndFaces(8);
                    Objects.requireNonNull(noiseHolder);
                    filler.fillInCenters(8, noiseHolder::getRoughNoise);
                    Objects.requireNonNull(noiseHolder);
                    filler.fillEmpty(8, noiseHolder::getStrataNoise);
                    filler.fillInEdgesAndFaces(4);
                    Objects.requireNonNull(noiseHolder);
                    filler.fillInCenters(4, noiseHolder::getCombinedNoise);
                    Objects.requireNonNull(noiseHolder);
                    filler.fillBiome(4, noiseHolder::getBiomeStrata);
                    filler.fillInEdgesAndFaces(2);
                    filler.fillInCentersFast(2);
                    filler.fillInEdgesAndFaces(1);
                    filler.fillInCentersRandom(1);
                }

                this.replaceAll(chunkAccess, minY, noiseHolder.getHeights(), filler.results());
                return true;
            }
        }
    }

    private void replaceAll(ChunkAccess chunkAccess, int minY, int[][] heights, StoneType[][][] results) {
        LevelChunkSection chunkSection = chunkAccess.m_183278_(chunkAccess.m_151564_(minY));

        for(int x = 0; x < 16; ++x) {
            for(int z = 0; z < 16; ++z) {
                int height = heights[x][z];

                for(int posY = minY; posY <= height; ++posY) {
                    int sectionIndex = chunkAccess.m_151564_(posY);
                    if (chunkAccess.m_151564_(minY) != sectionIndex) {
                        chunkSection = chunkAccess.m_183278_(sectionIndex);
                    }

                    if (!chunkSection.m_188008_()) {
                        BlockState block = chunkSection.m_62982_(x, posY & 15, z);
                        if (!block.m_60795_()) {
                            BlockState replaced = results[x][z][posY - minY].replace(block);
                            if (block != replaced) {
                                chunkSection.m_62991_(x, posY & 15, z, replaced, false);
                            }
                        }
                    }
                }
            }
        }

    }
}

*/