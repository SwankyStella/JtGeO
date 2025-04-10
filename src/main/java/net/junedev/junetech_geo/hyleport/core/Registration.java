/*package net.junedev.junetech_geo.hyleport.core;

import net.junedev.junetech_geo.hyleport.StoneReplacer;
import net.junedev.junetech_geo.hyleport.StoneReplacerConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {
    public static final DeferredRegister FEATURES;
    public static final RegistryObject<Feature<StoneReplacerConfiguration>> STONE_REPLACER;

    public Registration() {
    }

    public static void init(IEventBus bus) {
        FEATURES.register(bus);
    }

    static {
        FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, "hyle");
        STONE_REPLACER = FEATURES.register("stone_replacer", () -> new StoneReplacer());
    }
}*/