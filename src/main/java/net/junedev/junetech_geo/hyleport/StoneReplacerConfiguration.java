package net.junedev.junetech_geo.hyleport;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
 /*
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
//import lilypuree.hyle.Constants;
//import lilypuree.hyle.misc.HyleDataLoaders;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraftforge.registries.ForgeRegistries;

public class StoneReplacerConfiguration implements FeatureConfiguration {
    public static final Codec<StoneReplacerConfiguration> CODEC = RecordCodecBuilder.create((instance) -> instance.group(BiomeBasedReplacer.CODEC.listOf().fieldOf("biome_replacers").forGetter((x) -> x.biomeBasedReplacers), RegistryOps.retrieveRegistryLookup(Registries.f_256952_).forGetter((x) -> x.biomeRegistry), ResourceLocation.f_135803_.listOf().fieldOf("regions").forGetter((x) -> x.regions), StoneReplacerConfiguration.Frequencies.CODEC.fieldOf("frequencies").forGetter((x) -> x.frequencies)).apply(instance, StoneReplacerConfiguration::new));
    private final List<BiomeBasedReplacer> biomeBasedReplacers;
    private final HolderLookup.RegistryLookup<Biome> biomeRegistry;
    private final List<ResourceLocation> regions;
    private final Frequencies frequencies;
    private Set<ResourceLocation> missingRegions = new HashSet();

    public StoneReplacerConfiguration(List<BiomeBasedReplacer> biomeBasedReplacers, HolderLookup.RegistryLookup<Biome> biomes, List<ResourceLocation> regions, Frequencies frequencies) {
        this.biomeBasedReplacers = biomeBasedReplacers;
        this.biomeRegistry = biomes;
        this.regions = regions;
        this.frequencies = frequencies;
    }

    public BiomeBasedReplacer getForBiome(Biome biome) {
        return (BiomeBasedReplacer)Optional.ofNullable(ForgeRegistries.BIOMES.getKey(biome)).map((key) -> {
            for(BiomeBasedReplacer replacer : this.biomeBasedReplacers) {
                if (replacer.apply((ResourceKey)ForgeRegistries.BIOMES.getResourceKey(biome).orElse(Biomes.f_48174_))) {
                    return replacer;
                }
            }

            return BiomeBasedReplacer.NONE;
        }).orElse(BiomeBasedReplacer.NONE);
    }

    public Frequencies getFrequencies() {
        return this.frequencies;
    }

    public StoneRegion getRegions(float regionNoise) {
        if (Constants.CONFIG.enableDebug()) {
            return DebugRegion.DEBUG_REGION;
        } else if (this.regions.isEmpty()) {
            return DebugRegion.EMPTY_REGION;
        } else {
            ResourceLocation regionID = (ResourceLocation)this.regions.get((int)Mth.m_184631_(regionNoise, -1.0F, 1.0F, 0.0F, (float)this.regions.size()));
            Optional<StoneRegion> region = HyleDataLoaders.getRegion(regionID);
            if (region.isPresent()) {
                return (StoneRegion)region.get();
            } else {
                if (!this.missingRegions.contains(regionID)) {
                    Constants.LOG.error("Region " + regionID + " doesn't exist!");
                    this.missingRegions.add(regionID);
                }

                return DebugRegion.EMPTY_REGION;
            }
        }
    }

    public static record Frequencies(float region, float unconformity, float primary, float secondary, float tertiary) {
        public static Codec<Frequencies> CODEC = RecordCodecBuilder.create((instance) -> instance.group(Codec.FLOAT.fieldOf("region").forGetter(Frequencies::region), Codec.FLOAT.fieldOf("unconformity").forGetter(Frequencies::unconformity), Codec.FLOAT.fieldOf("primary").forGetter(Frequencies::primary), Codec.FLOAT.fieldOf("secondary").forGetter(Frequencies::secondary), Codec.FLOAT.fieldOf("tertiary").forGetter(Frequencies::tertiary)).apply(instance, Frequencies::new));

        public Frequencies(float region, float unconformity, float primary, float secondary, float tertiary) {
            this.region = region;
            this.unconformity = unconformity;
            this.primary = primary;
            this.secondary = secondary;
            this.tertiary = tertiary;
        }

        public float region() {
            return this.region;
        }

        public float unconformity() {
            return this.unconformity;
        }

        public float primary() {
            return this.primary;
        }

        public float secondary() {
            return this.secondary;
        }

        public float tertiary() {
            return this.tertiary;
        }
    }
}*/