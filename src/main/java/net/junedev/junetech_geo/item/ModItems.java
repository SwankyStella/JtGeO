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
        public static final RegistryObject<Item> MAGNIFYING_GLASS = ITEMS.register("magnifying_glass",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FIELD_NOTEBOOK = ITEMS.register("field_notebook",
                () -> new Item(new Item.Properties()));

        //Minerals
        public static final RegistryObject<Item> ACTINOLITE_FIBERS = ITEMS.register("actinolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AEGIRINE_CRYSTAL = ITEMS.register("aegirine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AFGHANITE_SHARD = ITEMS.register("afghanite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AGATE_NODULE = ITEMS.register("agate_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALBITE_SHARDS = ITEMS.register("albite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALLOCLASITE_CHUNK = ITEMS.register("alloclasite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALLOPHANE_CLUMP = ITEMS.register("allophane_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALMANDINE_CRYSTAL = ITEMS.register("almandine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALUMINUM_NATIVE = ITEMS.register("aluminum_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMAZONITE_CRYSTAL = ITEMS.register("amazonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMBLYGONITE_CRYSTAL = ITEMS.register("amblygonite_crystao",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMPHIBOLE_CRYSTAL = ITEMS.register("amphibole_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANALCIME_CRYSTAL = ITEMS.register("analcime_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANCYLITE_CUBE = ITEMS.register("ancylite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDALUSITE_CRYSTAL = ITEMS.register("andalusite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDERSONITE_CHUNK = ITEMS.register("andersonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDESINE_CHUNK = ITEMS.register("andesine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDRADITE_CRYSTAL = ITEMS.register("andradite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANGLESITE_SHARD = ITEMS.register("anglesite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANHYDRITE_CRYSTAL = ITEMS.register("anhydrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANHYDRITE_HYDROTHERMAL_CRYSTAL = ITEMS.register("anhydrite_hydrothermal_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANKERITE_SHARD = ITEMS.register("ankerite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANORTHITE_CHUNK = ITEMS.register("anorthite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANORTHOCLASE_CRYSTAL = ITEMS.register("anorthoclase_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANTHOPHYLLITE_CHUNK = ITEMS.register("anthophyllite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> APATITE_CRYSTAL = ITEMS.register("apatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AQUAMARINE_CRYSTAL = ITEMS.register("aquamarine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARAGONITE = ITEMS.register("aragonite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARFVEDSONITE_CRYSTALS = ITEMS.register("arfvedsonite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARSENOPYRITE_CRYSTAL = ITEMS.register("arsenopyrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ASBESTOS_FIBERS = ITEMS.register("asbestos_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AUGITE_CRYSTALS = ITEMS.register("augite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AURICHALCITE_FIBERS = ITEMS.register("aurichalcite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AXINITE_SHARDS = ITEMS.register("axinite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AZURITE_SHARDS = ITEMS.register("azurite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BANDED_IRON_CHUNK = ITEMS.register("banded_iron_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BARYTE_SHARDS = ITEMS.register("baryte_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BASTNASITE_CRYSTAL = ITEMS.register("bastnasite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_CRYSTALS = ITEMS.register("benitoite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BERYL_CRYSTAL = ITEMS.register("beryl_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BERYLLIUM_NATIVE = ITEMS.register("beryllium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BIOTITE_SHEET = ITEMS.register("biotite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BIXBYITE_CRYSTAL = ITEMS.register("bixbyite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BOEHMITE_FIBERS = ITEMS.register("boehmite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BORAX_CRYSTAL = ITEMS.register("borax_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BORNITE_CRYSTAL = ITEMS.register("bornite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRAZILIANITE_CRYSTAL = ITEMS.register("brazilianite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRONZITE_CHUNK = ITEMS.register("bronzite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUDDINGTONITE_CHUNK = ITEMS.register("buddingtonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BYTOWNITE_CHUNK = ITEMS.register("bytownite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALCITE_SHARD = ITEMS.register("calcite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CANCRINITE_CHUNK = ITEMS.register("cancrinite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CARNELIAN_NODULE = ITEMS.register("carnelian_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CASSITERITE_CRYSTAL = ITEMS.register("cassiterite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CELESTINE_SHARDS = ITEMS.register("celestine_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CELSIAN_CRYSTAL = ITEMS.register("celsian_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCEDONY_NODULE = ITEMS.register("chalcedony_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCOCITE_SHARDS = ITEMS.register("chalcocite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCONATRONITE_FIBERS = ITEMS.register("chalconatronite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCOPYRITE_CRYSTAL = ITEMS.register("chalcopyrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHAROITE_FIBERS = ITEMS.register("charoite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORASTROLITE_CLUMP = ITEMS.register("chlorastrolite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORITE_CLUMP = ITEMS.register("chlorite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHROMITE_CRYSTAL = ITEMS.register("chromite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOCOLLA_BLUE_CLUMP = ITEMS.register("chrysocolla_blue_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOCOLLA_GREEN_CLUMP = ITEMS.register("chrysocolla_green_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOTILE_FIBERS = ITEMS.register("chrysotile_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CINNABAR_SHARDS = ITEMS.register("cinnabar_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOPYROXENE_CRYSTAL = ITEMS.register("clinopyroxene_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COBALTITE_CHUNK = ITEMS.register("cobaltite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COPPER_TELLURIC = ITEMS.register("copper_telluric",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CORUNDUM_CRYSTAL = ITEMS.register("corundum_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CRYOLITE_CHUNK = ITEMS.register("cryolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CUMMINGTONITE_CHUNK = ITEMS.register("cummingtonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CUPRITE_CRYSTAL = ITEMS.register("cuprite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIOPSIDE_CHROMIUM_CRYSTAL = ITEMS.register("diopside_chromium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIOPSIDE_CRYSTAL = ITEMS.register("diopside_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DOLOMITE_CRYSTAL = ITEMS.register("dolomite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DRAVITE_CRYSTAL = ITEMS.register("dravite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EDENITE_CRYSTAL = ITEMS.register("edenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ELBAITE_CRYSTAL = ITEMS.register("elbaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EMERALD = ITEMS.register("emerald",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_TRAPICHE_CRYSTAL = ITEMS.register("emerald_trapiche_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ENARGITE_CRYSTAL = ITEMS.register("enargite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ENSTATITE_CRYSTAL = ITEMS.register("enstatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EPIDOTE_CRYSTALS = ITEMS.register("epidote_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EPSOMITE_FIBERS = ITEMS.register("epsomite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ERYTHRITE_FIBERS = ITEMS.register("erythrite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FAYALITE_CHUNK = ITEMS.register("fayalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FELDSPAR_SHARDS = ITEMS.register("feldspar_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FERROSILITE_CRYSTALS = ITEMS.register("ferrosilite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_GREEN_CRYSTAL = ITEMS.register("fluorite_green_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_CRYSTAL = ITEMS.register("fluorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FORSTERITE_CRYSTAL = ITEMS.register("forsterite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GALENA_CUBE = ITEMS.register("galena_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GARNIERITE_CLUMP = ITEMS.register("garnierite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GIBBSITE_CLUMP = ITEMS.register("gibbsite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLAUCONITE_CHUNK = ITEMS.register("glauconite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLAUCOPHANE_CRYSTALS = ITEMS.register("glaucophane_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOLD_TELLURIC = ITEMS.register("gold_telluric",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRAPHITE_SHEET = ITEMS.register("graphite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GROSSULAR_CRYSTALS = ITEMS.register("grossular_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GUANGLINITE_SHARDS = ITEMS.register("guanglinite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GYPSUM_FIBERS = ITEMS.register("gypsum_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HALITE_CUBE = ITEMS.register("halite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HAUYNE_CRYSTAL = ITEMS.register("hauyne_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HELIODOR_CRYSTAL = ITEMS.register("heliodor_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HEMATITE_CHUNK = ITEMS.register("hematite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HERCYNITE_CRYSTAL = ITEMS.register("hercynite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HOLLANDITE_CLUMP = ITEMS.register("hollandite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HORNBLENDE_CRYSTAL = ITEMS.register("hornblende_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HOWLITE_CRYSTALS = ITEMS.register("howlite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYALOPHANE_CHUNK = ITEMS.register("hyalophane_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDROXYAPATITE_CRYSTAL = ITEMS.register("hydroxyapatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IDDINGSITE_CHUNK = ITEMS.register("iddingsite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ILMENITE_SHARDS = ITEMS.register("ilmenite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRIDIUM_NATIVE = ITEMS.register("iridium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRON_NATIVE = ITEMS.register("iron_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ISMIRODINE_CRYSTAL = ITEMS.register("ismirodine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JADEITE_CHUNK = ITEMS.register("jadeite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JASPER_NODULE = ITEMS.register("jasper_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JASPILLITE_NODULE = ITEMS.register("jaspillite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KALSILITE_CRYSTAL = ITEMS.register("kalsilite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KAOLINITE_FIBERS = ITEMS.register("kaolinite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KYANITE_CRYSTAL = ITEMS.register("kyanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LABRADORITE_CRYSTAL = ITEMS.register("labradorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LARIMAR_CLUMP = ITEMS.register("larimar_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAZURITE_CRYSTAL = ITEMS.register("lazurite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEAD_NATIVE = ITEMS.register("lead_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEPIDOLITE_SHEET = ITEMS.register("lepidolite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEUCITE_CRYSTAL = ITEMS.register("leucite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEUCOXENE_CRYSTAL = ITEMS.register("leucoxene_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIEBENBERG_SHARD = ITEMS.register("liebenberg_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIMONITE_BROWN_CLUMP = ITEMS.register("limonite_brown_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIMONITE_YELLOW_CLUMP = ITEMS.register("limonite_yellow_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIUM_NATIVE = ITEMS.register("lithium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNESITE_CRYSTAL = ITEMS.register("magnesite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNETITE_CRYSTAL = ITEMS.register("magnetite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNETITE_VANADIUM_CRYSTAL = ITEMS.register("magnetite_vanadium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MANGANESE_NATIVE = ITEMS.register("manganese_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MARCASITE_CHUNK = ITEMS.register("marcasite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MELILITE_CHUNK = ITEMS.register("melilite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> METAPHONOLITE_CHUNK = ITEMS.register("metaphonolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MICA_SHEET = ITEMS.register("mica_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MICROCLINE_SHARD = ITEMS.register("microcline_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MIRABILITE_CRYSTALS = ITEMS.register("mirabilite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOISSANITE_CRYSTAL = ITEMS.register("moissanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOLYBDENITE_SHARD = ITEMS.register("molybdenite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_CRYSTAL = ITEMS.register("monazite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONTICELLITE_CRYSTAL = ITEMS.register("monticellite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MORGANITE_CRYSTAL = ITEMS.register("morganite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MUSCOVITE_SHEET = ITEMS.register("muscovite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MUSGRAVITE_CLUMP = ITEMS.register("musgravite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NEPHELINE_CRYSTAL = ITEMS.register("nepheline_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_NATIVE = ITEMS.register("nickel_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NITRE_NODULE = ITEMS.register("nitre_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NOSEAN_CRYSTAL = ITEMS.register("nosean_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIGOCLASE_SHARDS = ITEMS.register("oligoclase_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIVINE_CALCITE_SHARD = ITEMS.register("olivine_calcite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIVINE_CHUNK = ITEMS.register("olivine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ONYX_NODULE = ITEMS.register("onyx_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ORTHOCLASE_CHUNK = ITEMS.register("orthoclase_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ORTHOPYROXENE_CRYSTAL = ITEMS.register("orthopyroxene_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OSMIRIDIUM_CRYSTAL = ITEMS.register("osmiridium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PALLADIUM_NATIVE = ITEMS.register("palladium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PARAGONITE_FIBERS = ITEMS.register("paragonite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PARGASITE_CRYSTAL = ITEMS.register("pargasite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PECTOLITE_CLUMP = ITEMS.register("pectolite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PENTLANDITE_CRYSTAL = ITEMS.register("pentlandite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PERIDOT_CHUNK = ITEMS.register("peridot_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PEROVSKITE_CUBE = ITEMS.register("perovskite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PETALITE_CHUNK = ITEMS.register("petalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHLOGOPITE_SHEET = ITEMS.register("phlogopite_seet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHOSGENITE_CRYSTAL = ITEMS.register("phosgenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PIGEONITE_SHARDS = ITEMS.register("pigeonite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLAGIOCLASE_CHUNK = ITEMS.register("plagioclase_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLATINUM_NATIVE = ITEMS.register("platinum_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLEONASTE_CRYSTAL = ITEMS.register("pleonaste_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POWELLITE_SHARDS = ITEMS.register("powellite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PREHNITE_CLUMP = ITEMS.register("prehnite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PSEUDOBROOKITE_CRYSTAL = ITEMS.register("pseudobrookite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PSILOMELANE_CHUNK = ITEMS.register("psilomelane_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PUMPELLYITE_FIBERS = ITEMS.register("pumpellyite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PURPURITE_CHUNK = ITEMS.register("purpurite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYRITE_CUBE = ITEMS.register("pyrite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROCHLORE_CRYSTAL = ITEMS.register("pyrochlore_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROLUSITE_CLUMP = ITEMS.register("pyrolusite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROPE_CRYSTAL = ITEMS.register("pyrope_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROXENE_CHUNK = ITEMS.register("pyroxene_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_HERKIMER_CRYSTAL = ITEMS.register("quartz_herkimer_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_METAMORPHOSED_SHARD = ITEMS.register("quartz_metamorphosed_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> REALGAR_CRYSTAL = ITEMS.register("realgar_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RHODONITE_CHUNK = ITEMS.register("rhodonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RICHTERITE_CHUNK = ITEMS.register("richterite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RIEBECKITE_FIBERS = ITEMS.register("riebeckite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUBICLINE_CHUNK = ITEMS.register("rubicline_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUBY_CRYSTAL = ITEMS.register("ruby_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUTILE_CRYSTAL = ITEMS.register("rutile_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SALAMMONIAC_FIBERS = ITEMS.register("salammoniac_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SANIDINE_SHARDS = ITEMS.register("sanidine_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_CRYSTAL = ITEMS.register("sapphire_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_GREEN_CRYSTAL = ITEMS.register("sapphire_green_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHEELITE_CRYSTAL = ITEMS.register("scheelite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHORL_CRYSTAL = ITEMS.register("schorl_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SERPENTINE_FIBERS = ITEMS.register("serpentine_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SIDERITE_CLUMP = ITEMS.register("siderite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILVER_NATIVE = ITEMS.register("silver_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SODALITE_CHUNK = ITEMS.register("sodalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPERRYLITE_CRYTAL = ITEMS.register("sperrylite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPESSARTINE_CRYSTAL = ITEMS.register("spessartine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPHALERITE_CRYSTAL = ITEMS.register("sphalerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPINEL_CRYSTAL = ITEMS.register("spinel_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPODUMENE_CHUNK = ITEMS.register("spodumene_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STIBNITE_CRYSTALS = ITEMS.register("stibnite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STRONTIANITE_FIBERS = ITEMS.register("strontianite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SULFUR_NATIVE = ITEMS.register("sulfur_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TALC_SHEET = ITEMS.register("talc_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TANTALITE_CHUNK = ITEMS.register("tantalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TANZANITE_CRYSTAL = ITEMS.register("tanzanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TENNANTITE_CRYSTAL = ITEMS.register("tennantite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TENORITE_CLUMP = ITEMS.register("tenorite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEPHROITE_SHARDS = ITEMS.register("tephroite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TETRAHEDRITE_CRYSTAL = ITEMS.register("tetrahedrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORIANITE_CUBE = ITEMS.register("thorianite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORITE_CRYSTAL = ITEMS.register("thorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORIUM_NATIVE = ITEMS.register("thorium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TIN_NATIVE = ITEMS.register("tin_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TITANITE_SHARD = ITEMS.register("titanite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TOPAZ_CRYSTAL = ITEMS.register("topaz_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TOURMALINE_CRYSTAL = ITEMS.register("tourmaline_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TREMOLITE_FIBERS = ITEMS.register("tremolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRIPHYLLITE_CRYSTAL = ITEMS.register("triphyllite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRONA_FIBERS = ITEMS.register("trona_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TSAREGORODTSEVITE_CLUMP = ITEMS.register("tsaregorodtsevite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TUGTUPITE_SHARDS = ITEMS.register("tugtupite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> URANINITE_CLUMP = ITEMS.register("uraninite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> UVAROVITE_CRYSTAL = ITEMS.register("uvarovite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VERMICULITE_SHEET = ITEMS.register("vermiculite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VULCANITE_CHUNK = ITEMS.register("vulcanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WITHERITE_CRYSTAL = ITEMS.register("witherite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WOLFRAMITE_CHUNK = ITEMS.register("wolframite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WOLLASTONITE_CHUNK = ITEMS.register("wollastonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WULFENITE_CHUNK = ITEMS.register("wulfenite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> XENOTIME_CRYSTAL = ITEMS.register("xenotime_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> XINGZHONGITE_CRYSTAL = ITEMS.register("xingzhongite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZEOLITE_CHUNK = ITEMS.register("zeolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZINCOCHROMITE_CRYSTAL = ITEMS.register("zincochromite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZIRCON_CRYSTAL = ITEMS.register("zircon_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZIRCON_HYACINTH_CRYSTAL = ITEMS.register("zircon_hyacinth_crystal",
                () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
