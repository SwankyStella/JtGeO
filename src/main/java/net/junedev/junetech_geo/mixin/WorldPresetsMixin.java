package net.junedev.junetech_geo.mixin;

import net.junedev.junetech_geo.worldgen.JtGeOChunkGenerator;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.WorldDimensions;
import net.minecraft.world.level.levelgen.presets.WorldPresets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * This mixin sets the default world type when creating a world to junetech_geo:junetech_geo.
 * Requires {@link net.junedev.junetech_geo.mixin.client.CreateWorldScreenMixin} to change the default ui element
 */
@Mixin(WorldPresets.class)
public abstract class WorldPresetsMixin {
    @Inject(method = "createNormalWorldDimensions", at = @At("HEAD"), cancellable = true)
    private static void createNormalWorldDimensions(RegistryAccess pRegistry, CallbackInfoReturnable<WorldDimensions> cir) {
        cir.setReturnValue(pRegistry.registryOrThrow(Registries.WORLD_PRESET)
                .getHolderOrThrow(JtGeOChunkGenerator.DEFAULT_WORLD_PRESET)
                .value()
                .createWorldDimensions());
    }
}
