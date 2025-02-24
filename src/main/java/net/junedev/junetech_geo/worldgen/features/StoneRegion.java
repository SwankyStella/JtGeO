package net.junedev.junetech_geo.worldgen.features;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
/*
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import lilypuree.hyle.world.feature.gen.PrimaryNoiseSampler;
import lilypuree.hyle.world.feature.gen.SecondaryNoiseSampler;
import lilypuree.hyle.world.feature.gen.StoneType;
import lilypuree.hyle.world.feature.gen.PrimaryNoiseSampler.Settings;

public class StoneRegion {
    public static final Codec<StoneRegion> CODEC = RecordCodecBuilder.create((instance) -> instance.group(Settings.CODEC.fieldOf("primary").forGetter((s) -> s.primarySettings), lilypuree.hyle.world.feature.gen.SecondaryNoiseSampler.Settings.CODEC.fieldOf("secondary").forGetter((s) -> s.secondarySettings), StoneType.CODEC.listOf().fieldOf("tertiary").forGetter((s) -> s.tertiaries), Codec.floatRange(-1.0F, 1.0F).fieldOf("tertiary_cutoff").forGetter((s) -> s.tertiaryCutoff), Codec.floatRange(-1.0F, 1.0F).fieldOf("unconformity_cutoff").forGetter((s) -> s.unconformityCutoff)).apply(instance, StoneRegion::new));
    private PrimaryNoiseSampler.Settings primarySettings;
    private SecondaryNoiseSampler.Settings secondarySettings;
    private List<StoneType> tertiaries;
    private float tertiaryCutoff;
    private float unconformityCutoff;

    public StoneRegion(PrimaryNoiseSampler.Settings primarySettings, SecondaryNoiseSampler.Settings secondarySettings, List<StoneType> tertiaries, float tertiaryCutoff, float unconformity) {
        this.tertiaryCutoff = tertiaryCutoff;
        this.unconformityCutoff = unconformity;
        this.primarySettings = primarySettings;
        this.secondarySettings = secondarySettings;
        this.tertiaries = tertiaries;
    }

    public PrimaryNoiseSampler.Settings primary() {
        return this.primarySettings;
    }

    public SecondaryNoiseSampler.Settings secondary() {
        return this.secondarySettings;
    }

    public List<StoneType> tertiary() {
        return this.tertiaries;
    }

    public float getTertiaryCutoff() {
        return this.tertiaryCutoff;
    }

    public float getUnconformityCutoff() {
        return this.unconformityCutoff;
    }
}*/