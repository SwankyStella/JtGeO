package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JunetechGeo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // TODO: Add appropiate blocks to tags below
        //this.tag(ModTags.Blocks.caso4).add();
        //this.tag(ModTags.Blocks.fe2o3).add();
        //this.tag(ModTags.Blocks.hornblende).add();
        //this.tag(ModTags.Blocks.kcl).add();
        //this.tag(ModTags.Blocks.kclnacl).add();
        //this.tag(ModTags.Blocks.kspar).add();
        //this.tag(ModTags.Blocks.nacl).add();
        //this.tag(ModTags.Blocks.olivine).add();
        //this.tag(ModTags.Blocks.pspar).add();
        //this.tag(ModTags.Blocks.sio2).add();

        this.tag(ModTags.Blocks.SEDIMENTARY)
                .add(ModBlocks.LIMESTONE.get(),
                        ModBlocks.LIMESTONE_BLACK.get(),
                        ModBlocks.LIMESTONE_FOSSILIFEROUS.get(),
                        ModBlocks.LIMESTONE_COQUINA.get(),
                        ModBlocks.CHALK.get(),
                        ModBlocks.CHERT.get(),
                        ModBlocks.MUDSTONE.get(),
                        ModBlocks.SILTSTONE.get(),
                        ModBlocks.SHALE.get(),
                        ModBlocks.SHALE_HAKATAI.get(),
                        Blocks.SANDSTONE,
                        Blocks.RED_SANDSTONE,
                        ModBlocks.BRECCIA.get());

        this.tag(ModTags.Blocks.METAMORPHIC)
                .add(Blocks.DEEPSLATE,
                        ModBlocks.SCHIST_BLUE.get(),
                        ModBlocks.SCHIST_GREEN.get(),
                        ModBlocks.ANTHRACITE.get(),
                        ModBlocks.GNEISS.get(),
                        ModBlocks.METACONGLOMERATE.get(),
                        ModBlocks.PHYLLITE.get(),
                        ModBlocks.QUARTZITE.get(),
                        ModBlocks.SOAPSTONE.get(),
                        ModBlocks.SERPENTINE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.IGNEOUS)
                .add(Blocks.ANDESITE,
                    Blocks.GRANITE,
                    Blocks.DIORITE,
                    Blocks.TUFF,
                    Blocks.BASALT,
                    Blocks.OBSIDIAN,
                    Blocks.SMOOTH_BASALT,
                    ModBlocks.RHYOLITE.get());

        this.tag(ModTags.Blocks.DONTDATAGEN)
                .add(ModBlocks.CAVE_POPCORN.get(),
                        ModBlocks.CALTHEMITE.get(),
                        ModBlocks.WHITE_SMOKER_LARGE.get(),
                        ModBlocks.WHITE_SMOKER_SMALL.get(),
                        ModBlocks.BLACK_SMOKER_LARGE.get(),
                        ModBlocks.BLACK_SMOKER_SMALL.get(),
                        ModBlocks.ANTHODITE_FLOWER.get(),
                        ModBlocks.FLOWSTONE_TIP.get(),
                        ModBlocks.FLOWSTONE_MIDDLE.get(),
                        ModBlocks.FLOWSTONE_TIP.get(),
                        ModBlocks.HELICTITE.get(),
                        ModBlocks.FULGURITE_CLUSTER.get(),
                        ModBlocks.QUARTZ_SMALL_BUD.get(),
                        ModBlocks.QUARTZ_MEDIUM_BUD.get(),
                        ModBlocks.QUARTZ_LARGE_BUD.get(),
                        ModBlocks.QUARTZ_CLUSTER.get(),
                        ModBlocks.CITRINE_SMALL_BUD.get(),
                        ModBlocks.CITRINE_MEDIUM_BUD.get(),
                        ModBlocks.CITRINE_LARGE_BUD.get(),
                        ModBlocks.CITRINE_CLUSTER.get(),
                        ModBlocks.AMETRINE_SMALL_BUD.get(),
                        ModBlocks.AMETRINE_MEDIUM_BUD.get(),
                        ModBlocks.AMETRINE_LARGE_BUD.get(),
                        ModBlocks.AVENTURINE_SMALL_BUD.get(),
                        ModBlocks.AVENTURINE_MEDIUM_BUD.get(),
                        ModBlocks.AVENTURINE_LARGE_BUD.get(),
                        ModBlocks.AVENTURINE_CLUSTER.get(),
                        ModBlocks.BLOODSTONE_SMALL_BUD.get(),
                        ModBlocks.BLOODSTONE_MEDIUM_BUD.get(),
                        ModBlocks.BLOODSTONE_LARGE_BUD.get(),
                        ModBlocks.BLOODSTONE_CLUSTER.get(),
                        ModBlocks.DUMORTIERITE_SMALL_BUD.get(),
                        ModBlocks.DUMORTIERITE_MEDIUM_BUD.get(),
                        ModBlocks.DUMORTIERITE_LARGE_BUD.get(),
                        ModBlocks.DUMORTIERITE_CLUSTER.get(),
                        ModBlocks.PRASIOLITE_SMALL_BUD.get(),
                        ModBlocks.PRASIOLITE_MEDIUM_BUD.get(),
                        ModBlocks.PRASIOLITE_LARGE_BUD.get(),
                        ModBlocks.PRASIOLITE_CLUSTER.get(),
                        ModBlocks.SMOKY_SMALL_BUD.get(),
                        ModBlocks.SMOKY_MEDIUM_BUD.get(),
                        ModBlocks.SMOKY_LARGE_BUD.get(),
                        ModBlocks.SMOKY_CLUSTER.get(),
                        ModBlocks.ROSE_SMALL_BUD.get(),
                        ModBlocks.ROSE_MEDIUM_BUD.get(),
                        ModBlocks.ROSE_LARGE_BUD.get(),
                        ModBlocks.ROSE_CLUSTER.get(),
                        ModBlocks.TORCH_ALUMINUM.get(),
                        ModBlocks.TORCH_BARIUM.get(),
                        ModBlocks.TORCH_CALCIUM.get(),
                        ModBlocks.TORCH_COPPER.get(),
                        ModBlocks.TORCH_IRON.get(),
                        ModBlocks.TORCH_LITHIUM.get(),
                        ModBlocks.TORCH_MAGNESIUM.get(),
                        ModBlocks.TORCH_NITRE.get(),
                        ModBlocks.TORCH_SALT_NACL.get(),
                        ModBlocks.TORCH_STRONTIUM.get(),
                        ModBlocks.TORCH_SYLVITE.get(),
                        ModBlocks.SELENITE_CRYSTAL.get(),
                        ModBlocks.ARAGONITE_CRYSTAL.get(),
                        ModBlocks.SALT_FLAT.get(),
                        ModBlocks.BASALT_LAYERED.get(),
                        ModBlocks.RHODOCHROSITE_BANDED.get(),
                        ModBlocks.TRINITITE.get(),
                        ModBlocks.TRAVERTINE_PEACH.get(),
                        ModBlocks.TRAVERTINE_LIME.get(),
                        ModBlocks.STROMATOLITE.get(),
                        ModBlocks.PETRIFIED_LOG.get(),
                        ModBlocks.PETRIFIED_LOG_STRIPPED.get(),
                        ModBlocks.PETRIFIED_LOG_OPALIZED.get(),
                        ModBlocks.PETRIFIED_LOG_STRIPPED_OPALIZED.get(),
                        ModBlocks.PERMAFROST_SOIL.get(),
                        ModBlocks.SANDSTONE_BASALT.get(),
                        ModBlocks.SANDSTONE_BASALT_CUT.get(),
                        ModBlocks.SANDSTONE_CASSITERITE.get(),
                        ModBlocks.SANDSTONE_CASSITERITE_CUT.get(),
                        ModBlocks.SANDSTONE_SODALITE.get(),
                        ModBlocks.SANDSTONE_SODALITE_CUT.get(),
                        ModBlocks.SANDSTONE_GRANITE.get(),
                        ModBlocks.SANDSTONE_GRANITE_CUT.get(),
                        ModBlocks.SANDSTONE_K_FELDSPAR.get(),
                        ModBlocks.SANDSTONE_K_FELDSPAR_CUT.get(),
                        ModBlocks.SANDSTONE_PLAGIOCLASE_FELDSPAR.get(),
                        ModBlocks.SANDSTONE_PLAGIOCLASE_FELDSPAR_CUT.get(),
                        ModBlocks.SANDSTONE_GLAUCONITE.get(),
                        ModBlocks.SANDSTONE_GLAUCONITE_CUT.get(),
                        ModBlocks.IVORY_BONE_BLOCK.get(),
                        ModBlocks.IVORY_WEATHERED_BONE_BLOCK.get(),
                        ModBlocks.AMETRINE_CHISELED.get(),
                        ModBlocks.AMETRINE_PILLAR.get(),
                        ModBlocks.AMETHYST_CHISELED.get(),
                        ModBlocks.AMETHYST_PILLAR.get(),
                        ModBlocks.CITRINE_CHISELED.get(),
                        ModBlocks.CITRINE_PILLAR.get(),
                        ModBlocks.AVENTURINE_CHISELED.get(),
                        ModBlocks.AVENTURINE_PILLAR.get(),
                        ModBlocks.BLOODSTONE_CHISELED.get(),
                        ModBlocks.BLOODSTONE_PILLAR.get(),
                        ModBlocks.DUMORTIERITE_CHISELED.get(),
                        ModBlocks.DUMORTIERITE_PILLAR.get(),
                        ModBlocks.PRASIOLITE_CHISELED.get(),
                        ModBlocks.PRASIOLITE_PILLAR.get(),
                        ModBlocks.SMOKY_CHISELED.get(),
                        ModBlocks.SMOKY_PILLAR.get(),
                        ModBlocks.ROSE_CHISELED.get(),
                        ModBlocks.OBSIDIAN_GLASS_PANE.get(),
                        ModBlocks.URANIUM_GLASS_PANE.get(),
                        ModBlocks.ROSE_PILLAR.get());


    }
}