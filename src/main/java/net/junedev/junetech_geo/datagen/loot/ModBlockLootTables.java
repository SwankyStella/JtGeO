/*package net.junedev.junetech_geo.datagen.loot;

import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;


public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ADAKITE.get());
        this.dropSelf(ModBlocks.ADAKITE_BRICKS.get());
        this.dropSelf(ModBlocks.ADAKITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.ADAKITE_POLISHED.get());
        this.dropSelf(ModBlocks.ADOBE.get());
        this.dropSelf(ModBlocks.ADOBE_BRICKS.get());
        this.dropSelf(ModBlocks.ADOBE_REINFORCED.get());
        this.dropSelf(ModBlocks.ALABASTER.get());
        this.dropSelf(ModBlocks.ALABASTER_TILES.get());
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.AMBER_BLOCK.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK.get());
        this.dropSelf(ModBlocks.AMETHYST_BRICKS.get());
        this.dropSelf(ModBlocks.AMETHYST_CHISELED.get());
        this.dropSelf(ModBlocks.AMETHYST_PILLAR.get());
        this.dropSelf(ModBlocks.AMETHYST_POLISHED.get());
        this.dropSelf(ModBlocks.AMETRINE_BLOCK.get());
        this.dropSelf(ModBlocks.AMETRINE_BRICKS.get());
        this.dropSelf(ModBlocks.AMETRINE_CHISELED.get());
        this.dropSelf(ModBlocks.AMETRINE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.AMETRINE_PILLAR.get());
        this.dropSelf(ModBlocks.AMETRINE_POLISHED.get());
        this.dropSelf(ModBlocks.AMPHIBOLE.get());
        this.dropSelf(ModBlocks.AMPHIBOLITE.get());
        this.dropSelf(ModBlocks.ANDALUSITE.get());
        this.dropSelf(ModBlocks.ANDERSONITE.get());
        this.dropSelf(ModBlocks.ANDESITE_ICELANDITE.get());
        this.dropSelf(ModBlocks.ANDESITE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.ANDESITE_RED.get());
        this.dropSelf(ModBlocks.ANDESITE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.ANDESITE_VOLCANIC.get());
        this.dropSelf(ModBlocks.ANORTHITE.get());
        this.dropSelf(ModBlocks.ANORTHOSITE.get());
        this.dropSelf(ModBlocks.ANTHRACITE.get());
        this.dropSelf(ModBlocks.ANTHRACITE_BLOCK.get());
        this.dropSelf(ModBlocks.ANTHRACITE_BRICKS.get());
        this.dropSelf(ModBlocks.ANTHRACITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.ANTHRACITE_POLISHED.get());
        this.dropSelf(ModBlocks.ANTHRACITE_RESINITE.get());
        this.dropSelf(ModBlocks.ANTIMONY_BLOCK.get());
        this.dropSelf(ModBlocks.AQUARIUM_GRAVEL.get());
        this.dropSelf(ModBlocks.AQUARIUM_GRAVEL_NEON.get());
        this.dropSelf(ModBlocks.ARAGONITE_CRYSTAL.get());
        this.dropSelf(ModBlocks.ARGILLITE_BRICKS.get());
        this.dropSelf(ModBlocks.ARGILLITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.ARGILLITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ARGILLITE_POLISHED.get());
        this.dropSelf(ModBlocks.ASPHALT.get());
        this.dropSelf(ModBlocks.ASPHALT_WEATHERED.get());
        this.dropSelf(ModBlocks.AUGITE.get());
        this.dropSelf(ModBlocks.AVENTURINE_BLOCK.get());
        this.dropSelf(ModBlocks.AVENTURINE_BRICKS.get());
        this.dropSelf(ModBlocks.AVENTURINE_CHISELED.get());
        this.dropSelf(ModBlocks.AVENTURINE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.AVENTURINE_PILLAR.get());
        this.dropSelf(ModBlocks.AVENTURINE_POLISHED.get());
        this.dropSelf(ModBlocks.BANDED_IRON_FORMATION.get());
        this.dropSelf(ModBlocks.BARIUM_BLOCK.get());
        this.dropSelf(ModBlocks.BASALT_AGGLOMERATE.get());
        this.dropSelf(ModBlocks.BASALT_BONINITE.get());
        this.dropSelf(ModBlocks.BASALT_HAWAIITE.get());
        this.dropSelf(ModBlocks.BASALT_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.BASALT_LAYERED.get());
        this.dropSelf(ModBlocks.BASALT_PICRITE.get());
        this.dropSelf(ModBlocks.BASALT_PILLOW.get());
        this.dropSelf(ModBlocks.BASALT_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.BASALT_SMOOTH_FACETED.get());
        this.dropSelf(ModBlocks.BAUXITE_CALCAREOUS.get());
        this.dropSelf(ModBlocks.BAUXITE_LATERITE.get());
        this.dropSelf(ModBlocks.BAUXITE_SOIL.get());
        this.dropSelf(ModBlocks.BENTONITE_ASH.get());
        this.dropSelf(ModBlocks.BERYLLIUM_BLOCK.get());
        this.dropSelf(ModBlocks.BISMUTH_BLOCK.get());
        this.dropSelf(ModBlocks.BITUMEN.get());
        this.dropSelf(ModBlocks.BITUMEN_BRICKS.get());
        this.dropSelf(ModBlocks.BITUMEN_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.BITUMEN_POLISHED.get());
        this.dropSelf(ModBlocks.BITUMEN_RESINITE.get());
        this.dropSelf(ModBlocks.BITUMEN_SHUNGITE.get());
        this.dropSelf(ModBlocks.BLACK_SMOKER_LARGE.get());
        this.dropSelf(ModBlocks.BLACK_SMOKER_SMALL.get());
        this.dropSelf(ModBlocks.BLACKSTONE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.BLAIRMORITE.get());
        this.dropSelf(ModBlocks.BLOODSTONE_BLOCK.get());
        this.dropSelf(ModBlocks.BLOODSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.BLOODSTONE_CHISELED.get());
        this.dropSelf(ModBlocks.BLOODSTONE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.BLOODSTONE_PILLAR.get());
        this.dropSelf(ModBlocks.BLOODSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.BOG_IRON.get());
        this.dropSelf(ModBlocks.BOGHEAD_COAL.get());
        this.dropSelf(ModBlocks.BORON_BLOCK.get());
        this.dropSelf(ModBlocks.BRECCIA.get());
        this.dropSelf(ModBlocks.BRECCIA_BRICKS.get());
        this.dropSelf(ModBlocks.BRECCIA_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.BRECCIA_DALLASITE.get());
        this.dropSelf(ModBlocks.BRECCIA_GRAVEL.get());
        this.dropSelf(ModBlocks.BRECCIA_POLISHED.get());
        this.dropSelf(ModBlocks.BUDDINGTONITE.get());
        this.dropSelf(ModBlocks.CADMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CALCFLINTA.get());
        this.dropSelf(ModBlocks.CALCITE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.CALCITE_POLISHED.get());
        this.dropSelf(ModBlocks.CALCITE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.CALCIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CALICHE_AQUATIC.get());
        this.dropSelf(ModBlocks.CALICHE_TERRAGENOUS.get());
        this.dropSelf(ModBlocks.CALTHEMITE.get());
        this.dropSelf(ModBlocks.CARBON_BLOCK.get());
        this.dropSelf(ModBlocks.CARBONATITE_FENITE.get());
        this.dropSelf(ModBlocks.CARBONATITE_SOVITE.get());
        this.dropSelf(ModBlocks.CATACLASITE.get());
        this.dropSelf(ModBlocks.CATACLASITE_BRICKS.get());
        this.dropSelf(ModBlocks.CATACLASITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CATACLASITE_POLISHED.get());
        this.dropSelf(ModBlocks.CAVE_POPCORN.get());
        this.dropSelf(ModBlocks.CERIUM_BLOCk.get());
        this.dropSelf(ModBlocks.CESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CHALCONATRONITE.get());
        this.dropSelf(ModBlocks.CHALK_BRICKS.get());
        this.dropSelf(ModBlocks.CHALK_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CHALK_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CHALK_POLISHED.get());
        this.dropSelf(ModBlocks.CHARCOAL_BLOCK.get());
        this.dropSelf(ModBlocks.CHERT_AGATE.get());
        this.dropSelf(ModBlocks.CHERT_AGATE_BRICKS.get());
        this.dropSelf(ModBlocks.CHERT_AGATE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CHERT_AGATE_FIRE.get());
        this.dropSelf(ModBlocks.CHERT_AGATE_MOSS.get());
        this.dropSelf(ModBlocks.CHERT_AGATE_POLISHED.get());
        this.dropSelf(ModBlocks.CHERT_AGATE_PURPLE.get());
        this.dropSelf(ModBlocks.CHERT_BRICKS.get());
        this.dropSelf(ModBlocks.CHERT_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CHERT_CHALCEDONY_BRICKS.get());
        this.dropSelf(ModBlocks.CHERT_CHALCEDONY_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CHERT_CHALCEDONY_CARNELIAN.get());
        this.dropSelf(ModBlocks.CHERT_CHALCEDONY_CHROME.get());
        this.dropSelf(ModBlocks.CHERT_CHALCEDONY_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CHERT_CHALCEDONY_POLISHED.get());
        this.dropSelf(ModBlocks.CHERT_CHRYSOPAGE.get());
        this.dropSelf(ModBlocks.CHERT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CHERT_DIATOMIC.get());
        this.dropSelf(ModBlocks.CHERT_FLINTSTONE.get());
        this.dropSelf(ModBlocks.CHERT_FLINTSTONE_EMPTY.get());
        this.dropSelf(ModBlocks.CHERT_JASPER.get());
        this.dropSelf(ModBlocks.CHERT_JASPER_BRICKS.get());
        this.dropSelf(ModBlocks.CHERT_JASPER_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CHERT_JASPER_HELIOTROPE.get());
        this.dropSelf(ModBlocks.CHERT_JASPER_POLISHED.get());
        this.dropSelf(ModBlocks.CHERT_JASPILLITE.get());
        this.dropSelf(ModBlocks.CHERT_MOZARKITE.get());
        this.dropSelf(ModBlocks.CHERT_NOVACULITE_BRICKS.get());
        this.dropSelf(ModBlocks.CHERT_NOVACULITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CHERT_NOVACULITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CHERT_NOVACULITE_POLISHED.get());
        this.dropSelf(ModBlocks.CHERT_PIETERSITE.get());
        this.dropSelf(ModBlocks.CHERT_POLISHED.get());
        this.dropSelf(ModBlocks.CHERT_RADIOLARIAN.get());
        this.dropSelf(ModBlocks.CHERT_ROTTENSTONE.get());
        this.dropSelf(ModBlocks.CHLORASTOLITE.get());
        this.dropSelf(ModBlocks.CHROMITITE.get());
        this.dropSelf(ModBlocks.CHROMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CHRYSOCOLLA_BLUE.get());
        this.dropSelf(ModBlocks.CHRYSOCOLLA_GREEN.get());
        this.dropSelf(ModBlocks.CITRINE_BLOCK.get());
        this.dropSelf(ModBlocks.CITRINE_BRICKS.get());
        this.dropSelf(ModBlocks.CITRINE_CHISELED.get());
        this.dropSelf(ModBlocks.CITRINE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.CITRINE_PILLAR.get());
        this.dropSelf(ModBlocks.CITRINE_POLISHED.get());
        this.dropSelf(ModBlocks.CLAY_COARSE.get());
        this.dropSelf(ModBlocks.CLAY_DENSE.get());
        this.dropSelf(ModBlocks.CLAY_DIRTY.get());
        this.dropSelf(ModBlocks.CLAY_DIRTY_ROOTED.get());
        this.dropSelf(ModBlocks.CLAY_GRAVELLY.get());
        this.dropSelf(ModBlocks.CLAY_LOAMY.get());
        this.dropSelf(ModBlocks.CLAY_ROCKY.get());
        this.dropSelf(ModBlocks.CLAY_ROOTED.get());
        this.dropSelf(ModBlocks.CLAY_SANDY.get());
        this.dropSelf(ModBlocks.CLAY_SILTY.get());
        this.dropSelf(ModBlocks.CLINOPYROXENE.get());
        this.dropSelf(ModBlocks.COBALT_BLOCK.get());
        this.dropSelf(ModBlocks.CONCRETE_CALCITE.get());
        this.dropSelf(ModBlocks.CONCRETE_HEMATITE.get());
        this.dropSelf(ModBlocks.CONCRETE_METACONGLOMERATE.get());
        this.dropSelf(ModBlocks.CONCRETE_POWDER_CALCITE.get());
        this.dropSelf(ModBlocks.CONCRETE_POWDER_HEMATITE.get());
        this.dropSelf(ModBlocks.CONCRETE_POWDER_METACONGLOMERATE.get());
        this.dropSelf(ModBlocks.CONCRETE_POWDER_SIDERITE.get());
        this.dropSelf(ModBlocks.CONCRETE_POWDER_SILICA.get());
        this.dropSelf(ModBlocks.CONCRETE_SIDERITE.get());
        this.dropSelf(ModBlocks.CONCRETE_SILICA.get());
        this.dropSelf(ModBlocks.CONGLOMERATE.get());
        this.dropSelf(ModBlocks.CONGLOMERATE_BRICKS.get());
        this.dropSelf(ModBlocks.CONGLOMERATE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.CONGLOMERATE_GRAVEL.get());
        this.dropSelf(ModBlocks.CONGLOMERATE_POLISHED.get());
        this.dropSelf(ModBlocks.CORALSTONE_COQUINA.get());
        this.dropSelf(ModBlocks.CORALSTONE_DARK_PRISMARINE.get());
        this.dropSelf(ModBlocks.CORALSTONE_FOSSILIZED.get());
        this.dropSelf(ModBlocks.CORALSTONE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.CORALSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.CORALSTONE_PRISMARINE.get());
        this.dropSelf(ModBlocks.CORALSTONE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.CORIUM.get());
        this.dropSelf(ModBlocks.CORUNDITE.get());
        this.dropSelf(ModBlocks.CORUNDUM_MIXED.get());
        this.dropSelf(ModBlocks.CORUNDUM_RUBBLE.get());
        this.dropSelf(ModBlocks.CORUNDUM_RUBY.get());
        this.dropSelf(ModBlocks.CORUNDUM_SAPPHIRE.get());
        this.dropSelf(ModBlocks.DACITE.get());
        this.dropSelf(ModBlocks.DACITE_BRICKS.get());
        this.dropSelf(ModBlocks.DACITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.DACITE_POLISHED.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_LARGE_TILES.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_POLISHED.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_RAW.get());
        this.dropSelf(ModBlocks.DEEPSLATE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.DIABASE.get());
        this.dropSelf(ModBlocks.DIAMICTITE_BRICKS.get());
        this.dropSelf(ModBlocks.DIAMICTITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.DIAMICTITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.DIAMICTITE_POLISHED.get());
        this.dropSelf(ModBlocks.DIAMICTITE_TILLITE.get());
        this.dropSelf(ModBlocks.DIATOMITE.get());
        this.dropSelf(ModBlocks.DIORITE_BLACK.get());
        this.dropSelf(ModBlocks.DIORITE_HORNBLENDE.get());
        this.dropSelf(ModBlocks.DIORITE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.DIORITE_NAPOLEONITE.get());
        this.dropSelf(ModBlocks.DIORITE_QUARTZ.get());
        this.dropSelf(ModBlocks.DIORITE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.DIRT_COARSE_DENSE.get());
        this.dropSelf(ModBlocks.DIRT_COARSE_ROCKY.get());
        this.dropSelf(ModBlocks.DIRT_DENSE.get());
        this.dropSelf(ModBlocks.DIRT_RED.get());
        this.dropSelf(ModBlocks.DIRT_RED_ROOTED.get());
        this.dropSelf(ModBlocks.DIRT_ROCKY.get());
        this.dropSelf(ModBlocks.DIRT_ROOTED_DENSE.get());
        this.dropSelf(ModBlocks.DIRT_ROOTED_STONY.get());
        this.dropSelf(ModBlocks.DIRT_SAPROLITE.get());
        this.dropSelf(ModBlocks.DOLOMITE_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.DOLOMITE_POLISHED.get());
        this.dropSelf(ModBlocks.DRIPSTONE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.DRIPSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.DUMORTIERITE_BLOCK.get());
        this.dropSelf(ModBlocks.DUMORTIERITE_BRICKS.get());
        this.dropSelf(ModBlocks.DUMORTIERITE_CHISELED.get());
        this.dropSelf(ModBlocks.DUMORTIERITE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.DUMORTIERITE_POLISHED.get());
        this.dropSelf(ModBlocks.DUMORTIERITE_PILLAR.get());
        this.dropSelf(ModBlocks.ECLOGITE_BRICKS.get());
        this.dropSelf(ModBlocks.ECLOGITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.ECLOGITE_POLISHED.get());
        this.dropSelf(ModBlocks.ECLOGITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ENDSTONE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.ENDSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.EPIDOSITE.get());
        this.dropSelf(ModBlocks.ERBIUM_BLOCK.get());
        this.dropSelf(ModBlocks.EUROPIUM_BLOCK.get());
        this.dropSelf(ModBlocks.FELSITE.get());
        this.dropSelf(ModBlocks.FIRECLAY.get());
        this.dropSelf(ModBlocks.FLINT_BLOCK.get());
        this.dropSelf(ModBlocks.FLINT_CLAY.get());
        this.dropSelf(ModBlocks.FOIDOLITE.get());
        this.dropSelf(ModBlocks.FORDITE.get());
        this.dropSelf(ModBlocks.FROZEN_OIL.get());
        this.dropSelf(ModBlocks.FULGURITE.get());
        this.dropSelf(ModBlocks.FULGURITE_CLUSTER.get());
        this.dropSelf(ModBlocks.GABBRO.get());
        this.dropSelf(ModBlocks.GABBRO_BRICKS.get());
        this.dropSelf(ModBlocks.GABBRO_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GABBRO_ESSEXITE.get());
        this.dropSelf(ModBlocks.GABBRO_NORITE.get());
        this.dropSelf(ModBlocks.GABBRO_THERALITE.get());
        this.dropSelf(ModBlocks.GABBRO_POLISHED.get());
        this.dropSelf(ModBlocks.GADOLINIUM_BLOCK.get());
        this.dropSelf(ModBlocks.GALLIUM_BLOCK.get());
        this.dropSelf(ModBlocks.GANISTER_CLAY.get());
        this.dropSelf(ModBlocks.GERMANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.GEYSERITE_PEARLESCENT.get());
        this.dropSelf(ModBlocks.GEYSERITE_OPALINE.get());
        this.dropSelf(ModBlocks.GEYSERITE_PRISMATIC.get());
        this.dropSelf(ModBlocks.GLOWSTONE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.GLOWSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.GLOWSTONE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.GNEISS_BRICKS.get());
        this.dropSelf(ModBlocks.GNEISS_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GNEISS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GNEISS_POLISHED.get());
        this.dropSelf(ModBlocks.GNEISS_LITCHFIELDITE.get());
        this.dropSelf(ModBlocks.GOSSAN_MALACHITE.get());
        this.dropSelf(ModBlocks.GOSSAN_HEMATITE.get());
        this.dropSelf(ModBlocks.GOSSAN_AZURITE.get());
        this.dropSelf(ModBlocks.GRANITE_APPINITE.get());
        this.dropSelf(ModBlocks.GRANITE_APPINITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_BLUE.get());
        this.dropSelf(ModBlocks.GRANITE_BLUE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_BLACK.get());
        this.dropSelf(ModBlocks.GRANITE_BLACK_BRICKS.get());
        this.dropSelf(ModBlocks.GRANITE_BLACK_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GRANITE_BLACK_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_BRICKS.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_MANGERITE.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_MANGERITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_ENDERBITE.get());
        this.dropSelf(ModBlocks.GRANITE_CHARNOCKITE_ENDERBITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_GOLD.get());
        this.dropSelf(ModBlocks.GRANITE_GOLD_BRICKS.get());
        this.dropSelf(ModBlocks.GRANITE_GOLD_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GRANITE_GOLD_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_LUXULLIANITE.get());
        this.dropSelf(ModBlocks.GRANITE_LUXULLIANITE_POLISHED.get());
        this.dropSelf(ModBlocks.GREISENS_PEGMATITE.get());
        this.dropSelf(ModBlocks.GRANITE_PEGMATITE_BERYL.get());
        this.dropSelf(ModBlocks.GRANITE_PORPHYRY.get());
        this.dropSelf(ModBlocks.GRANITE_PORPHYRY_BRICKS.get());
        this.dropSelf(ModBlocks.GRANITE_PORPHYRY_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GRANITE_PORPHYRY_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_RAPAKIVI.get());
        this.dropSelf(ModBlocks.GRANITE_RAPAKIVI.get());
        this.dropSelf(ModBlocks.GRANITE_RED_PEGMATITE.get());
        this.dropSelf(ModBlocks.GRANITE_UNAKITE.get());
        this.dropSelf(ModBlocks.GRANITE_UNAKITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANITE_WHITE.get());
        this.dropSelf(ModBlocks.GRANITE_WHITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GRANITE_WHITE_BRICKS.get());
        this.dropSelf(ModBlocks.GRANITE_WHITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANODIORITE.get());
        this.dropSelf(ModBlocks.GRANODIORITE_POLISHED.get());
        this.dropSelf(ModBlocks.GRANULITE.get());
        this.dropSelf(ModBlocks.GRAVEL_COARSE.get());
        this.dropSelf(ModBlocks.GRAVEL_DENSE.get());
        this.dropSelf(ModBlocks.GRAVEL_DIRTY.get());
        this.dropSelf(ModBlocks.GRAVEL_FROSTY.get());
        this.dropSelf(ModBlocks.GRAVEL_LOAMY.get());
        this.dropSelf(ModBlocks.GRAVEL_ROCKY.get());
        this.dropSelf(ModBlocks.GRAVEL_SILTY.get());
        this.dropSelf(ModBlocks.GREENSTONE.get());
        this.dropSelf(ModBlocks.GREISENS_CONTACT.get());
        this.dropSelf(ModBlocks.GREISENS_PEGMATITE.get());
        this.dropSelf(ModBlocks.GRITSTONE.get());
        this.dropSelf(ModBlocks.GYPSUM.get());
        this.dropSelf(ModBlocks.GYPSUM_BRICKS.get());
        this.dropSelf(ModBlocks.GYPSUM_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.GYPSUM_POLISHED.get());
        this.dropSelf(ModBlocks.HAFNIUM_BLOCK.get());
        this.dropSelf(ModBlocks.HALITE.get());
        this.dropSelf(ModBlocks.HALITE_BRICKS.get());
        this.dropSelf(ModBlocks.HALITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.HALITE_POLISHED.get());
        this.dropSelf(ModBlocks.HALITE_HIMALAYAN_SALT.get());
        this.dropSelf(ModBlocks.HEMATITE_BLOCK.get());
        this.dropSelf(ModBlocks.HOLMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.HORNBLENDE.get());
        this.dropSelf(ModBlocks.HORNBLENDE_BRICKS.get());
        this.dropSelf(ModBlocks.HORNBLENDE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.HORNBLENDE_POLISHED.get());
        this.dropSelf(ModBlocks.HORNFELS.get());
        this.dropSelf(ModBlocks.HYALOCLASITE.get());
        this.dropSelf(ModBlocks.HYALOCLASITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.HYALOCLASITE_BRICKS.get());
        this.dropSelf(ModBlocks.HYPERSTHENE.get());
        this.dropSelf(ModBlocks.HYALOCLASITE_POLISHED.get());
        this.dropSelf(ModBlocks.HYDRACEUM.get());
        this.dropSelf(ModBlocks.IDDINGSITE.get());
        this.dropSelf(ModBlocks.INDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.IODINE_BLOCK.get());
        this.dropSelf(ModBlocks.IRIDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.IRONSTONE.get());
        this.dropSelf(ModBlocks.IVORY.get());
        this.dropSelf(ModBlocks.IVORY_BONE_BLOCK.get());
        this.dropSelf(ModBlocks.IVORY_CRACKED.get());
        this.dropSelf(ModBlocks.IVORY_WEATHERED_BONE_BLOCK.get());
        this.dropSelf(ModBlocks.IVORY_TILES.get());
        this.dropSelf(ModBlocks.IVORY_WEATHERED.get());
        this.dropSelf(ModBlocks.IVORY_WEATHERED_TILES.get());
        this.dropSelf(ModBlocks.IVORY_WEATHERED_CRACKED.get());
        this.dropSelf(ModBlocks.JASPEROID_CITRINE.get());
        this.dropSelf(ModBlocks.JASPEROID_AMETHYST.get());
        this.dropSelf(ModBlocks.KIMBERLITE.get());
        this.dropSelf(ModBlocks.KIMBERLITE_DIAMOND_BEARING.get());
        this.dropSelf(ModBlocks.KOMATIITE.get());
        this.dropSelf(ModBlocks.KOMATIITE_BRICKS.get());
        this.dropSelf(ModBlocks.KOMATIITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.KOMATIITE_POLISHED.get());
        this.dropSelf(ModBlocks.LACUSTRINE.get());
        this.dropSelf(ModBlocks.LAMPROPHYRE.get());
        this.dropSelf(ModBlocks.LAMPROPHYRE_MINETTE.get());
        this.dropSelf(ModBlocks.LAMPROPHYRE_VOGESITE.get());
        this.dropSelf(ModBlocks.LANTHANUM_BLOCK.get());
        this.dropSelf(ModBlocks.LAPILLI_GRAVEL.get());
        this.dropSelf(ModBlocks.LAPILLI_GRAVEL_ACCRETIONARY.get());
        this.dropSelf(ModBlocks.LATERITE.get());
        this.dropSelf(ModBlocks.LAVINITE.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_LINED_CASE.get());
        this.dropSelf(ModBlocks.LHERZOLITE.get());
        this.dropSelf(ModBlocks.LIGNITE.get());
        this.dropSelf(ModBlocks.LIGNITE_JET.get());
        this.dropSelf(ModBlocks.LIGNITE_RESINITE.get());
        this.dropSelf(ModBlocks.LIMESTONE_BLACK_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BLACK_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_BLACK_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_BLACK_POLISHED.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_POLISHED.get());
        this.dropSelf(ModBlocks.LIMESTONE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_COBBLESTONE_WEATHERED.get());
        this.dropSelf(ModBlocks.LIMESTONE_COQUINA_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_COQUINA_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_COQUINA_POLISHED.get());
        this.dropSelf(ModBlocks.LIMESTONE_FOSSILIFEROUS_POLISHED.get());
        this.dropSelf(ModBlocks.LIMESTONE_KARST_POLISHED.get());
        this.dropSelf(ModBlocks.LIMESTONE_MOONMILK.get());
        this.dropSelf(ModBlocks.LIMESTONE_OOLITIC.get());
        this.dropSelf(ModBlocks.LITHIUM_BLOCK.get());
        this.dropSelf(ModBlocks.LOAM.get());
        this.dropSelf(ModBlocks.LOAM_COARSE.get());
        this.dropSelf(ModBlocks.LOAM_DENSE.get());
        this.dropSelf(ModBlocks.LOAM_DIRTY.get());
        this.dropSelf(ModBlocks.LOAM_ROCKY.get());
        this.dropSelf(ModBlocks.LOAM_ROOTED.get());
        this.dropSelf(ModBlocks.LOAM_SAPROLITE.get());
        this.dropSelf(ModBlocks.LOESS.get());
        this.dropSelf(ModBlocks.LUTETIUM_BLOCK.get());
        this.dropSelf(ModBlocks.MAGNESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.MAGMA_BLOCK_PAHOEHOE.get());
        this.dropSelf(ModBlocks.MANGANESE_BLOCK.get());
        this.dropSelf(ModBlocks.MARBLE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MARBLE_BLACK_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.MARBLE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.MARBLE_POLISHED.get());
        this.dropSelf(ModBlocks.MARBLE_CARRARA.get());
        this.dropSelf(ModBlocks.MARBLE_DOLOMITE.get());
        this.dropSelf(ModBlocks.MARBLE_GRAND_ANTIQUE.get());
        this.dropSelf(ModBlocks.MARBLE_RUIN.get());
        this.dropSelf(ModBlocks.MARBLE_SKARN.get());
        this.dropSelf(ModBlocks.MERCURY_BLOCK.get());
        this.dropSelf(ModBlocks.METAPELITE.get());
        this.dropSelf(ModBlocks.METACONGLOMERATE.get());
        this.dropSelf(ModBlocks.METACONGLOMERATE_POLYMICT.get());
        this.dropSelf(ModBlocks.METACONGLOMERATE_BRICKS.get());
        this.dropSelf(ModBlocks.METACONGLOMERATE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.METACONGLOMERATE_GRAVEL.get());
        this.dropSelf(ModBlocks.METACONGLOMERATE_POLISHED.get());
        this.dropSelf(ModBlocks.METEORITE_ACHONDRITE.get());
        this.dropSelf(ModBlocks.METEORITE_CHONDRITE.get());
        this.dropSelf(ModBlocks.METEORITE_FOSSIL.get());
        this.dropSelf(ModBlocks.METEORITE_MESOSIDERITE.get());
        this.dropSelf(ModBlocks.METEORITE_PALLASITE.get());
        this.dropSelf(ModBlocks.METEORITE_RUSTY_IRON.get());
        this.dropSelf(ModBlocks.MICA_BIOTITE.get());
        this.dropSelf(ModBlocks.MICROCLINE.get());
        this.dropSelf(ModBlocks.MIXED_CLAY.get());
        this.dropSelf(ModBlocks.MIXED_CLAY_DENSE.get());
        this.dropSelf(ModBlocks.MOLYBDENUM_BLOCK.get());
        this.dropSelf(ModBlocks.MONZODIORITE.get());
        this.dropSelf(ModBlocks.MONZOGRANITE.get());
        this.dropSelf(ModBlocks.MONZOGRANITE_POLISHED.get());
        this.dropSelf(ModBlocks.MONZONITE.get());
        this.dropSelf(ModBlocks.MONZONITE_LARVIKITE.get());
        this.dropSelf(ModBlocks.MONZONITE_QUARTZ.get());
        this.dropSelf(ModBlocks.MORTAR_BLOCK.get());
        this.dropSelf(ModBlocks.MUCK.get());
        this.dropSelf(ModBlocks.MUDSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.MUDSTONE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.MUDSTONE_CLAYSTONE.get());
        this.dropSelf(ModBlocks.MUDSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.MUDSTONE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MUGEARITE.get());
        this.dropSelf(ModBlocks.MUGEARITE_BRICKS.get());
        this.dropSelf(ModBlocks.MUGEARITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.MUGEARITE_POLISHED.get());
        this.dropSelf(ModBlocks.MULLITE_BLOCK.get());
        this.dropSelf(ModBlocks.MULLITE_TILES.get());
        this.dropSelf(ModBlocks.MYLONITE.get());
        this.dropSelf(ModBlocks.MYLONITE_BRICKS.get());
        this.dropSelf(ModBlocks.MYLONITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.MYLONITE_POLISHED.get());
        this.dropSelf(ModBlocks.NEODYMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NEPHELINITE.get());
        this.dropSelf(ModBlocks.NEPTUNIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NETHERRACK_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.NETHERRACK_POLISHED.get());
        this.dropSelf(ModBlocks.NETHERRACK_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.NIOBIUM_BLOCK.get());
        this.dropSelf(ModBlocks.OBSIDIAN_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.OBSIDIAN_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.OBSIDIAN_POLISHED.get());
        this.dropSelf(ModBlocks.OCHRE_CLAY.get()); //temp
        this.dropSelf(ModBlocks.OCHRE_TERRACOTTA.get());
        this.dropSelf(ModBlocks.OCHRE_TERRACOTTA_GLAZED.get());
        this.dropSelf(ModBlocks.OILSANDS.get());
        this.dropSelf(ModBlocks.OLIGOCLASE.get());
        this.dropSelf(ModBlocks.OLIVINE.get());
        this.dropSelf(ModBlocks.OLIVINE_BRICKS.get());
        this.dropSelf(ModBlocks.OLIVINE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.OLIVINE_DUNITE.get());
        this.dropSelf(ModBlocks.OLIVINE_FORSTERITE.get());
        this.dropSelf(ModBlocks.OLIVINE_POLISHED.get());
        this.dropSelf(ModBlocks.OLIVINE_WEHRLITE.get());
        this.dropSelf(ModBlocks.ONYX.get());
        this.dropSelf(ModBlocks.ONYX_TILES.get());
        this.dropSelf(ModBlocks.OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.OPAL_BLOCK_COMMON.get());
        this.dropSelf(ModBlocks.OPAL_BLOCK_BOULDER.get());
        this.dropSelf(ModBlocks.ORTHOCLASE_FELDSPAR.get());
        this.dropSelf(ModBlocks.ORTHOCLASE_FELDSPAR_BRICKS.get());
        this.dropSelf(ModBlocks.ORTHOCLASE_FELDSPAR_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.ORTHOCLASE_FELDSPAR_POLISHED.get());
        this.dropSelf(ModBlocks.ORTHOPYROXENE.get());
        this.dropSelf(ModBlocks.ORTHOQUARTZITE.get());
        this.dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PALLADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PEARL_BLOCK.get());
        this.dropSelf(ModBlocks.PEAT.get());
        this.dropSelf(ModBlocks.PEAT_DENSE.get());
        this.dropSelf(ModBlocks.PELES_HAIR.get());
        this.dropSelf(ModBlocks.PERIDOTITE.get());
        this.dropSelf(ModBlocks.PERIDOTITE_BRICKS.get());
        this.dropSelf(ModBlocks.PERIDOTITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.PERIDOTITE_POLISHED.get());
        this.dropSelf(ModBlocks.PERMAFROST_COARSE.get());
        this.dropSelf(ModBlocks.PERMAFROST_DENSE.get());
        this.dropSelf(ModBlocks.PERMAFROST_DIRTY.get());
        this.dropSelf(ModBlocks.PERMAFROST_ROCKY.get());
        this.dropSelf(ModBlocks.PERMAFROST_SILTY.get());
        this.dropSelf(ModBlocks.PERMAFROST_SOIL.get());
        this.dropSelf(ModBlocks.PERMAFROST_SAPROLITE.get());
        this.dropSelf(ModBlocks.PETRIFIED_LOG.get());
        this.dropSelf(ModBlocks.PETRIFIED_LOG_STRIPPED.get());
        this.dropSelf(ModBlocks.PETRIFIED_LOG_OPALIZED.get());
        this.dropSelf(ModBlocks.PETRIFIED_LOG_STRIPPED_OPALIZED.get());
        this.dropSelf(ModBlocks.PETRIFIED_WOOD_PLANKS.get());
        this.dropSelf(ModBlocks.PHONOTEPRHITE.get());
        this.dropSelf(ModBlocks.PHOSGENITE.get());
        this.dropSelf(ModBlocks.PHOSPHORUS_BLOCK.get());
        this.dropSelf(ModBlocks.PHYLLITE_BRICKS.get());
        this.dropSelf(ModBlocks.PHYLLITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.PHYLLITE_POLISHED.get());
        this.dropSelf(ModBlocks.PHYLLITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PHYLLITE_DUKE_STONE.get());
        this.dropSelf(ModBlocks.PLAGIOCLASE_FELDSPAR.get());
        this.dropSelf(ModBlocks.PLAGIOCLASE_FELDSPAR_BRICKS.get());
        this.dropSelf(ModBlocks.PLAGIOCLASE_FELDSPAR_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.PLAGIOCLASE_FELDSPAR_POLISHED.get());
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.PLUTONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PORCELAIN_BLUE_TILES.get());
        this.dropSelf(ModBlocks.PORCELAIN_CRACKED.get());
        this.dropSelf(ModBlocks.PORCELAIN_DRAGON.get());
        this.dropSelf(ModBlocks.PORCELAIN_FISH.get());
        this.dropSelf(ModBlocks.PORCELAIN_FLOWER.get());
        this.dropSelf(ModBlocks.PORCELAIN_KINTSUGI.get());
        this.dropSelf(ModBlocks.PORCELAIN_KINTSUGI_TILES.get());
        this.dropSelf(ModBlocks.PORCELAIN_MIXED_TILES.get());
        this.dropSelf(ModBlocks.PORCELAIN_PILLAR.get());
        this.dropSelf(ModBlocks.PORCELAIN_RED_TILES.get());
        this.dropSelf(ModBlocks.POTASSIUM_BLOCK.get());
        this.dropSelf(ModBlocks.POZZOLANA.get());
        this.dropSelf(ModBlocks.PRASEODYMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PRASIOLITE_BRICKS.get());
        this.dropSelf(ModBlocks.PRASIOLITE_BLOCK.get());
        this.dropSelf(ModBlocks.PRASIOLITE_CHISELED.get());
        this.dropSelf(ModBlocks.PRASIOLITE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.PRASIOLITE_PILLAR.get());
        this.dropSelf(ModBlocks.PRASIOLITE_POLISHED.get());
        this.dropSelf(ModBlocks.PREHNITE.get());
        this.dropSelf(ModBlocks.PRISMARINE_POLISHED.get());
        this.dropSelf(ModBlocks.PRISMARINE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.PROTACTINIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PSEUDOTACHYLITE.get());
        this.dropSelf(ModBlocks.PUMICE.get());
        this.dropSelf(ModBlocks.PUMICE_BRICKS.get());
        this.dropSelf(ModBlocks.PUMICE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.PUMICE_POLISHED.get());
        this.dropSelf(ModBlocks.PUMPELLYITE.get());
        this.dropSelf(ModBlocks.PORCELAIN_CRACKED.get());
        this.dropSelf(ModBlocks.PURPURITE.get());
        this.dropSelf(ModBlocks.PURPURITE_POLISHED.get());
        this.dropSelf(ModBlocks.PURPURITE_SMALL_TILES.get());
        this.dropSelf(ModBlocks.PYROBITUMEN.get());
        this.dropSelf(ModBlocks.PYROXENE.get());
        this.dropSelf(ModBlocks.PYROXENE_BRICKS.get());
        this.dropSelf(ModBlocks.PYROXENE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.PYROXENE_POLISHED.get());
        this.dropSelf(ModBlocks.PYROXENE_HARZBURGITE.get());
        this.dropSelf(ModBlocks.PYROXENE_WEBSTERITE.get());
        this.dropSelf(ModBlocks.PYROXENITE.get());
        this.dropSelf(ModBlocks.QUARTZ_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.QUARTZITE_BRICKS.get());
        this.dropSelf(ModBlocks.QUARTZITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.QUARTZITE_POLISHED.get());
        this.dropSelf(ModBlocks.QUARTZITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.QUARTZOLITE.get());
        this.dropSelf(ModBlocks.RED_CLAY.get()); //temp
        this.dropSelf(ModBlocks.RED_CLAY_COARSE.get());
        this.dropSelf(ModBlocks.RED_CLAY_DENSE.get());
        this.dropSelf(ModBlocks.RED_CLAY_GRAVELLY.get());
        this.dropSelf(ModBlocks.RED_CLAY_LOAMY.get());
        this.dropSelf(ModBlocks.RED_CLAY_ROCKY.get());
        this.dropSelf(ModBlocks.RED_CLAY_ROOTED.get());
        this.dropSelf(ModBlocks.RED_CLAY_SANDY.get());
        this.dropSelf(ModBlocks.RED_CLAY_SAPROLITE.get());
        this.dropSelf(ModBlocks.RED_CLAY_SILTY.get());
        this.dropSelf(ModBlocks.RED_CLAY_TERRACOTTA.get());
        this.dropSelf(ModBlocks.RED_CLAY_TERRACOTTA_GLAZED.get());
        this.dropSelf(ModBlocks.RED_GRANITE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.RED_GRANITE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.RHENIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RHODIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RHODOCHROSITE_BANDED.get()); //temp?
        this.dropSelf(ModBlocks.RHYOLITE.get());
        this.dropSelf(ModBlocks.RHYOLITE_BRICKS.get());
        this.dropSelf(ModBlocks.RHYOLITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.RHYOLITE_POLISHED.get());
        this.dropSelf(ModBlocks.RHYOLITE_COMENDITE.get());
        this.dropSelf(ModBlocks.RHYOLITE_PANTELLERITE.get());
        this.dropSelf(ModBlocks.RHYOLITE_LLANITE.get());
        this.dropSelf(ModBlocks.ROMAN_CONCRETE.get());
        this.dropSelf(ModBlocks.ROSE_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.ROSE_BRICKS.get());
        this.dropSelf(ModBlocks.ROSE_CHISELED.get());
        this.dropSelf(ModBlocks.ROSE_BLOCK.get());
        this.dropSelf(ModBlocks.ROSE_PILLAR.get());
        this.dropSelf(ModBlocks.ROSE_POLISHED.get());
        this.dropSelf(ModBlocks.RUBIDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RUTHENIUM_BLOCk.get());
        this.dropSelf(ModBlocks.SALT_BLOCK.get());
        this.dropSelf(ModBlocks.SALT_FLAT.get());
        this.dropSelf(ModBlocks.SAMARIUM_BLOCK.get());
        this.dropSelf(ModBlocks.SAND_BASALT.get());
        this.dropSelf(ModBlocks.SANDSTONE_CASSITERITE.get());
        this.dropSelf(ModBlocks.SAND_COARSE.get());
        this.dropSelf(ModBlocks.SAND_DENSE.get());
        this.dropSelf(ModBlocks.SAND_DIRTY.get());
        this.dropSelf(ModBlocks.SAND_GLAUCONITE.get());
        this.dropSelf(ModBlocks.SAND_GRANITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_GRANITE.get());
        this.dropSelf(ModBlocks.SAND_GRAVELLY.get());
        this.dropSelf(ModBlocks.SAND_K_FELDSPAR.get());
        this.dropSelf(ModBlocks.SAND_LACUSTRINE.get());
        this.dropSelf(ModBlocks.SAND_MIXED.get());
        this.dropSelf(ModBlocks.SAND_PLAGIOCLASE_FELDSPAR.get());
        this.dropSelf(ModBlocks.SAND_RED_COARSE.get());
        this.dropSelf(ModBlocks.SAND_RED_DIRTY.get());
        this.dropSelf(ModBlocks.SAND_RED_DENSE.get());
        this.dropSelf(ModBlocks.SAND_RED_SILTY.get());
        this.dropSelf(ModBlocks.SAND_ROCKY.get());
        this.dropSelf(ModBlocks.SAND_SILTY.get());
        this.dropSelf(ModBlocks.SAND_SODALITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_ARKOSE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SANDSTONE_ARKOSE_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_ARKOSE_POLISHED.get());
        this.dropSelf(ModBlocks.SANDSTONE_ARKOSE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SANDSTONE_BASALT.get());
        this.dropSelf(ModBlocks.SANDSTONE_BASALT_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_BASALT_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_CASSITERITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_CASSITERITE_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_CASSITERITE_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE_POLISHEd.get());
        this.dropSelf(ModBlocks.SANDSTONE_GLAUCONITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_GLAUCONITE_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_GLAUCONITE_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_GRANITE_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_GRANITE_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_GREYWACKE_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_GREYWACKE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SANDSTONE_GREYWACKE_POLISHED.get());
        this.dropSelf(ModBlocks.SANDSTONE_GREYWACKE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SANDSTONE_ITACOLUMNITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_K_FELDSPAR.get());
        this.dropSelf(ModBlocks.SANDSTONE_K_FELDSPAR_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_K_FELDSPAR_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_PLAGIOCLASE_FELDSPAR.get());
        this.dropSelf(ModBlocks.SANDSTONE_PLAGIOCLASE_FELDSPAR_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_PLAGIOCLASE_FELDSPAR_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_QUARTZ_ARENITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SANDSTONE_QUARTZ_ARENITE_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_QUARTZ_ARENITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SANDSTONE_QUARTZ_ARENITE_POLISHED.get());
        this.dropSelf(ModBlocks.SANDSTONE_RED_LARGE_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_RED_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.SANDSTONE_SODALITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_SODALITE_SMOOTH.get());
        this.dropSelf(ModBlocks.SANDSTONE_SODALITE_CUT.get());
        this.dropSelf(ModBlocks.SANDSTONE_TURBIDITE.get());
        this.dropSelf(ModBlocks.SANDSTONE_GANISTER.get());
        this.dropSelf(ModBlocks.SANDSTONE_GANISTER_ROOT_TRACED.get());
        this.dropSelf(ModBlocks.SANIDINE.get());
        this.dropSelf(ModBlocks.SARDONYX.get());
        this.dropSelf(ModBlocks.SCANDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.SCHIST_BLUE_BRICKS.get());
        this.dropSelf(ModBlocks.SCHIST_BLUE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SCHIST_BLUE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SCHIST_BLUE_POLISHED.get());
        this.dropSelf(ModBlocks.SCHIST_GREEN_BRICKS.get());
        this.dropSelf(ModBlocks.SCHIST_GREEN_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SCHIST_GREEN_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SCHIST_GREEN_POLISHED.get());
        this.dropSelf(ModBlocks.SCHIST_WHITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SCHIST_MICA.get());
        this.dropSelf(ModBlocks.SCORIA.get());
        this.dropSelf(ModBlocks.SCORIA_BLACK.get());
        this.dropSelf(ModBlocks.SCORIA_BRICKS.get());
        this.dropSelf(ModBlocks.SCORIA_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SCORIA_POLISHED.get());
        this.dropSelf(ModBlocks.SCREE.get());
        this.dropSelf(ModBlocks.SELENIUM_BLOCK.get());
        this.dropSelf(ModBlocks.SELENITE_CRYSTAL.get());
        this.dropSelf(ModBlocks.SERPENTINE.get());
        this.dropSelf(ModBlocks.SERPENTINE_BRICKS.get());
        this.dropSelf(ModBlocks.SERPENTINE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SERPENTINE_POLISHED.get());
        this.dropSelf(ModBlocks.SERPENTINE_RODINGITE.get());
        this.dropSelf(ModBlocks.SERPENTINE_JADEITITE.get());
        this.dropSelf(ModBlocks.SERPENTINITE.get());
        this.dropSelf(ModBlocks.SHALE_BLACK.get());
        this.dropSelf(ModBlocks.SHALE_BRICKS.get());
        this.dropSelf(ModBlocks.SHALE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SHALE_POLISHED.get());
        this.dropSelf(ModBlocks.SHALE_CANNEL_COAL.get());
        this.dropSelf(ModBlocks.SHALE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SHALE_HAKATAI_BRICKS.get());
        this.dropSelf(ModBlocks.SHALE_HAKATAI_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SHALE_HAKATAI_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SHALE_HAKATAI_POLISHED.get());
        this.dropSelf(ModBlocks.SHALE_KUKERSITE.get());
        this.dropSelf(ModBlocks.SHALE_LAMINA.get());
        this.dropSelf(ModBlocks.SHALE_OIL.get());
        this.dropSelf(ModBlocks.SHALE_POLISHED.get());
        this.dropSelf(ModBlocks.SHALE_RADON.get());
        this.dropSelf(ModBlocks.SHALE_TASMANITE.get());
        this.dropSelf(ModBlocks.SHOSHONITE.get());
        this.dropSelf(ModBlocks.SHOSHONITE_BRICKS.get());
        this.dropSelf(ModBlocks.SHOSHONITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SHOSHONITE_POLISHED.get());
        this.dropSelf(ModBlocks.SIDERITE_BLOCK.get());
        this.dropSelf(ModBlocks.SIDEROPHYLLITE.get());
        this.dropSelf(ModBlocks.SILICON_BLOCK.get());
        this.dropSelf(ModBlocks.SILT.get());
        this.dropSelf(ModBlocks.SILT_COARSE.get());
        this.dropSelf(ModBlocks.SILT_DENSE.get());
        this.dropSelf(ModBlocks.SILT_DIRTY.get());
        this.dropSelf(ModBlocks.SILT_LOAMY.get());
        this.dropSelf(ModBlocks.SILT_ROCKY.get());
        this.dropSelf(ModBlocks.SILT_ROOTED.get());
        this.dropSelf(ModBlocks.SILTSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.SILTSTONE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SILTSTONE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SILTSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SLATE_BLUE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SMOKY_BLOCK.get());
        this.dropSelf(ModBlocks.SMOKY_BRICKS.get());
        this.dropSelf(ModBlocks.SMOKY_CHISELED.get());
        this.dropSelf(ModBlocks.SMOKY_PILLAR.get());
        this.dropSelf(ModBlocks.SMOKY_POLISHED.get());
        this.dropSelf(ModBlocks.SOAPSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.SOAPSTONE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SOAPSTONE_POLISHED.get());
        this.dropSelf(ModBlocks.SOAPSTONE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SOAPSTONE_JADE.get());
        this.dropSelf(ModBlocks.SODIUM_BLOCK.get());
        this.dropSelf(ModBlocks.STONE_DENSE.get());
        this.dropSelf(ModBlocks.STONE_POLISHED.get());
        this.dropSelf(ModBlocks.STROMATOLITE.get());
        this.dropSelf(ModBlocks.STRONTIUM_BLOCK.get());
        this.dropSelf(ModBlocks.SUGAR_BLOCK.get());
        this.dropSelf(ModBlocks.SULFUR_BLOCK.get());
        this.dropSelf(ModBlocks.SUNSTONE.get());
        this.dropSelf(ModBlocks.SUNSTONE_RAINBOW_LATTICE.get());
        this.dropSelf(ModBlocks.SYENITE.get());
        this.dropSelf(ModBlocks.SYENITE_BRICKS.get());
        this.dropSelf(ModBlocks.SYENITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.SYENITE_PECTOLITE.get());
        this.dropSelf(ModBlocks.SYENITE_POLISHED.get());
        this.dropSelf(ModBlocks.SYENITE_FOYAITE.get());
        this.dropSelf(ModBlocks.SYENITE_LARIMAR.get());
        this.dropSelf(ModBlocks.SYENITE_MIASKITE.get());
        this.dropSelf(ModBlocks.SYENITE_NEPHELINE.get());
        this.dropSelf(ModBlocks.SYENITE_SHONKINITE.get());
        this.dropSelf(ModBlocks.SYLVITE_BLOCK.get());
        this.dropSelf(ModBlocks.SYLVINITE.get());
        this.dropSelf(ModBlocks.TACHYLITE.get());
        this.dropSelf(ModBlocks.TACONITE.get());
        this.dropSelf(ModBlocks.TALUS.get());
        this.dropSelf(ModBlocks.TANTALUM_BLOCK.get());
        this.dropSelf(ModBlocks.TEKTITE.get());
        this.dropSelf(ModBlocks.TEKTITE_COESITE.get());
        this.dropSelf(ModBlocks.TEKTITE_DARWIN_GLASS.get());
        this.dropSelf(ModBlocks.TEKTITE_IMPACT_BRECCIA.get());
        this.dropSelf(ModBlocks.TEKTITE_LECHATELIERITE.get());
        this.dropSelf(ModBlocks.TEKTITE_MOLDAVITE.get());
        this.dropSelf(ModBlocks.TEKTITE_REIDITE.get());
        this.dropSelf(ModBlocks.TELLURIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TEPHRIPHONOLITE.get());
        this.dropSelf(ModBlocks.TEPHRITE.get());
        this.dropSelf(ModBlocks.TERBIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TESCHENITE.get());
        this.dropSelf(ModBlocks.THALLIUM_BLOCK.get());
        this.dropSelf(ModBlocks.THOLEIITE.get());
        this.dropSelf(ModBlocks.THOLEIITE_BRICKS.get());
        this.dropSelf(ModBlocks.THOLEIITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.THOLEIITE_POLISHED.get());
        this.dropSelf(ModBlocks.THORIUM_BLOCK.get());
        this.dropSelf(ModBlocks.THULIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TONALITE.get());
        this.dropSelf(ModBlocks.TONALITE_BRICKS.get());
        this.dropSelf(ModBlocks.TONALITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.TONALITE_POLISHED.get());
        this.dropSelf(ModBlocks.TONALITE_WEATHERED.get());
        this.dropSelf(ModBlocks.TORCH_ALUMINUM.get());
        this.dropSelf(ModBlocks.TORCH_BARIUM.get());
        this.dropSelf(ModBlocks.TORCH_CALCIUM.get());
        this.dropSelf(ModBlocks.TORCH_COPPER.get());
        this.dropSelf(ModBlocks.TORCH_IRON.get());
        this.dropSelf(ModBlocks.TORCH_LITHIUM.get());
        this.dropSelf(ModBlocks.TORCH_MAGNESIUM.get());
        this.dropSelf(ModBlocks.TORCH_NITRE.get());
        this.dropSelf(ModBlocks.TORCH_SALT_NACL.get());
        this.dropSelf(ModBlocks.TORCH_STRONTIUM.get());
        this.dropSelf(ModBlocks.TORCH_SYLVITE.get());
        this.dropSelf(ModBlocks.TORCH_ZINC.get());
        this.dropSelf(ModBlocks.TOURMALINE_SCHORL.get());
        this.dropSelf(ModBlocks.TOURMALINE_ELBAITE.get());
        this.dropSelf(ModBlocks.TOURMALINE_DRAVITE.get());
        this.dropSelf(ModBlocks.TRACHYANDESITE.get());
        this.dropSelf(ModBlocks.TRACHYANDESITE_BENMOREITE.get());
        this.dropSelf(ModBlocks.TRACHYBASALT.get());
        this.dropSelf(ModBlocks.TRACHYITE.get());
        this.dropSelf(ModBlocks.TRACHYITE_BRICKS.get());
        this.dropSelf(ModBlocks.TRACHYITE_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.TRACHYITE_KENYTE.get());
        this.dropSelf(ModBlocks.TRACHYITE_PHONOLITE.get());
        this.dropSelf(ModBlocks.TRAVERTINE_LIME.get());
        this.dropSelf(ModBlocks.TRAVERTINE_LIME_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.TRAVERTINE_LIME_BRICKS.get());
        this.dropSelf(ModBlocks.TRAVERTINE_LIME_POLISHED.get());
        this.dropSelf(ModBlocks.TRAVERTINE_PEACH.get());
        this.dropSelf(ModBlocks.TRAVERTINE_PEACH_BRICKS.get());
        this.dropSelf(ModBlocks.TRAVERTINE_PEACH_BRICKS_SMALL.get());
        this.dropSelf(ModBlocks.TRAVERTINE_PEACH_POLISHED.get());
        this.dropSelf(ModBlocks.TUFA.get());
        this.dropSelf(ModBlocks.TRINITITE.get());
        this.dropSelf(ModBlocks.TUFF_IGNIMBRITE.get());
        this.dropSelf(ModBlocks.TUFF_IGNIMBRITE_LAPILLI.get());
        this.dropSelf(ModBlocks.TUFF_LAPILLI.get());
        this.dropSelf(ModBlocks.TUFF_LAPILLI_ACCRETIONARY.get());
        this.dropSelf(ModBlocks.TUFF_PALAGONITE.get());
        this.dropSelf(ModBlocks.TUFF_SMALL_BRICKS.get());
        this.dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        this.dropSelf(ModBlocks.UMBER.get());
        this.dropSelf(ModBlocks.URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.VANADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.VARIOLITE.get());
        this.dropSelf(ModBlocks.VARVE.get());
        this.dropSelf(ModBlocks.VOLCANIC_ASH.get());
        this.dropSelf(ModBlocks.VOLCANIC_ASH_DENSE.get());
        this.dropSelf(ModBlocks.VOLCANIC_ASH_DIRTY.get());
        this.dropSelf(ModBlocks.VOLCANIC_ASH_SILTY.get());
        this.dropSelf(ModBlocks.WHITE_SMOKER_LARGE.get());
        this.dropSelf(ModBlocks.WHITE_SMOKER_SMALL.get());
        this.dropSelf(ModBlocks.YTTERBIUM_BLOCK.get());
        this.dropSelf(ModBlocks.YTTRIUM_BLOCK.get());
        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.ZIRCON.get());
        this.dropSelf(ModBlocks.ZIRCONIUM_BLOCK.get());
// cobblestone/grass-like drops
        this.add(ModBlocks.SOAPSTONE.get(),
                block -> dropCobblestone(ModBlocks.SOAPSTONE.get(), ModBlocks.SOAPSTONE_COBBLESTONE.get()));
        this.add(ModBlocks.SOAPSTONE_WEATHERED.get(),
                block -> dropCobblestone(ModBlocks.SOAPSTONE_WEATHERED.get(), ModBlocks.SOAPSTONE_COBBLESTONE.get()));
        this.add(ModBlocks.STONE_OVERGROWN.get(),
                block -> dropCobblestone(ModBlocks.STONE_OVERGROWN.get(), Blocks.COBBLESTONE));
        this.add(ModBlocks.SLATE_BLUE.get(),
                block -> dropCobblestone(ModBlocks.SLATE_BLUE.get(), ModBlocks.SLATE_BLUE_COBBLESTONE.get()));
        this.add(ModBlocks.SILTSTONE.get(),
                block -> dropCobblestone(ModBlocks.SILTSTONE.get(), ModBlocks.SILTSTONE_COBBLESTONE.get()));
        this.add(ModBlocks.SILT_DIRTY_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.SILT_DIRTY_GRASSY.get(), ModBlocks.SILT_DIRTY.get()));
        this.add(ModBlocks.SILT_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.SILT_GRASSY.get(), ModBlocks.SILT.get()));
        this.add(ModBlocks.SHALE.get(),
                block -> dropCobblestone(ModBlocks.SHALE.get(), ModBlocks.SHALE_COBBLESTONE.get()));
        this.add(ModBlocks.SHALE_HAKATAI.get(),
                block -> dropCobblestone(ModBlocks.SHALE_HAKATAI.get(), ModBlocks.SHALE_HAKATAI_COBBLESTONE.get()));
        this.add(ModBlocks.SCHIST_WHITE.get(),
                block -> dropCobblestone(ModBlocks.SCHIST_WHITE.get(), ModBlocks.SCHIST_WHITE_COBBLESTONE.get()));
        this.add(ModBlocks.SCHIST_GREEN.get(),
                block -> dropCobblestone(ModBlocks.SCHIST_GREEN.get(), ModBlocks.SCHIST_GREEN_COBBLESTONE.get()));
        this.add(ModBlocks.SCHIST_BLUE.get(),
                block -> dropCobblestone(ModBlocks.SCHIST_BLUE.get(), ModBlocks.SCHIST_BLUE_COBBLESTONE.get()));
        this.add(ModBlocks.SANDSTONE_QUARTZ_ARENITE.get(),
                block -> dropCobblestone(ModBlocks.SANDSTONE_QUARTZ_ARENITE.get(), ModBlocks.SANDSTONE_QUARTZ_ARENITE_COBBLESTONE.get()));
        this.add(ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE.get(),
                block -> dropCobblestone(ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE.get(), ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE_COBBLESTONE.get()));
        this.add(ModBlocks.SANDSTONE_GREYWACKE.get(),
                block -> dropCobblestone(ModBlocks.SANDSTONE_GREYWACKE.get(), ModBlocks.SANDSTONE_GREYWACKE_COBBLESTONE.get()));
        this.add(ModBlocks.SANDSTONE_ARKOSE.get(),
                block -> dropCobblestone(ModBlocks.SANDSTONE_ARKOSE.get(), ModBlocks.SANDSTONE_ARKOSE_COBBLESTONE.get()));
        this.add(ModBlocks.SAND_RED_DIRTY_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.SAND_RED_DIRTY_GRASSY.get(), ModBlocks.SAND_RED_DIRTY.get()));
        this.add(ModBlocks.SAND_DIRTY_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.SAND_DIRTY_GRASSY.get(), ModBlocks.SAND_DIRTY.get()));
        this.add(ModBlocks.RED_CLAY_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.RED_CLAY_GRASSY.get(), ModBlocks.RED_CLAY.get()));
        this.add(ModBlocks.QUARTZITE_STIPERSTONE.get(),
                block -> dropCobblestone(ModBlocks.QUARTZITE_STIPERSTONE.get(), ModBlocks.QUARTZITE_COBBLESTONE.get()));
        this.add(ModBlocks.QUARTZITE_WEATHERED.get(),
                block -> dropCobblestone(ModBlocks.QUARTZITE_WEATHERED.get(), ModBlocks.QUARTZITE_COBBLESTONE.get()));
        this.add(ModBlocks.QUARTZITE.get(),
                block -> dropCobblestone(ModBlocks.QUARTZITE.get(), ModBlocks.QUARTZITE_COBBLESTONE.get()));
        this.add(ModBlocks.PORCELAIN.get(),
                block -> dropCobblestone(ModBlocks.PORCELAIN.get(), ModBlocks.PORCELAIN_CRACKED.get()));
        this.add(ModBlocks.PHYLLITE_SERICITE.get(),
                block -> dropCobblestone(ModBlocks.PHYLLITE_SERICITE.get(), ModBlocks.PHYLLITE_COBBLESTONE.get()));
        this.add(ModBlocks.PHYLLITE.get(),
                block -> dropCobblestone(ModBlocks.PHYLLITE.get(), ModBlocks.PHYLLITE_COBBLESTONE.get()));
        this.add(ModBlocks.PEAT_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.PEAT_GRASSY.get(), ModBlocks.PEAT.get()));
        this.add(ModBlocks.MUDSTONE.get(),
                block -> dropCobblestone(ModBlocks.MUDSTONE.get(), ModBlocks.MUDSTONE_COBBLESTONE.get()));
        this.add(ModBlocks.MUDSTONE_MARL.get(),
                block -> dropCobblestone(ModBlocks.MUDSTONE_MARL.get(), ModBlocks.MUDSTONE_COBBLESTONE.get()));
        this.add(ModBlocks.MARBLE_BLACK.get(),
                block -> dropCobblestone(ModBlocks.MARBLE_BLACK.get(), ModBlocks.MARBLE_BLACK_COBBLESTONE.get()));
        this.add(ModBlocks.MARBLE.get(),
                block -> dropCobblestone(ModBlocks.MARBLE.get(), ModBlocks.MARBLE_COBBLESTONE.get()));
        this.add(ModBlocks.MARBLE_WEATHERED_LIGHTLY.get(),
                block -> dropCobblestone(ModBlocks.MARBLE_WEATHERED_LIGHTLY.get(), ModBlocks.MARBLE_COBBLESTONE.get()));
        this.add(ModBlocks.MARBLE_WEATHERED_HEAVILY.get(),
                block -> dropCobblestone(ModBlocks.MARBLE_WEATHERED_HEAVILY.get(), ModBlocks.MARBLE_COBBLESTONE.get()));
        this.add(ModBlocks.GNEISS_PORPHYROCLASTIC.get(),
                block -> dropCobblestone(ModBlocks.GNEISS_PORPHYROCLASTIC.get(), ModBlocks.GNEISS_COBBLESTONE.get()));
        this.add(ModBlocks.GNEISS_FOLDED.get(),
                block -> dropCobblestone(ModBlocks.GNEISS_FOLDED.get(), ModBlocks.GNEISS_COBBLESTONE.get()));
        this.add(ModBlocks.GNEISS.get(),
                block -> dropCobblestone(ModBlocks.GNEISS.get(), ModBlocks.GNEISS_COBBLESTONE.get()));
        this.add(ModBlocks.ECLOGITE.get(),
                block -> dropCobblestone(ModBlocks.ECLOGITE.get(), ModBlocks.ECLOGITE_COBBLESTONE.get()));
        this.add(ModBlocks.DOLOMITE_DOLOSILTITE.get(),
                block -> dropCobblestone(ModBlocks.DOLOMITE_DOLOSILTITE.get(), ModBlocks.DOLOMITE_COBBLESTONE.get()));
        this.add(ModBlocks.DOLOMITE_DOLARENITE.get(),
                block -> dropCobblestone(ModBlocks.DOLOMITE_DOLARENITE.get(), ModBlocks.DOLOMITE_COBBLESTONE.get()));
        this.add(ModBlocks.DOLOMITE_DOLOLUTITE.get(),
                block -> dropCobblestone(ModBlocks.DOLOMITE_DOLOLUTITE.get(), ModBlocks.DOLOMITE_COBBLESTONE.get()));
        this.add(ModBlocks.DOLOMITE.get(),
                block -> dropCobblestone(ModBlocks.DOLOMITE.get(), ModBlocks.DOLOMITE_COBBLESTONE.get()));
        this.add(ModBlocks.DIRT_DENSE_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.DIRT_DENSE_GRASSY.get(), ModBlocks.DIRT_DENSE.get()));
        this.add(ModBlocks.DIRT_DENSE_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.DIRT_DENSE_GRASSY.get(), ModBlocks.DIRT_DENSE.get()));
        this.add(ModBlocks.DIAMICTITE.get(),
                block -> dropCobblestone(ModBlocks.DIAMICTITE.get(), ModBlocks.DIAMICTITE_COBBLESTONE.get()));
        this.add(ModBlocks.CLAY_GRASSY.get(),
                block -> dropCobblestone(ModBlocks.CLAY_GRASSY.get(), Blocks.CLAY));
        this.add(ModBlocks.CHERT_NOVACULITE.get(),
                block -> dropCobblestone(ModBlocks.CHERT_NOVACULITE.get(), ModBlocks.CHERT_NOVACULITE_COBBLESTONE.get()));
        this.add(ModBlocks.CHERT_CHALCEDONY.get(),
                block -> dropCobblestone(ModBlocks.CHERT_CHALCEDONY.get(), ModBlocks.CHERT_CHALCEDONY_COBBLESTONE.get()));
        this.add(ModBlocks.CHERT.get(),
                block -> dropCobblestone(ModBlocks.CHERT.get(), ModBlocks.CHERT_COBBLESTONE.get()));
        this.add(ModBlocks.CHALK.get(),
                block -> dropCobblestone(ModBlocks.CHALK.get(), ModBlocks.CHALK_COBBLESTONE.get()));
        this.add(ModBlocks.BLUEGRASS.get(),
                block -> dropCobblestone(ModBlocks.BLUEGRASS.get(), ModBlocks.CLAY_DIRTY.get()));
        this.add(ModBlocks.BAUXITE_KARST.get(),
                block -> dropCobblestone(ModBlocks.BAUXITE_KARST.get(), ModBlocks.BAUXITE_CALCAREOUS.get()));
        this.add(ModBlocks.ARGILLITE.get(),
                block -> dropCobblestone(ModBlocks.ARGILLITE.get(), ModBlocks.ARGILLITE_COBBLESTONE.get()));
        this.add(ModBlocks.ARGILLITE_MARINITE.get(),
                block -> dropCobblestone(ModBlocks.ARGILLITE_MARINITE.get(), ModBlocks.ARGILLITE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_AEOLIANITE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_AEOLIANITE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_FOSSILIFEROUS.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_FOSSILIFEROUS.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_KARST.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_KARST.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_OOLITIC.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_OOLITIC.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_CHERT_NODULES.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_CALCARENITE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_CALCARENITE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_CALCILUTITE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_CALCILUTITE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_CALCIRUDITE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_CALCIRUDITE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_CALCISILTITE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_CALCISILTITE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_CALCAREOUS_SHALE.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_CALCAREOUS_SHALE.get(), ModBlocks.LIMESTONE_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_WEATHERED.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_WEATHERED.get(), ModBlocks.LIMESTONE_COBBLESTONE_WEATHERED.get()));
        this.add(ModBlocks.LIMESTONE_FOSSILIFEROUS_WEATHERED.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_FOSSILIFEROUS_WEATHERED.get(), ModBlocks.LIMESTONE_COBBLESTONE_WEATHERED.get()));
        this.add(ModBlocks.LIMESTONE_KARST_WEATHERED.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_KARST_WEATHERED.get(), ModBlocks.LIMESTONE_COBBLESTONE_WEATHERED.get()));
        this.add(ModBlocks.LIMESTONE_BLACK.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_BLACK.get(), ModBlocks.LIMESTONE_BLACK_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_COQUINA.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_COQUINA.get(), ModBlocks.LIMESTONE_COQUINA_COBBLESTONE.get()));
        this.add(ModBlocks.LIMESTONE_COQUINA_DEFOSSILIZED.get(),
                block -> dropCobblestone(ModBlocks.LIMESTONE_COQUINA_DEFOSSILIZED.get(), ModBlocks.LIMESTONE_COQUINA_COBBLESTONE.get()));
//Shards
        this.add(ModBlocks.QUARTZ_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.QUARTZ_CLUSTER.get(), Items.QUARTZ));
        this.add(ModBlocks.CITRINE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.CITRINE_CLUSTER.get(), ModItems.CITRINE_SHARD.get()));
        this.add(ModBlocks.AMETRINE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.AMETRINE_CLUSTER.get(), ModItems.AMETRINE_SHARD.get()));
        this.add(ModBlocks.AVENTURINE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.AVENTURINE_CLUSTER.get(), ModItems.AVENTURINE_SHARD.get()));
        this.add(ModBlocks.BLOODSTONE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.BLOODSTONE_CLUSTER.get(), ModItems.BLOODSTONE_QUARTZ_SHARD.get()));
        this.add(ModBlocks.DUMORTIERITE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.DUMORTIERITE_CLUSTER.get(), ModItems.DUMORTIERITE_SHARD.get()));
        this.add(ModBlocks.PRASIOLITE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.PRASIOLITE_CLUSTER.get(), ModItems.PRASIOLITE_SHARD.get()));
        this.add(ModBlocks.ROSE_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.ROSE_CLUSTER.get(), ModItems.ROSE_QUARTZ_SHARD.get()));
        this.add(ModBlocks.SMOKY_CLUSTER.get(),
                block -> dropShardsFull(ModBlocks.SMOKY_CLUSTER.get(), ModItems.SMOKY_QUARTZ_SHARD.get()));
    }

    protected LootTable.Builder dropCobblestone(Block pBlock, Block item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))));


    }


    protected LootTable.Builder dropShardsFull(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}*/