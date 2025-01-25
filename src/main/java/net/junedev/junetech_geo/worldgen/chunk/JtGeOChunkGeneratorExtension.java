package net.junedev.junetech_geo.worldgen.chunk;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// TODO: literally all of this
public interface JtGeOChunkGeneratorExtension {
    static JtGeOChunkGeneratorExtension from(ChunkGenerator generator) {
        return (JtGeOChunkGeneratorExtension) generator;
    }

    // TODO: all of these parameters, need to figure out what ones are necessary for this
    default CompletableFuture<ChunkAccess> generateStrata(ChunkAccess chunk) {
        JunetechGeo.LOGGER.info("Generating in chunk {}", chunk.getPos());
        // Simulate some loading time
        return CompletableFuture.supplyAsync(() -> chunk, CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS));
    }
}
