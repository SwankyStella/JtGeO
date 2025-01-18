/*package net.junedev.junetech_geo.datagen.loot;

import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
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




    }

    protected LootTable.Builder dropCobblestone(Block pBlock, Block item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
} */