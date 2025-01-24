package net.junedev.junetech_geo.worldgen.settings;

import net.minecraft.world.level.levelgen.WorldOptions;

import java.util.function.UnaryOperator;

public interface WorldStrataOptions {
    static WorldStrataOptions from(WorldOptions options) {
        return (WorldStrataOptions) options;
    }

    StrataOptions getStrataOptions();
    void setStrataOptions(UnaryOperator<StrataOptions> strataOptions);
}
