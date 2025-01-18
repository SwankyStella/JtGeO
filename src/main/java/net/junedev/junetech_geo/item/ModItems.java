package net.junedev.junetech_geo.item;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.junedev.junetech_geo.util.CompositionConstants.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JunetechGeo.MOD_ID);

       // for public static final RegistryObject<Item> VAR1 = ITEMS.register("var2",
         //       () -> new Item(new Item.Properties())); = (VAR1, var2)??? could this work?
//Sand Piles
        public static final RegistryObject<Item> SAND_PILE = ITEMS.register("sand_pile",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_RED = ITEMS.register("sand_pile_red",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_BASALT = ITEMS.register("sand_pile_basalt",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_CASSITERITE = ITEMS.register("sand_pile_cassiterite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_GLAUCONITE = ITEMS.register("sand_pile_glauconite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_GRANITE = ITEMS.register("sand_pile_granite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_LACUSTRINE = ITEMS.register("sand_pile_lacustrine",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_ORTHOCLASE_FELDSPAR = ITEMS.register("sand_pile_orthoclase_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_PLAGIOCLASE_FELDSPAR = ITEMS.register("sand_pile_plagioclase_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_SODALITE = ITEMS.register("sand_pile_sodalite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_SOUL = ITEMS.register("sand_pile_soul",
                () -> new Item(new Item.Properties()));
//Minerals
        public static final RegistryObject<Item> CITRINE_SHARD = ITEMS.register("citrine_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMETRINE_SHARD = ITEMS.register("ametrine_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AVENTURINE_SHARD = ITEMS.register("aventurine_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BLOODSTONE_QUARTZ_SHARD = ITEMS.register("bloodstone_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUMORTIERITE_SHARD = ITEMS.register("dumortierite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PRASIOLITE_SHARD = ITEMS.register("prasiolite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SMOKY_QUARTZ_SHARD = ITEMS.register("smoky_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROSE_QUARTZ_SHARD = ITEMS.register("rose_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMBER_SHARD = ITEMS.register("amber_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OPAL_SHARD = ITEMS.register("opal_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MULLITE_SHARD = ITEMS.register("mullite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUST_SALT_NACL = ITEMS.register("dust_salt_nacl",
                () -> new ItemWithTooltip(new Item.Properties(), NACL, true));
        public static final RegistryObject<Item> CHALK_STICK = ITEMS.register("chalk_stick",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_LIME = ITEMS.register("lithic_lime",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_ORTHOCLASE_FELDSPAR = ITEMS.register("lithic_orthoclase_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_PLAGIOCLASE_FELDSPAR = ITEMS.register("lithic_plagioclase_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_QUARTZ = ITEMS.register("lithic_quartz",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COAL_ANTHRACITE = ITEMS.register("coal_anthracite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COAL_LIGNITE = ITEMS.register("coal_lignite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_CALCITE = ITEMS.register("cemented_calcite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_HEMATITE = ITEMS.register("cemented_hematite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_METACONGLOMERATE = ITEMS.register("cemented_metaconglomerate",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_SIDERITE = ITEMS.register("cemented_siderite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_SILICA = ITEMS.register("cemented_silica",
                () -> new Item(new Item.Properties()));
//Geodes
        public static final RegistryObject<Item> GEODE_CLOSED = ITEMS.register("geode_closed",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_AGATE = ITEMS.register("geode_agate",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_AMETHYST = ITEMS.register("geode_amethyst",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_JASPER = ITEMS.register("geode_jasper",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_ONYX = ITEMS.register("geode_onyx",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_QUARTZ = ITEMS.register("geode_quartz",
                () -> new Item(new Item.Properties()));
//Tools
        public static final RegistryObject<Item> CHISEL_IRON = ITEMS.register("chisel_iron",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHISEL_DIAMOND = ITEMS.register("chisel_diamond",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHISEL_NETHERITE = ITEMS.register("chisel_netherite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCKHOUNDERS_SATCHEL = ITEMS.register("rockhounders_satchel",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCKHOUNDERS_BACKPACK = ITEMS.register("rockhounders_backpack",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MACUAHUITL = ITEMS.register("macuahuitl",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_CRUDE_OIL = ITEMS.register("bucket_of_crude_oil",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_LAHAR = ITEMS.register("bucket_of_lahar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_MERCURY = ITEMS.register("bucket_of_mercury",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_TAR = ITEMS.register("bucket_of_tar",
                () -> new Item(new Item.Properties()));
//Fossils
        public static final RegistryObject<Item> FOSSIL_ARCHAEOCYATHAN = ITEMS.register("fossil_archaeocyathan",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_BRYOZOAN = ITEMS.register("fossil_bryozoan",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_CEPHALOPOD = ITEMS.register("fossil_cephalopod",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_CORAL = ITEMS.register("fossil_coral",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_CRINOID = ITEMS.register("fossil_crinoid",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_ECHINOID = ITEMS.register("fossil_echinoid",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_GASTROPOD = ITEMS.register("fossil_gastropod",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_SPONGE = ITEMS.register("fossil_sponge",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_AMMONITE = ITEMS.register("fossil_coquina_ammonite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_BRACHIOPOD = ITEMS.register("fossil_coquina_brachiopod",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_SHARK_TOOTH = ITEMS.register("fossil_coquina_shark_tooth",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_TRILOBITE = ITEMS.register("fossil_coquina_trilobite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_MAMMOTH_TUSK = ITEMS.register("fossil_mammoth_tusk",
            () -> new Item(new Item.Properties()));
//Misc
        public static final RegistryObject<Item> ADOBE_BRICK = ITEMS.register("adobe_brick",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BALL_OF_MOSS = ITEMS.register("ball_of_moss",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIRT_CLUMP = ITEMS.register("dirt_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRASS_CLUMP = ITEMS.register("grass_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRAVEL_PEBBLES = ITEMS.register("gravel_pebbles",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LOAM_CLUMP = ITEMS.register("loam_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OCHRE_CLAY_BALL = ITEMS.register("ochre_clay_ball",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RED_CLAY_BALL = ITEMS.register("red_clay_ball",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCK_PILE = ITEMS.register("rock_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PERMAFROST_CLUMP = ITEMS.register("permafrost_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILT_PILE = ITEMS.register("silt_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SOOT_PILE = ITEMS.register("soot_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VOLCANIC_ASH_PILE = ITEMS.register("volcanic_ash_pile",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
