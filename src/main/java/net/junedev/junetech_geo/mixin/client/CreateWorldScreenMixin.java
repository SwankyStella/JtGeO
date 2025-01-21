package net.junedev.junetech_geo.mixin.client;

import net.junedev.junetech_geo.worldgen.JtGeOChunkGenerator;
import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.presets.WorldPreset;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * This mixin sets the default world type ui element when creating a new world.
 * <br>
 * Implementation copied from TerraFirmaCraft (licenced under <a href="https://eupl.eu/1.2/en/">EUPL v1.2</a>)
 * @see <a href="https://github.com/TerraFirmaCraft/TerraFirmaCraft">https://github.com/TerraFirmaCraft/TerraFirmaCraft</a>
 */
@Mixin(CreateWorldScreen.class)
public class CreateWorldScreenMixin {
    @Redirect(method = "openFresh", at = @At(value = "FIELD", target = "Lnet/minecraft/world/level/levelgen/presets/WorldPresets;NORMAL:Lnet/minecraft/resources/ResourceKey;", opcode = Opcodes.GETSTATIC))
    private static ResourceKey<WorldPreset> changeDefaultWorldType() {
        return JtGeOChunkGenerator.DEFAULT_WORLD_PRESET;
    }
}
