package net.junedev.junetech_geo.block;

import net.junedev.junetech_geo.block.tooltips.*;
import net.junedev.junetech_geo.junetech_geo;
import net.junedev.junetech_geo.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, junetech_geo.MOD_ID);
// geology \\
    public static final RegistryObject<Block> ADAKITE = registerBlock("adakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADAKITE_BRICKS = registerBlock("adakite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ADAKITE_BRICKS_SMALL = registerBlock("adakite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ADAKITE_POLISHED = registerBlock("adakite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ALLOPHANE = registerBlock("allophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMPHIBOLE = registerBlock("amphibole",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMPHIBOLITE = registerBlock("amphibolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDALUSITE = registerBlock("andalusite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDERSONITE = registerBlock("andersonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_ICELANDITE = registerBlock("andesite_icelandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_WEATHERED = registerBlock("andesite_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_VOLCANIC = registerBlock("andesite_volcanic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_RED = registerBlock("andesite_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANORTHITE = registerBlock("anorthite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANORTHOSITE = registerBlock("anorthosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTHODITE_FLOWER = registerBlock("anthodite_flower",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE = registerBlock("anthracite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_BRICKS = registerBlock("anthracite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_BRICKS_SMALL = registerBlock("anthracite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_POLISHED = registerBlock("anthracite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_RESINITE = registerBlock("anthracite_resinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARAGONITE_CRYSTAL = registerBlock("aragonite_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ARGILLITE = registerBlock("argillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARGILLITE_COBBLESTONE = registerBlock("argillite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARGILLITE_BRICKS = registerBlock("argillite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ARGILLITE_BRICKS_SMALL = registerBlock("argillite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ARGILLITE_POLISHED = registerBlock("argillite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ARGILLITE_MARINITE = registerBlock("argillite_marinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AUGITE = registerBlock("augite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BANDED_IRON_FORMATION = registerBlock("banded_iron_formation",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_AGGLOMERATE = registerBlock("basalt_agglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_BONINITE = registerBlock("basalt_boninite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_HAWAIITE = registerBlock("basalt_hawaiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_LAYERED = registerBlock("basalt_layered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_PICRITE = registerBlock("basalt_picrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_PILLOW = registerBlock("basalt_pillow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BAUXITE_CALCAREOUS = registerBlock("bauxite_calcareous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_LATERITE = registerBlock("bauxite_laterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BITUMEN = registerBlock("bitumen",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.SAND)));
    public static final RegistryObject<Block> BITUMEN_BRICKS = registerBlock("bitumen_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BITUMEN_BRICKS_SMALL = registerBlock("bitumen_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BITUMEN_POLISHED = registerBlock("bitumen_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BITUMEN_RESINITE = registerBlock("bitumen_resinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BITUMEN_SHUNGITE = registerBlock("bitumen_shungite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.SAND)));
    public static final RegistryObject<Block> BLACK_SMOKER_LARGE = registerBlock("black_smoker_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BLACK_SMOKER_SMALL = registerBlock("black_smoker_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BLAIRMORITE = registerBlock("blairmorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BOG_IRON = registerBlock("bog_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> BRECCIA = registerBlock("breccia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_FINE_GRAINED = registerBlock("breccia_variant_fine_grained",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_GRAVELLY = registerBlock("breccia_variant_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_DIFFUSED = registerBlock("breccia_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_PINK = registerBlock("breccia_variant_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_BRICKS = registerBlock("breccia_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BRECCIA_BRICKS_SMALL = registerBlock("breccia_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BRECCIA_POLISHED = registerBlock("breccia_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BRECCIA_DALLASITE = registerBlock("breccia_dallasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_GRAVEL = registerBlock("breccia_gravel",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> CALCFLINTA = registerBlock("calcflinta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALTHEMITE = registerBlock("calthemite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CARBONATITE_FENITE = registerBlock("carbonatite_fenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CARBONATITE_SOVITE = registerBlock("carbonatite_sovite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE = registerBlock("cataclasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE_BRICKS = registerBlock("cataclasite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE_BRICKS_SMALL = registerBlock("cataclasite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE_POLISHED = registerBlock("cataclasite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CAVE_POPCORN = registerBlock("cave_popcorn",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHALCONATRONITE = registerBlock("chalconatronite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK = registerBlock("chalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_VARIANT_CLEAN = registerBlock("chalk_variant_clean",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_VARIANT_VERTICAL = registerBlock("chalk_variant_vertical",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_BRICKS = registerBlock("chalk_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_BRICKS_SMALL = registerBlock("chalk_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_POLISHED = registerBlock("chalk_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHALK_COBBLESTONE = registerBlock("chalk_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT = registerBlock("chert",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_BRICKS = registerBlock("chert_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_BRICKS_SMALL = registerBlock("chert_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_POLISHED = registerBlock("chert_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE = registerBlock("chert_agate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_BRICKS = registerBlock("chert_agate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_BRICKS_SMALL = registerBlock("chert_agate_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_POLISHED = registerBlock("chert_agate_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_FIRE = registerBlock("chert_agate_fire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_MOSS = registerBlock("chert_agate_moss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_PURPLE = registerBlock("chert_agate_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY = registerBlock("chert_chalcedony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_COBBLESTONE = registerBlock("chert_chalcedony_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_BRICKS = registerBlock("chert_chalcedony_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_BRICKS_SMALL = registerBlock("chert_chalcedony_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_POLISHED = registerBlock("chert_chalcedony_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_CARNELIAN = registerBlock("chert_chalcedony_carnelian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_CHROME = registerBlock("chert_chalcedony_chrome",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHRYSOPAGE = registerBlock("chert_chrysopage",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_COBBLESTONE = registerBlock("chert_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_DIATOMIC = registerBlock("chert_diatomic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_FLINTSTONE = registerBlock("chert_flintstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_FLINTSTONE_EMPTY = registerBlock("chert_flintstone_empty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER = registerBlock("chert_jasper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_BRICKS = registerBlock("chert_jasper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_BRICKS_SMALL = registerBlock("chert_jasper_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_POLISHED = registerBlock("chert_jasper_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_HELIOTROPE = registerBlock("chert_jasper_heliotrope",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPILLITE = registerBlock("chert_jaspillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_MOZARKITE = registerBlock("chert_mozarkite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE = registerBlock("chert_novaculite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_COBBLESTONE = registerBlock("chert_novaculite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_BRICKS = registerBlock("chert_novaculite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_BRICKS_SMALL = registerBlock("chert_novaculite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_POLISHED = registerBlock("chert_novaculite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_PIETERSITE = registerBlock("chert_pietersite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_RADIOLARIAN = registerBlock("chert_radiolarian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_ROTTENSTONE = registerBlock("chert_rottenstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHLORASTOLITE = registerBlock("chlorastolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHROMITITE = registerBlock("chromitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHRYSOCOLLA_BLUE = registerBlock("chrysocolla_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHRYSOCOLLA_GREEN = registerBlock("chrysocolla_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLINOPYROXENE = registerBlock("clinopyroxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE = registerBlock("conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_FINE_GRAINED = registerBlock("conglomerate_variant_fine_grained",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_GRAVELLY = registerBlock("conglomerate_variant_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_DIFFUSED = registerBlock("conglomerate_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_PINK = registerBlock("conglomerate_variant_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_BRICKS = registerBlock("conglomerate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_BRICKS_SMALL = registerBlock("conglomerate_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_POLISHED = registerBlock("conglomerate_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_GRAVEL = registerBlock("conglomerate_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORIUM = registerBlock("corium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDITE = registerBlock("corundite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_RUBY = registerBlock("corundum_ruby",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_MIXED = registerBlock("corundum_mixed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_SAPPHIRE = registerBlock("corundum_sapphire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_RUBBLE = registerBlock("corundum_rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE = registerBlock("dacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE_BRICKS = registerBlock("dacite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE_BRICKS_SMALL = registerBlock("dacite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE_POLISHED = registerBlock("dacite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIABASE = registerBlock("diabase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE = registerBlock("diamictite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_COBBLESTONE = registerBlock("diamictite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_BRICKS = registerBlock("diamictite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_BRICKS_SMALL = registerBlock("diamictite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_POLISHED = registerBlock("diamictite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_TILLITE = registerBlock("diamictite_tillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIATOMITE = registerBlock("diatomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_NAPOLEONITE = registerBlock("diorite_napoleonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BLACK = registerBlock("diorite_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_HORNBLENDE = registerBlock("diorite_hornblende",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_QUARTZ = registerBlock("diorite_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_SAPROLITE = registerBlock("dirt_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE = registerBlock("dolomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_LIMESTONE = registerBlock("dolomite_variant_limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_HORIZONTAL = registerBlock("dolomite_variant_horizontal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_BURROWS = registerBlock("dolomite_variant_burrows",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_DIFFUSED = registerBlock("dolomite_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_CHALKY = registerBlock("dolomite_variant_chalky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICKS = registerBlock("dolomite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICKS_SMALL = registerBlock("dolomite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_POLISHED = registerBlock("dolomite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_COBBLESTONE = registerBlock("dolomite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLARENITE = registerBlock("dolomite_dolarenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLOLUTITE = registerBlock("dolomite_dololutite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLORUDITE = registerBlock("dolomite_dolorudite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLOSILTITE = registerBlock("dolomite_dolosiltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE = registerBlock("eclogite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_COBBLESTONE = registerBlock("eclogite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_BRICKS = registerBlock("eclogite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_BRICKS_SMALL = registerBlock("eclogite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_POLISHED = registerBlock("eclogite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> EMERY = registerBlock("emery",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> EPIDOSITE = registerBlock("epidosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));    
    public static final RegistryObject<Block> FELSITE = registerBlock("felsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLOWSTONE_TOP = registerBlock("flowstome_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FLOWSTONE_MIDDLE = registerBlock("flowstone_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FLOWSTONE_TIP = registerBlock("flowstone_tip",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FOIDOLITE = registerBlock("foidolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FORDITE = registerBlock("fordite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FROZEN_OIL = registerBlock("frozen_oil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FULGURITE = registerBlock("fulgurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); // You Are Here
    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_BRICKS = registerBlock("gabbro_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_BRICKS_SMALL = registerBlock("gabbro_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_POLISHED = registerBlock("gabbro_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_ESSEXITE = registerBlock("gabbro_essexite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_NORITE = registerBlock("gabbro_norite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_THERALITE = registerBlock("gabbro_theralite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GEYSERITE_OPALINE = registerBlock("geyserite_opaline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GEYSERITE_PEARLESCENT = registerBlock("geyserite_pearlescent",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GEYSERITE_PRISMATIC = registerBlock("geyserite_prismatic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS = registerBlock("gneiss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_COBBLESTONE = registerBlock("gneiss_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_FOLDED = registerBlock("gneiss_folded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_PORPHYROCLASTIC = registerBlock("gneiss_porphyroclastic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_BRICKS = registerBlock("gneiss_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_BRICKS_SMALL = registerBlock("gneiss_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_POLISHED = registerBlock("gneiss_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_LITCHFIELDITE = registerBlock("gneiss_litchfieldite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_AZURITE = registerBlock("gossan_azurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_HEMATITE = registerBlock("gossan_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_MALACHITE = registerBlock("gossan_malachite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_APPINITE = registerBlock("granite_appinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_APPINITE_POLISHED = registerBlock("granite_appinite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK = registerBlock("granite_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK_BRICKS = registerBlock("granite_black_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK_BRICKS_SMALL = registerBlock("granite_black_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK_POLISHED = registerBlock("granite_black_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLUE = registerBlock("granite_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLUE_POLISHED = registerBlock("granite_blue_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE = registerBlock("granite_charnockite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_BRICKS = registerBlock("granite_charnockite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_BRICKS_SMALL = registerBlock("granite_charnockite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_POLISHED = registerBlock("granite_charnockite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_ENDERBITE = registerBlock("granite_charnockite_enderbite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_ENDERBITE_POLISHED = registerBlock("granite_charnockite_enderbite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_MANGERITE = registerBlock("granite_charnockite_mangerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_MANGERITE_POLISHED = registerBlock("granite_charnockite_mangerite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD = registerBlock("granite_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD_BRICKS = registerBlock("granite_gold_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD_BRICKS_SMALL = registerBlock("granite_gold_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD_POLISHED = registerBlock("granite_gold_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_LUXULLIANITE = registerBlock("granite_luxullianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_LUXULLIANITE_POLISHED = registerBlock("granite_luxullianite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PEGMATITE = registerBlock("granite_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PEGMATITE_BERYL = registerBlock("granite_pegmatite_beryl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY = registerBlock("granite_porphyry",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_BRICKS = registerBlock("granite_porphyry_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_BRICKS_SMALL = registerBlock("granite_porphyry_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_POLISHED = registerBlock("granite_porphyry_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_RAPAKIVI = registerBlock("granite_rapakivi",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_RAPAKIVI_POLISHED = registerBlock("granite_rapakivi_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_UNAKITE = registerBlock("granite_unakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_UNAKITE_POLISHED = registerBlock("granite_unakite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE = registerBlock("granite_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_BRICKS = registerBlock("granite_white_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_BRICKS_SMALL = registerBlock("granite_white_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_POLISHED = registerBlock("granite_white_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANODIORITE = registerBlock("granodiorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANODIORITE_POLISHED = registerBlock("granodiorite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANULITE = registerBlock("granulite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREENSTONE = registerBlock("greenstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREISENS_CONTACT = registerBlock("greisens_contact",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREISENS_PEGMATITE = registerBlock("greisens_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRITSTONE = registerBlock("gritstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM = registerBlock("gypsum",
            () -> new CaSO4Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_VARIANT_DARK = registerBlock("gypsum_variant_dark",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_VARIANT_LIGHT = registerBlock("gypsum_variant_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_VARIANT_DOLOMITIC = registerBlock("gypsum_variant_dolomitic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_BRICKS = registerBlock("gypsum_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_BRICKS_SMALL = registerBlock("gypsum_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_POLISHED = registerBlock("gypsum_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE = registerBlock("halite",
            () -> new NaClBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_DIFFUSED = registerBlock("halite_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_LIGHT = registerBlock("halite_variant_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_PINK = registerBlock("halite_variant_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_WHITE = registerBlock("halite_variant_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_HIMALAYAN_SALT = registerBlock("halite_himalayan_salt",
            () -> new NaClBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_BRICKS = registerBlock("halite_bricks",
            () -> new NaClBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_BRICKS_SMALL = registerBlock("halite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_POLISHED = registerBlock("halite_polished",
            () -> new NaClBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HELICTITE = registerBlock("helictite",
            () -> new DeadBushBlock(BlockBehaviour.Properties.copy(Blocks.CORNFLOWER).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> HEMATITE_BLOCK = registerBlock("hematite_block",
            () -> new Fe2O3Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNBLENDE = registerBlock("hornblende",
            () -> new HornblendeBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNBLENDE_BRICKS = registerBlock("hornblende_bricks",
            () -> new HornblendeBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNBLENDE_BRICKS_SMALL = registerBlock("hornblende_bricks_small",
            () -> new HornblendeBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNBLENDE_POLISHED = registerBlock("hornblende_polished",
            () -> new HornblendeBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNFELS = registerBlock("hornfels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE = registerBlock("hyaloclasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE_BRICKS = registerBlock("hyaloclasite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE_BRICKS_SMALL = registerBlock("hyaloclasite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE_POLISHED = registerBlock("hyaloclasite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYDRACEUM = registerBlock("hydraceum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYPERSTHENE = registerBlock("hypersthene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE = registerBlock("ironstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JASPEROID_AMETHYST = registerBlock("jasperoid_amethyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JASPEROID_CITRINE = registerBlock("jasperoid_citrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KIMBERLITE = registerBlock("kimberlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KIMBERLITE_DIAMOND_BEARING = registerBlock("kimberlite_diamond_bearing",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE = registerBlock("komatiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE_BRICKS = registerBlock("komatiite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE_BRICKS_SMALL = registerBlock("komatiite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE_POLISHED = registerBlock("komatiite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_LACUSTRINE = registerBlock("sand_lacustrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LACUSTRINE = registerBlock("lacustrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMINA = registerBlock("lamina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROITE = registerBlock("lamproite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROPHYRE = registerBlock("lamprophyre",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROPHYRE_MINETTE = registerBlock("lamprophyre_minette",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROPHYRE_VOGESITE = registerBlock("lamprophyre_vogesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LATERITE = registerBlock("laterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LHERZOLITE = registerBlock("lherzolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGNITE = registerBlock("lignite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGNITE_RESINITE = registerBlock("lignite_resinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGNITE_JET = registerBlock("lignite_jet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_HORIZONTAL = registerBlock("limestone_variant_horizontal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CHERT_NODULES = registerBlock("limestone_chert_nodules",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_STAINED_HEMATITE = registerBlock("limestone_variant_stained_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_STAINED_MANGANESE = registerBlock("limestone_variant_stained_manganese",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_STAINED_MAGNESIUM = registerBlock("limestone_variant_stained_magnesium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_REVERSE = registerBlock("limestone_variant_reverse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_HORIZONTAL_SATURATED = registerBlock("limestone_variant_horizontal_saturated",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_SMOOTH = registerBlock("limestone_variant_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_UPSIDE_DOWN = registerBlock("limestone_variant_upside_down",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_UPSIDE_DOWN_DIFFUSED = registerBlock("limestone_variant_upside_down_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_CALCITE = registerBlock("limestone_variant_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_SMALL = registerBlock("limestone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_POLISHED = registerBlock("limestone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_AEOLIANITE = registerBlock("limestone_aeolianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK = registerBlock("limestone_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_BRICKS = registerBlock("limestone_black_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_BRICKS_SMALL = registerBlock("limestone_black_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_POLISHED = registerBlock("limestone_black_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_COBBLESTONE = registerBlock("limestone_black_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCARENITE = registerBlock("limestone_calcarenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCAREOUS_SHALE = registerBlock("limestone_calcareous_shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCILUTITE = registerBlock("limestome_calcilutite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCIRUDITE = registerBlock("limestone_calcirudite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCISILTITE = registerBlock("limestone_calcisiltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = registerBlock("limestone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA = registerBlock("limestone_coquina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_BRICKS = registerBlock("limestone_coquina_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_BRICKS_SMALL = registerBlock("limestone_coquina_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_POLISHED = registerBlock("limestone_coquina_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_COBBLESTONE = registerBlock("limestone_coquina_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_DEFOSSILIZED = registerBlock("limestone_coquina_defossilized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS = registerBlock("limestone_fossiliferous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS_VARIANT = registerBlock("limestone_fossiliferous_variant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_VARIANT_HORIZONTAL = registerBlock("limestone_black_variant_horizontal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS_POLISHED = registerBlock("limestone_fossiliferous_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_KARST = registerBlock("limestone_karst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_KARST_VARIANT = registerBlock("limestone_karst_variant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_KARST_POLISHED = registerBlock("limestone_karst_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_MOONMILK = registerBlock("limestone_moonmilk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_OOLITIC = registerBlock("limestone_oolitic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_WEATHERED = registerBlock("limestone_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_WEATHERED = registerBlock("limestone_cobblestone_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS_WEATHERED = registerBlock("limestone_fossiliferous_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_KARST_WEATHERED = registerBlock("limestone_karst_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM = registerBlock("loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_SAPROLITE = registerBlock("loam_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOESS = registerBlock("loess",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGMA_BLOCK_PAHOEHOE = registerBlock("magma_block_pahoehoe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BLACK = registerBlock("marble_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BLACK_COBBLESTONE = registerBlock("marble_black_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_WEATHERED_LIGHTLY = registerBlock("marble_weathered_lightly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_WEATHERED_HEAVILY = registerBlock("marble_weathered_heavily",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_CARRARA = registerBlock("marble_carrara",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_RUIN = registerBlock("marble_ruin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_GRAND_ANTIQUE = registerBlock("marble_grand_antique",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICKS_SMALL = registerBlock("marble_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_POLISHED = registerBlock("marble_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLESTONE = registerBlock("marble_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_DOLOMITE = registerBlock("marble_dolomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_SKARN = registerBlock("marble_skarn",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE = registerBlock("metaconglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_BRICKS = registerBlock("metaconglomerate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_BRICKS_SMALL = registerBlock("metaconglomerate_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_POLISHED = registerBlock("metaconglomerate_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_GRAVEL = registerBlock("metaconglomerate_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_POLYMICT = registerBlock("metaconglomerate_polymict",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METAPELITE = registerBlock("metapelite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_ACHONDRITE = registerBlock("meteorite_achondrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_CHONDRITE = registerBlock("meteorite_chondrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_FOSSIL = registerBlock("meteorite_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_MESOSIDERITE = registerBlock("meteorite_mesosiderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_PALLASITE = registerBlock("meteorite_pallasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_RUSTY_IRON = registerBlock("meteorite_rusty_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MICA_BIOTITE = registerBlock("mica_biotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MICROCLINE = registerBlock("microcline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZODIORITE = registerBlock("monzodiorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZOGRANITE = registerBlock("monzogranite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZOGRANITE_POLISHED = registerBlock("monzogranite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZONITE = registerBlock("monzonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZONITE_LARVIKITE = registerBlock("monzonite_larvikite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZONITE_QUARTZ = registerBlock("monzonite_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE = registerBlock("mudstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_COBBLESTONE = registerBlock("mudstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_BRICKS = registerBlock("mudstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_BRICKS_SMALL = registerBlock("mudstone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_POLISHED = registerBlock("mudstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_CLAYSTONE = registerBlock("mudstone_claystone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_MARL = registerBlock("mudstone_marl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE = registerBlock("mugearite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE_BRICKS = registerBlock("mugearite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE_BRICKS_SMALL = registerBlock("mugearite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE_POLISHED = registerBlock("mugearite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE = registerBlock("mylonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE_BRICKS = registerBlock("mylonite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE_BRICKS_SMALL = registerBlock("mylonite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE_POLISHED = registerBlock("mylonite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NEPHELINITE = registerBlock("nephelinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_CLAY = registerBlock("ochre_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_TERRACOTTA = registerBlock("ochre_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_TERRACOTTA_GLAZED = registerBlock("ochre_terracotta_glazed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_CLAY_SAPROLITE = registerBlock("ochre_clay_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OILSANDS = registerBlock("oilsands",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_OIL = registerBlock("shale_oil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIGOCLASE = registerBlock("oligoclase",
            () -> new PSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE = registerBlock("olivine",
            () -> new OlivineBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_BRICKS = registerBlock("olivine_bricks",
            () -> new OlivineBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_BRICKS_SMALL = registerBlock("olivine_bricks_small",
            () -> new OlivineBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_POLISHED = registerBlock("olivine_polished",
            () -> new OlivineBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_DUNITE = registerBlock("olivine_dunite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_FORSTERITE = registerBlock("olivine_forsterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_WEHRLITE = registerBlock("olivine_wehrlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SARDONYX = registerBlock("sardonyx",
            () -> new SiO2Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ONYX = registerBlock("onyx",
            () -> new SiO2Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ONYX_TILES = registerBlock("onyx_tiles",
            () -> new SiO2Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOCLASE_FELDSPAR = registerBlock("orthoclase_feldspar",
            () -> new KSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOCLASE_FELDSPAR_BRICKS = registerBlock("orthoclase_feldspar_bricks",
            () -> new KSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOCLASE_FELDSPAR_BRICKS_SMALL = registerBlock("orthoclase_feldspar_bricks_small",
            () -> new KSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOCLASE_FELDSPAR_POLISHED = registerBlock("orthoclase_feldspar_polished",
            () -> new KSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR = registerBlock("plagioclase_feldspar",
            () -> new PSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR_BRICKS = registerBlock("plagioclase_feldspar_bricks",
            () -> new PSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR_BRICKS_SMALL = registerBlock("plagioclase_feldspar_bricks_small",
            () -> new PSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR_POLISHED = registerBlock("plagioclase_feldspar_polished",
            () -> new PSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOPYROXENE = registerBlock("orthopyroxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PELES_HAIR = registerBlock("peles_hair",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE = registerBlock("peridotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE_BRICKS = registerBlock("peridotite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE_BRICKS_SMALL = registerBlock("peridotite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE_POLISHED = registerBlock("peridotite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST = registerBlock("permafrost",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_SOIL = registerBlock("permafrost_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_SAPROLITE = registerBlock("permafrost_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHONOTEPRHITE = registerBlock("phonotephrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSGENITE = registerBlock("phosgenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE = registerBlock("phyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_BRICKS = registerBlock("phyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_BRICKS_SMALL = registerBlock("phyllite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_POLISHED = registerBlock("phyllite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_COBBLESTONE = registerBlock("phyllite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_DUKE_STONE = registerBlock("phyllite_duke_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_SERICITE = registerBlock("phyllite_sericite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POZZOLANA = registerBlock("pozzolana",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PREHNITE = registerBlock("prehnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PSEUDOTACHYLITE = registerBlock("pseudotachylite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE = registerBlock("pumice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE_BRICKS = registerBlock("pumice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE_BRICKS_SMALL = registerBlock("pumice_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE_POLISHED = registerBlock("pumice_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMPELLYITE = registerBlock("pumpellyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROBITUMEN = registerBlock("pyrobitumen",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE = registerBlock("pyroxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_BRICKS = registerBlock("pyroxene_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_BRICKS_SMALL = registerBlock("pyroxene_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_POLISHED = registerBlock("pyroxene_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_HARZBURGITE = registerBlock("pyroxene_harzburgite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_WEBSTERITE = registerBlock("pyroxene_websterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENITE = registerBlock("pyroxenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOQUARTZITE = registerBlock("orthoquartzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE = registerBlock("quartzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_BRICKS = registerBlock("quartzite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_BRICKS_SMALL = registerBlock("quartzite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_POLISHED = registerBlock("quartzite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_COBBLESTONE = registerBlock("quartzite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_WEATHERED = registerBlock("quartzite_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_STIPERSTONE = registerBlock("quartzite_stiperstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZOLITE = registerBlock("quartzolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY = registerBlock("red_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_TERRACOTTA = registerBlock("red_clay_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_TERRACOTTA_GLAZED = registerBlock("red_clay_terracotta_glazed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_SAPROLITE = registerBlock("red_clay_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHODOCHROSITE_BANDED = registerBlock("rhodochrosite_banded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYODACITE = registerBlock("rhyodacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE = registerBlock("rhyolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_BRICKS = registerBlock("rhyolite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_BRICKS_SMALL = registerBlock("rhyolite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_POLISHED = registerBlock("rhyolite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_COMENDITE = registerBlock("rhyolite_comendite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_LLANITE = registerBlock("rhyolite_llanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_PANTELLERITE = registerBlock("rhyolite_pantellerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SALT_FLAT = registerBlock("salt_flat",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE = registerBlock("sandstone_arkose",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_BRICKS = registerBlock("sandstone_arkose_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_BRICKS_SMALL = registerBlock("sandstone_arkose_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_POLISHED = registerBlock("sandstone_arkose_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_COBBLESTONE = registerBlock("sandstone_arkose_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE = registerBlock("sandstone_feldspathic_arenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_BRICKS = registerBlock("sandstone_feldspathic_arenite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_BRICKS_SMALL = registerBlock("sandstone_feldspathic_arenite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_POLISHEd = registerBlock("sandstone_feldspathic_arenite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_COBBLESTONE = registerBlock("sandstone_feldspathic_arenite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GANISTER = registerBlock("sandstone_ganister",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GANISTER_ROOT_TRACED = registerBlock("sandstone_ganister_root_traced",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE = registerBlock("sandstone_greywacke",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_BRICKS = registerBlock("sandstone_greywacke_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_BRICKS_SMALL = registerBlock("sandstone_greywacke_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_POLISHED = registerBlock("sandstone_greywacke_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_COBBLESTONE = registerBlock("sandstone_greywacke_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ITACOLUMNITE = registerBlock("sandstone_itacolumnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE = registerBlock("sandstone_quartz_arenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_BRICKS = registerBlock("sandstone_quartz_arenite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_BRICKS_SMALL = registerBlock("sandstone_quartz_arenite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_POLISHED = registerBlock("sandstone_quartz_arenite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_COBBLESTONE = registerBlock("sandstone_quartz_arenite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_TURBIDITE = registerBlock("sandstone_turbidite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANIDINE = registerBlock("sanidine",
            () -> new KSparBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE = registerBlock("schist_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_BRICKS = registerBlock("schist_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_BRICKS_SMALL = registerBlock("schist_blue_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_POLISHED = registerBlock("schist_blue_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_COBBLESTONE = registerBlock("schist_blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN = registerBlock("schist_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_BRICKS = registerBlock("schist_green_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_BRICKS_SMALL = registerBlock("schist_green_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_POLISHED = registerBlock("schist_green_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_COBBLESTONE = registerBlock("schist_green_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_MICA = registerBlock("schist_mica",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_WHITE = registerBlock("schist_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_WHITE_COBBLESTONE = registerBlock("schist_white_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA = registerBlock("scoria",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_BRICKS = registerBlock("scoria_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_BRICKS_SMALL = registerBlock("scoria_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_POLISHED = registerBlock("scoria_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_BLACK = registerBlock("scoria_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCREE = registerBlock("scree",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SELENITE_CRYSTAL = registerBlock("selenite_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE = registerBlock("serpentine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_COBBLESTONE = registerBlock("serpentine_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_BRICKS = registerBlock("serpentine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_BRICKS_SMALL = registerBlock("serpentine_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_POLISHED = registerBlock("serpentine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_JADEITITE = registerBlock("serpentine_jadeitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_RODINGITE = registerBlock("serpentine_rodingite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINITE = registerBlock("serpentinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_COBBLESTONE = registerBlock("shale_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BRICKS = registerBlock("shale_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BRICKS_SMALL = registerBlock("shale_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_POLISHED = registerBlock("shale_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI = registerBlock("shale_hakatai",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_COBBLESTONE = registerBlock("shale_hakatai_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_BRICKS = registerBlock("shale_hakatai_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_BRICKS_SMALL = registerBlock("shale_hakatai_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_POLISHED = registerBlock("shale_hakatai_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_LAMINA = registerBlock("shale_lamina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_RADON = registerBlock("shale_radon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BLACK = registerBlock("shale_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_CANNEL_COAL = registerBlock("shale_cannel_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BOGHEAD_COAL = registerBlock("boghead_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_TASMANITE = registerBlock("shale_tasmanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_KUKERSITE = registerBlock("shale_kukersite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE = registerBlock("shoshonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE_BRICKS = registerBlock("shoshonite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE_BRICKS_SMALL = registerBlock("shoshonite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE_POLISHED = registerBlock("shoshonite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SIDERITE_BLOCK = registerBlock("siderite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SIDEROPHYLLITE = registerBlock("siderophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE = registerBlock("siltstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_COBBLESTONE = registerBlock("siltstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_BRICKS = registerBlock("siltstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_BRICKS_SMALL = registerBlock("siltstone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_POLISHED = registerBlock("siltstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SLATE_BLUE = registerBlock("slate_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SLATE_BLUE_COBBLESTONE = registerBlock("slate_blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE = registerBlock("soapstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_BRICKS = registerBlock("soapstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_BRICKS_SMALL = registerBlock("soapstone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_POLISHED = registerBlock("soapstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_WEATHERED = registerBlock("soapstone_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_JADE = registerBlock("soapstone_jade",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STROMATOLITE = registerBlock("stromatolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SUNSTONE = registerBlock("sunstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SUNSTONE_RAINBOW_LATTICE = registerBlock("sunstone_rainbow_lattice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE = registerBlock("syenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_BRICKS = registerBlock("syenite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_BRICKS_SMALL = registerBlock("syenite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_POLISHED = registerBlock("syenite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_FOYAITE = registerBlock("syenite_foyaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_LARIMAR = registerBlock("syenite_larimar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_MIASKITE = registerBlock("syenite_miaskite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_NEPHELINE = registerBlock("syenite_nepheline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_PECTOLITE = registerBlock("syenite_pectolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_SHONKINITE = registerBlock("syenite_shonkinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYLVINITE = registerBlock("sylvinite",
            () -> new KClNaClBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYLVITE_BLOCK = registerBlock("sylvite_block",
            () -> new KClBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TACHYLITE = registerBlock("tachylite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TACONITE = registerBlock("taconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TALUS = registerBlock("talus",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE = registerBlock("tektite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_COESITE = registerBlock("tektite_coesite",
            () -> new SiO2Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TEKTITE_DARWIN_GLASS = registerBlock("tektite_darwin_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_IMPACT_BRECCIA = registerBlock("tektite_impact_breccia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_LECHATELIERITE = registerBlock("tektite_lechatelierite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_MOLDAVITE = registerBlock("tektite_moldavite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_REIDITE = registerBlock("tektite_reidite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEPHRIPHONOLITE = registerBlock("tephriphonolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEPHRITE = registerBlock("tephrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TESCHENITE = registerBlock("teschenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE = registerBlock("tholeiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE_BRICKS = registerBlock("tholeiite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE_BRICKS_SMALL = registerBlock("tholeiite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE_POLISHED = registerBlock("tholeiite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE = registerBlock("tonalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_WEATHERED = registerBlock("tonalite_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_BRICKS = registerBlock("tonalite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_BRICKS_SMALL = registerBlock("tonalite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_POLISHED = registerBlock("tonalite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOURMALINE_DRAVITE = registerBlock("tourmaline_dravite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOURMALINE_ELBAITE = registerBlock("tourmaline_elbaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOURMALINE_SCHORL = registerBlock("tourmaline_schorl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYANDESITE = registerBlock("trachyandesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYANDESITE_BENMOREITE = registerBlock("trachyandesite_benmoreite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYBASALT = registerBlock("trachybasalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE = registerBlock("trachyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_BRICKS = registerBlock("trachyite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_BRICKS_SMALL = registerBlock("trachyite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_POLISHED = registerBlock("trachyite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_KENYTE = registerBlock("trachyite_kenyte",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_PHONOLITE = registerBlock("trachyite_phonolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME = registerBlock("travertine_lime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME_BRICKS = registerBlock("travertine_lime_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME_BRICKS_SMALL = registerBlock("travertine_lime_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME_POLISHED = registerBlock("travertine_lime_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH = registerBlock("travertine_peach",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH_BRICKS = registerBlock("travertine_peach_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH_BRICKS_SMALL = registerBlock("travertine_peach_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH_POLISHED = registerBlock("travertine_peach_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TUFA = registerBlock("tufa",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRINITITE = registerBlock("trinitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TROCTOLITE = registerBlock("troctolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRONDHJEMITE = registerBlock("trondhjemite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_IGNIMBRITE = registerBlock("tuff_ignimbrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_PALAGONITE = registerBlock("tuff_palagonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> UMBER = registerBlock("umber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VARIOLITE = registerBlock("variolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VARVE = registerBlock("varve",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH = registerBlock("volcanic_ash",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_SMOKER_LARGE = registerBlock("white_smoker_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> WHITE_SMOKER_SMALL = registerBlock("white_smoker_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ZIRCON = registerBlock("zircon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
// blocks of X \\
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_BLOCK = registerBlock("ametrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTIMONY_BLOCK = registerBlock("antimony_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTHRACITE_BLOCK = registerBlock("anthracite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARSENIC_BLOCK = registerBlock("arsenic_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> AVENTURINE_BLOCK = registerBlock("aventurine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BARIUM_BLOCK = registerBlock("barium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BLOODSTONE_BLOCK = registerBlock("bloodstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BORON_BLOCK = registerBlock("boron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CADMIUM_BLOCK = registerBlock("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CALCIUM_BLOCK = registerBlock("calcium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CARBON_BLOCK = registerBlock("carbon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CERIUM_BLOCk = registerBlock("cerium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CESIUM_BLOCK = registerBlock("cesium_bloc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DUMORTIERITE_BLOCK = registerBlock("dumortierite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DYSPROSIUM_BLOCK = registerBlock("dysprosium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ERBIUM_BLOCK = registerBlock("erbium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> EUROPIUM_BLOCK = registerBlock("europium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FLINT_BLOCK = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GADOLINIUM_BLOCK = registerBlock("gadolinium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GALLIUM_BLOCK = registerBlock("gallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GERMANIUM_BLOCK = registerBlock("germanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> HAFNIUM_BLOCK = registerBlock("hafnium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> HOLMIUM_BLOCK = registerBlock("holmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> INDIUM_BLOCK = registerBlock("indium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> IODINE_BLOCK = registerBlock("iodine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerBlock("iridium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LANTHANUM_BLOCK = registerBlock("lanthanum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LUTETIUM_BLOCK = registerBlock("lutetium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MANGANESE_BLOCK = registerBlock("manganese_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MERCURY_BLOCK = registerBlock("mercury_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOLYBDENUM_BLOCK = registerBlock("molybdenum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MORTAR_BLOCK = registerBlock("mortar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MULLITE_BLOCK = registerBlock("mullite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MULLITE_TILES = registerBlock("mullite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NEODYMIUM_BLOCK = registerBlock("neodymium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> NEPTUNIUM_BLOCK = registerBlock("neptunium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = registerBlock("niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PALLADIUM_BLOCK = registerBlock("palladium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORUS_BLOCK = registerBlock("phosphorus_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POTASSIUM_BLOCK = registerBlock("potassium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PRASEODYMIUM_BLOCK = registerBlock("praseodymium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PRASIOLITE_BLOCK = registerBlock("prasiolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PROTACTINIUM_BLOCK = registerBlock("protactinium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RHENIUM_BLOCK = registerBlock("rhenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RHODIUM_BLOCK = registerBlock("rhodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ROSE_BLOCK = registerBlock("rose_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBIDIUM_BLOCK = registerBlock("rubidium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RUTHENIUM_BLOCk = registerBlock("ruthenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAMARIUM_BLOCK = registerBlock("samarium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SCANDIUM_BLOCK = registerBlock("scandium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SELENIUM_BLOCK = registerBlock("selenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SMOKY_BLOCK = registerBlock("smoky_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SODIUM_BLOCK = registerBlock("sodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> STRONTIUM_BLOCK = registerBlock("strontium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SUGAR_BLOCK = registerBlock("sugar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TANTALUM_BLOCK = registerBlock("tantalum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TELLURIUM_BLOCK = registerBlock("tellurium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TERBIUM_BLOCK = registerBlock("terbium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> THALLIUM_BLOCK = registerBlock("thallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> THORIUM_BLOCK = registerBlock("thorium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> THULIUM_BLOCK = registerBlock("thulium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> VANADIUM_BLOCK = registerBlock("vanadium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> YTTERBIUM_BLOCK = registerBlock("ytterbium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> YTTRIUM_BLOCK = registerBlock("yttrium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ZIRCONIUM_BLOCK = registerBlock("zirconium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
// construction \\
    public static final RegistryObject<Block> ADOBE = registerBlock("adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADOBE_BRICKS = registerBlock("adobe_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADOBE_REINFORCED = registerBlock("adobe_reinforced",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALABASTER = registerBlock("alabaster",
            () -> new CaSO4Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALABASTER_TILES = registerBlock("alabaster_tiles",
            () -> new CaSO4Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amehyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_CHISELED = registerBlock("amethyst_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_PILLAR = registerBlock("amethyst_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_POLISHED = registerBlock("amethyst_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_BRICKS = registerBlock("ametrine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_CHISELED = registerBlock("ametrine_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_PILLAR = registerBlock("ametrine_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_POLISHED = registerBlock("ametrine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AQUARIUM_GRAVEL = registerBlock("aquarium_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AQUARIUM_GRAVEL_NEON = registerBlock("aquarium_gravel_neon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ASPHALT_WEATHERED = registerBlock("asphalt_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_BRICKS = registerBlock("aventurine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AVENTURINE_CHISELED = registerBlock("aveturine_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AVENTURINE_PILLAR = registerBlock("aventurine_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AVENTURINE_POLISHED = registerBlock("aventurine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_BRICKS = registerBlock("bloodstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_CHISELED = registerBlock("bloodstone_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_PILLAR = registerBlock("bloodstone_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_POLISHED = registerBlock("bloodstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_BRICKS = registerBlock("citrine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_CHISELED = registerBlock("citrine_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_PILLAR = registerBlock("citrine_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_POLISHED = registerBlock("citrine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CONCRETE_CALCITE = registerBlock("concrete_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_CALCITE = registerBlock("concrete_powder_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_HEMATITE = registerBlock("concrete_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_HEMATITE = registerBlock("concrete_powder_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_SIDERITE = registerBlock("concrete_siderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_SIDERITE = registerBlock("concrete_powder_siderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_SILICA = registerBlock("concrete_silica",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_SILICA = registerBlock("concrete_powder_silica",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_METACONGLOMERATE = registerBlock("concrete_metaconglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_METACONGLOMERATE = registerBlock("concrete_powder_metaconglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROMAN_CONCRETE = registerBlock("roman_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY = registerBlock("ivory",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_CRACKED = registerBlock("ivory_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_TILES = registerBlock("ivory_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_BONE_BLOCK = registerBlock("ivory_bone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED = registerBlock("ivory_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED_CRACKED = registerBlock("ivory_weathered_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED_TILES = registerBlock("ivory_weathered_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED_BONE_BLOCK = registerBlock("ivory_weathered_bone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAVINITE = registerBlock("lavinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEAD_LINED_CASE = registerBlock("lead_lined_case",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN = registerBlock("porcelain",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_CRACKED = registerBlock("porcelain_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_BLUE_TILES = registerBlock("porcelain_blue_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_FISH = registerBlock("porcelain_fish",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_FLOWER = registerBlock("porcelain_flower",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_MIXED_TILES = registerBlock("porcelain_mixed_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_RED_TILES = registerBlock("porcelain_red_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_DRAGON = registerBlock("porcelain_dragon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_PILLAR = registerBlock("porcelain_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_KINTSUGI = registerBlock("porcelain_kintsugi",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_KINTSUGI_TILES = registerBlock("porcelain_kintsugi_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_BRICKS = registerBlock("prasiolite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASIOLITE_CHISELED = registerBlock("prasiolite_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASIOLITE_PILLAR = registerBlock("prasiolite_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASIOLITE_POLISHED = registerBlock("prasiolite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_BRICKS = registerBlock("rose_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_CHISELED = registerBlock("rose_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_PILLAR = registerBlock("rose_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_POLISHED = registerBlock("rose_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_BRICKS = registerBlock("smoky_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_CHISELED = registerBlock("smoky_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_PILLAR = registerBlock("smoky_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_POLISHED = registerBlock("smoky_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OBSIDIAN_GLASS = registerBlock("obsidian_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> OBSIDIAN_GLASS_PANE = registerBlock("obsidian_glass_pane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_GLASS = registerBlock("uranium_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> URANIUM_GLASS_PANE = registerBlock("uranium_glass_pane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    // sediment + \\ YOU ARE HERE in block models
    public static final RegistryObject<Block> LOAM_DENSE = registerBlock("loam_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_DIRTY = registerBlock("loam_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_COARSE = registerBlock("loam_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_ROOTED = registerBlock("loam_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_GRASSY = registerBlock("loam_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_ROCKY = registerBlock("loam_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_LOAMY = registerBlock("red_clay_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_LOAMY = registerBlock("clay_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_LOAMY = registerBlock("silt_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_DENSE = registerBlock("dirt_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_DENSE_GRASSY = registerBlock("dirt_dense_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_ROCKY = registerBlock("dirt_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_RED = registerBlock("dirt_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_DIRTY = registerBlock("clay_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_DIRTY = registerBlock("silt_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT = registerBlock("peat",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_DENSE = registerBlock("peat_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_COARSE_DENSE = registerBlock("dirt_coarse_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_COARSE_ROOTED = registerBlock("dirt_coarse_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_COARSE_ROCKY = registerBlock("dirt_coarse_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_ROOTED_DENSE = registerBlock("dirt_rooted_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_ROOTED_STONY = registerBlock("dirt_rooted_stony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_RED_ROOTED = registerBlock("dirt_red_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_DIRTY_ROOTED = registerBlock("clay_dirty_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_GRASSY = registerBlock("peat_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUEGRASS = registerBlock("bluegrass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_DIRTY_GRASSY = registerBlock("silt_dirty_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_ROCKY = registerBlock("peat_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_OVERGROWN = registerBlock("stone_overgrowm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_DENSE = registerBlock("stone_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_DENSE = registerBlock("red_clay_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_COARSE = registerBlock("red_clay_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_ROOTED = registerBlock("red_clay_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_GRASSY = registerBlock("red_clay_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_ROCKY = registerBlock("red_clay_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIXED_CLAY_DENSE = registerBlock("mixed_clay_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_COARSE = registerBlock("clay_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_ROOTED = registerBlock("clay_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_GRASSY = registerBlock("clay_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_ROCKY = registerBlock("clay_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIXED_CLAY = registerBlock("mixed_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_DENSE = registerBlock("clay_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_COARSE = registerBlock("silt_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_ROOTED = registerBlock("silt_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_GRASSY = registerBlock("silt_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_ROCKY = registerBlock("silt_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_SILTY = registerBlock("red_clay_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_SILTY = registerBlock("clay_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_DENSE = registerBlock("silt_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_DIRTY = registerBlock("sand_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_COARSE = registerBlock("sand_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_DIRTY_GRASSY = registerBlock("sand_dirty_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_ROCKY = registerBlock("sand_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_SANDY = registerBlock("red_clay_sandy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_SANDY = registerBlock("clay_sandy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_SILTY = registerBlock("sand_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_DENSE = registerBlock("sand_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_MIXED = registerBlock("sand_mixed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_DIRTY = registerBlock("sand_red_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_COARSE = registerBlock("sand_red_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_DIRTY_GRASSY = registerBlock("sand_red_dirty_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_ROCKY = registerBlock("sand_red_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_SOIL = registerBlock("bauxite_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_SILTY = registerBlock("sand_red_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_DENSE = registerBlock("sand_red_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_LOAMY = registerBlock("gravel_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_DIRTY = registerBlock("gravel_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_COARSE = registerBlock("gravel_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_ROCKY = registerBlock("gravel_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_GRAVELLY = registerBlock("red_clay_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_GRAVELLY = registerBlock("clay_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_SILTY = registerBlock("gravel_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_GRAVELLY = registerBlock("sand_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_GRAVELLY = registerBlock("sand_red_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_DENSE = registerBlock("gravel_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_FROSTY = registerBlock("gravel_frosty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUCK = registerBlock("muck",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_DIRTY = registerBlock("permafrost_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_COARSE = registerBlock("permafrost_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUCK_GRASSY = registerBlock("muck_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_ROCKY = registerBlock("permafrost_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_SILTY = registerBlock("permafrost_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_DENSE = registerBlock("permafrost_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_DIRTY = registerBlock("volcanic_ash_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_SILTY = registerBlock("volcanic_ash_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_DENSE = registerBlock("volcanic_ash_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOOT = registerBlock("soot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPILLI_GRAVEL = registerBlock("lapilli_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPILLI_GRAVEL_ACCRETIONARY = registerBlock("lapilli_gravel_accretionary",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_LAPILLI = registerBlock("tuff_lapilli",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_LAPILLI_ACCRETIONARY = registerBlock("tuff_lapilli_accretionary",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    // vanilla + \\ NOW HERE
    public static final RegistryObject<Block> CORALSTONE_FOSSILIZED = registerBlock("coralstone_fossilized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_COQUINA = registerBlock("coralstone_coquina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_PRISMARINE = registerBlock("coralstone_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_DARK_PRISMARINE = registerBlock("coralstone_dark_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_LARGE_BRICKS = registerBlock("coralstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_SMALL_BRICKS = registerBlock("coralstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_POLISHED = registerBlock("coralstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_LARGE_BRICKS = registerBlock("andesite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_SMALL_BRICKS = registerBlock("andesite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_LARGE_BRICKS = registerBlock("diorite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_SMALL_BRICKS = registerBlock("diorite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_GRANITE_LARGE_BRICKS = registerBlock("red_granite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_GRANITE_SMALL_BRICKS = registerBlock("red_granite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_SMOOTH_FACETED = registerBlock("basalt_smooth_faceted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_LARGE_BRICKS = registerBlock("basalt_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_SMALL_BRICKS = registerBlock("basalt_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_SMALL_BRICKS = registerBlock("tuff_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_POLISHED = registerBlock("calcite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_LARGE_BRICKS = registerBlock("calcite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_SMALL_BRICKS = registerBlock("calcite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_POLISHED = registerBlock("dripstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_LARGE_BRICKS = registerBlock("dripstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_SMALL_BRICKS = registerBlock("dripstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_COBBLESTONE = registerBlock("dripstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED = registerBlock("obsidian_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_LARGE_BRICKS = registerBlock("obsidian_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_SMALL_BRICKS = registerBlock("obsidian_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_LARGE_BRICKS = registerBlock("sandstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SMALL_BRICKS = registerBlock("sandstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_RED_LARGE_BRICKS = registerBlock("sandstone_red_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_RED_SMALL_BRICKS = registerBlock("sandstone_red_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_SMALL_BRICKS = registerBlock("deepslate_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACKSTONE_SMALL_BRICKS = registerBlock("blackstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLOWSTONE_POLISHED = registerBlock("glowstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLOWSTONE_LARGE_BRICKS = registerBlock("glowstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLOWSTONE_SMALL_BRICKS = registerBlock("glowstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ENDSTONE_POLISHED = registerBlock("endstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ENDSTONE_SMALL_BRICKS = registerBlock("endstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_POLISHED = registerBlock("stone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_SMALL_BRICKS = registerBlock("stone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPURITE = registerBlock("purpurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPURITE_POLISHED = registerBlock("purpurite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPURITE_SMALL_TILES = registerBlock("purpurite_small_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_POLISHED = registerBlock("prismarine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_SMALL_BRICKS = registerBlock("prismarine_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_RAW = registerBlock("dark_prismarine_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_POLISHED = registerBlock("dark_prismarine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_LARGE_TILES = registerBlock("dark_prismarine_large_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERRACK_POLISHED = registerBlock("netherrack_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERRACK_LARGE_BRICKS = registerBlock("netherrack_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERRACK_SMALL_BRICKS = registerBlock("netherrack_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_BASALT = registerBlock("sand_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BASALT = registerBlock("sandstone_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BASALT_SMOOTH = registerBlock("sandstone_basalt_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BASALT_CUT = registerBlock("sandstone_basalt_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_CASSITERITE = registerBlock("sand_cassiterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASSITERITE = registerBlock("sandstone_cassiterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASSITERITE_SMOOTH = registerBlock("sandstone_cassiterite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASSITERITE_CUT = registerBlock("sandstone_cassiterite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_GLAUCONITE = registerBlock("sand_glauconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GLAUCONITE = registerBlock("sandstone_glauconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GLAUCONITE_SMOOTH = registerBlock("sandstone_glauconite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GLAUCONITE_CUT = registerBlock("sandstone_glauconite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_GRANITE = registerBlock("sand_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GRANITE = registerBlock("sandstone_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GRANITE_SMOOTH = registerBlock("sandstone_granite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GRANITE_CUT = registerBlock("sandstone_granite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_K_FELDSPAR = registerBlock("sand_k_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_K_FELDSPAR = registerBlock("sandstone_k_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_K_FELDSPAR_SMOOTH = registerBlock("sandstone_k_feldspar_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_K_FELDSPAR_CUT = registerBlock("sandstone_k_feldspar_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_PLAGIOCLASE_FELDSPAR = registerBlock("sand_plagioclase_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_PLAGIOCLASE_FELDSPAR = registerBlock("sandstone_plagioclase_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_PLAGIOCLASE_FELDSPAR_SMOOTH = registerBlock("sandstone_plagioclase_feldspar_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_PLAGIOCLASE_FELDSPAR_CUT = registerBlock("sandstone_plagioclase_feldspar_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_SODALITE = registerBlock("sand_sodalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SODALITE = registerBlock("sandstone_sodalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SODALITE_SMOOTH = registerBlock("sandstone_sodalite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SODALITE_CUT = registerBlock("sandstone_sodalite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    // features \\
    public static final RegistryObject<Block> PETRIFIED_LOG = registerBlock("petrified_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_TOP = registerBlock("petrified_log_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_SIDE = registerBlock("petrified_log_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED = registerBlock("petrified_log_stripped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_TOP = registerBlock("petrified_log_stripped_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_SIDE = registerBlock("petrified_log_stripped_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_OPALIZED = registerBlock("petrified_log_opalized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_OPALIZED_TOP = registerBlock("petrified_log_opalized_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_OPALIZED_SIDE = registerBlock("petrified_log_opalized_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_OPALIZED = registerBlock("petrified_log_stripped_opalized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_OPALIZED_TOP = registerBlock("petrified_log_stripped_opalized_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_OPALIZED_SIDE = registerBlock("petrified_log_stripped_opalized_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_WOOD_PLANKS = registerBlock("petrified_wood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TORCH_STRONTIUM = registerBlock("torch_strontium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_CALCIUM = registerBlock("torch_calcium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_IRON = registerBlock("torch_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_SALT_NACL = registerBlock("torch_salt_nacl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_BARIUM = registerBlock("torch_barium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_COPPER = registerBlock("torch_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_SYLVITE = registerBlock("torch_sylvite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_ZINC = registerBlock("torch_zinc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_NITRE = registerBlock("torch_nitre",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_LITHIUM = registerBlock("torch_lithium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_MAGNESIUM = registerBlock("torch_magnesium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_ALUMINUM = registerBlock("torch_aluminum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    // Large Geodes
    public static final RegistryObject<Block> ROSE_CRYSTAL_BLOCK = registerBlock("rose_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_BUDDING_CRYSTAL_BLOCK = registerBlock("rose_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_CLUSTER = registerBlock("rose_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_LARGE_BUD = registerBlock("rose_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_MEDIUM_BUD = registerBlock("rose_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_SMALL_BUD = registerBlock("rose_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_CRYSTAL_BLOCK = registerBlock("smoky_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_BUDDING_CRYSTAL_BLOCK = registerBlock("smoky_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_CLUSTER = registerBlock("smoky_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_LARGE_BUD = registerBlock("smoky_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_MEDIUM_BUD = registerBlock("smoky_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_SMALL_BUD = registerBlock("smoky_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_CRYSTAL_BLOCK = registerBlock("prasiolite_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_BUDDING_CRYSTAL_BLOCK = registerBlock("prasiolite_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_CLUSTER = registerBlock("prasiolite_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_LARGE_BUD = registerBlock("prasiolite_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_MEDIUM_BUD = registerBlock("prasiolite_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_SMALL_BUD = registerBlock("brasiolite_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_CRYSTAL_BLOCK = registerBlock("dumortierite_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_BUDDING_CRYSTAL_BLOCK = registerBlock("dumortierite_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_CLUSTER = registerBlock("dumortierite_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_LARGE_BUD = registerBlock("dumortierite_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_MEDIUM_BUD = registerBlock("dumortierite_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_SMALL_BUD = registerBlock("dumortierite_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_CRYSTAL_BLOCK = registerBlock("bloodstone_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_BUDDING_CRYSTAL_BLOCK = registerBlock("bloodstone_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_CLUSTER = registerBlock("bloodstone_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_LARGE_BUD = registerBlock("bloodstone_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_MEDIUM_BUD = registerBlock("bloodstone_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_SMALL_BUD = registerBlock("bloodstone_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_CRYSTAL_BLOCK = registerBlock("aventurine_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_BUDDING_CRYSTAL_BLOCK = registerBlock("aventurine_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_CLUSTER = registerBlock("aventurine_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_LARGE_BUD = registerBlock("aventurine_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_MEDIUM_BUD = registerBlock("aventurine_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_CRYSTAL_BLOCK = registerBlock("ametrine_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_BUDDING_CRYSTAL_BLOCK = registerBlock("ametrine_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_CLUSTER = registerBlock("ametrine_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_LARGE_BUD = registerBlock("ametrine_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_MEDIUM_BUD = registerBlock("ametrine_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_SMALL_BUD = registerBlock("ametrine_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_CRYSTAL_BLOCK = registerBlock("citrine_crysal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_BUDDING_CRYSTAL_BLOCK = registerBlock("citrine_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_CLUSTER = registerBlock("citrine_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_LARGE_BUD = registerBlock("citrine_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_MEDIUM_BUD = registerBlock("citrine_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_SMALL_BUD = registerBlock("citrine_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_CRYSTAL_BLOCK = registerBlock("quartz_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_BUDDING_CRYSTAL_BLOCK = registerBlock("quartz_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_CLUSTER = registerBlock("quartz_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_LARGE_BUD = registerBlock("quartz_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_MEDIUM_BUD = registerBlock("quartz_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_SMALL_BUD = registerBlock("quartz_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    //more
    public static final RegistryObject<Block> BAUXITE_KARST = registerBlock("bauxite_karst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FIRECLAY = registerBlock("fireclay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLINT_CLAY = registerBlock("flint_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GANISTER_CLAY = registerBlock("ganister_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALICHE_AQUATIC = registerBlock("caliche_aquatic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALICHE_TERRAGENOUS = registerBlock("caliche_terragenous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BENTONITE_ASH = registerBlock("bentonite_ash",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_IGNIMBRITE_LAPILLI = registerBlock("tuff_ignimbrite_lapilli",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_BLOCK_COMMON = registerBlock("opal_block_common",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_BLOCK_BOULDER = registerBlock("opal_block_boulder",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
