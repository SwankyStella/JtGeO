package net.junedev.junetech_geo.worldgen.settings;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record Settings(boolean test) {
    public static final MapCodec<Settings> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Codec.BOOL.fieldOf("test").forGetter(Settings::test)
    ).apply(instance, Settings::new));
}
