package net.junedev.junetech_geo.worldgen.settings;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record StrataOptions(
        boolean test
) {
    public static final MapCodec<StrataOptions> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Codec.BOOL.fieldOf("test").forGetter(StrataOptions::test)
    ).apply(instance, StrataOptions::new));

    public static final StrataOptions DEFAULT = new StrataOptions(
            false
    );
}
