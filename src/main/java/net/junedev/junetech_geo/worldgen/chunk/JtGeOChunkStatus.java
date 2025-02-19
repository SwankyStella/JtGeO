package net.junedev.junetech_geo.worldgen.chunk;

import com.mojang.datafixers.util.Either;
import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.worldgen.settings.WorldStrataOptions;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.levelgen.blending.Blender;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import org.jetbrains.annotations.ApiStatus;

public class JtGeOChunkStatus {
    public static final DeferredRegister<ChunkStatus> CHUNK_STATUSES = DeferredRegister.create(Registries.CHUNK_STATUS, JunetechGeo.MOD_ID);

    public static final ChunkStatus STONE_REPLACER = new ChunkStatus(
            ChunkStatus.NOISE,
            8,
            false,
            ChunkStatus.PRE_FEATURES,
            ChunkStatus.ChunkType.PROTOCHUNK,
            (pStatus, pExecutor, pLevel, pChunkGenerator, pStructureTemplateManager, pLightEngine, pTask, pCache, pLoadingChunk) ->
                    JtGeOChunkGeneratorExtension.from(pChunkGenerator).generateStrata(
                            pExecutor,
                            Blender.of(new WorldGenRegion(pLevel, pCache, pStatus, 0)),
                            pLevel.getChunkSource().randomState(),
                            pLoadingChunk,
                            WorldStrataOptions.from(pLevel.getServer().getWorldData().worldGenOptions())
                    ).thenApply(Either::left),
            ChunkStatus.PASSTHROUGH_LOAD_TASK
    );

    @ApiStatus.Internal
    public static void register(IEventBus eventBus) {
        CHUNK_STATUSES.register("stone_replacer", () -> STONE_REPLACER);

        CHUNK_STATUSES.register(eventBus);
    }
}
