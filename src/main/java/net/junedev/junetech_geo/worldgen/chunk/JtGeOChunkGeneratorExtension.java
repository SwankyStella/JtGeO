package net.junedev.junetech_geo.worldgen.chunk;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.worldgen.settings.WorldStrataOptions;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.blending.Blender;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// TODO: literally all of this
public interface JtGeOChunkGeneratorExtension {
    static JtGeOChunkGeneratorExtension from(ChunkGenerator generator) {
        return (JtGeOChunkGeneratorExtension) generator;
    }

    default CompletableFuture<ChunkAccess> generateStrata(Executor pExecutor, Blender pBlender, RandomState pRandom, ChunkAccess pChunk, WorldStrataOptions options) {
        JunetechGeo.LOGGER.info("Generating strata in chunk {}", pChunk.getPos());
        // Simulate some loading time
        return CompletableFuture.supplyAsync(() -> pChunk, CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS));
    }
}
