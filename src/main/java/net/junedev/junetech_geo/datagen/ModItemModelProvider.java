package net.junedev.junetech_geo.datagen;

import net.junedev.junetech_geo.junetech_geo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, junetech_geo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ADOBE_BRICK);
        simpleItem(ModItems.AMBER_SHARD);
        simpleItem(ModItems.AMETRINE_SHARD);
        simpleItem(ModItems.AVENTURINE_SHARD);
        simpleItem(ModItems.BALL_OF_MOSS);
        simpleItem(ModItems.BLOODSTONE_QUARTZ_SHARD);
        simpleItem(ModItems.BUCKET_OF_CRUDE_OIL);
        simpleItem(ModItems.BUCKET_OF_LAHAR);
        simpleItem(ModItems.BUCKET_OF_MERCURY);
        simpleItem(ModItems.BUCKET_OF_TAR);
        simpleItem(ModItems.CHALK_STICK);
        simpleItem(ModItems.CHISEL_DIAMOND);
        simpleItem(ModItems.CHISEL_IRON);
        simpleItem(ModItems.CHISEL_NETHERITE);
        simpleItem(ModItems.CITRINE_SHARD);
        simpleItem(ModItems.COAL_ANTHRACITE);
        simpleItem(ModItems.COAL_LIGNITE);
        simpleItem(ModItems.DIRT_CLUMP);
        simpleItem(ModItems.DUMORTIERITE_SHARD);
        simpleItem(ModItems.DUST_SALT_NACL);
        simpleItem(ModItems.FOSSIL_ARCHAEOCYATHAN);
        simpleItem(ModItems.FOSSIL_BRYOZOAN);
        simpleItem(ModItems.FOSSIL_CEPHALOPOD);
        simpleItem(ModItems.FOSSIL_COQUINA_AMMONITE);
        simpleItem(ModItems.FOSSIL_COQUINA_BRACHIOPOD);
        simpleItem(ModItems.FOSSIL_COQUINA_SHARK_TOOTH);
        simpleItem(ModItems.FOSSIL_COQUINA_TRILOBITE);
        simpleItem(ModItems.FOSSIL_CORAL);
        simpleItem(ModItems.FOSSIL_CRINOID);
        simpleItem(ModItems.FOSSIL_ECHINOID);
        simpleItem(ModItems.FOSSIL_GASTROPOD);
        simpleItem(ModItems.FOSSIL_MAMMOTH_TUSK);
        simpleItem(ModItems.FOSSIL_SPONGE);
        simpleItem(ModItems.GEODE_AGATE);
        simpleItem(ModItems.GEODE_AMETHYST);
        simpleItem(ModItems.GEODE_CLOSED);
        simpleItem(ModItems.GEODE_JASPER);
        simpleItem(ModItems.GEODE_ONYX);
        simpleItem(ModItems.GEODE_QUARTZ);
        simpleItem(ModItems.GRASS_CLUMP);
        simpleItem(ModItems.GRAVEL_PEBBLES);
        simpleItem(ModItems.LITHIC_LIME);
        simpleItem(ModItems.LITHIC_ORTHOCLASE_FELDSPAR);
        simpleItem(ModItems.LITHIC_PLAGIOCLASE_FELDSPAR);
        simpleItem(ModItems.LITHIC_QUARTZ);
        simpleItem(ModItems.LOAM_CLUMP);
        simpleItem(ModItems.MACUAHUITL);
        simpleItem(ModItems.MULLITE_SHARD);
        simpleItem(ModItems.OBSIDIAN_SHARD);
        simpleItem(ModItems.OCHRE_CLAY_BALL);
        simpleItem(ModItems.OPAL_SHARD);
        simpleItem(ModItems.PEARL);
        simpleItem(ModItems.PERMAFROST_CLUMP);
        simpleItem(ModItems.PRASIOLITE_SHARD);
        simpleItem(ModItems.RED_CLAY_BALL);
        simpleItem(ModItems.ROCK_PILE);
        simpleItem(ModItems.ROCKHOUNDERS_BACKPACK);
        simpleItem(ModItems.ROCKHOUNDERS_SATCHEL);
        simpleItem(ModItems.ROSE_QUARTZ_SHARD);
        simpleItem(ModItems.SAND_PILE);
        simpleItem(ModItems.SAND_PILE_BASALT);
        simpleItem(ModItems.SAND_PILE_CASSITERITE);
        simpleItem(ModItems.SAND_PILE_GLAUCONITE);
        simpleItem(ModItems.SAND_PILE_GRANITE);
        simpleItem(ModItems.SAND_PILE_LACUSTRINE);
        simpleItem(ModItems.SAND_PILE_ORTHOCLASE_FELDSPAR);
        simpleItem(ModItems.SAND_PILE_PLAGIOCLASE_FELDSPAR);
        simpleItem(ModItems.SAND_PILE_RED);
        simpleItem(ModItems.SAND_PILE_SODALITE);
        simpleItem(ModItems.SAND_PILE_SOUL);
        simpleItem(ModItems.SILT_PILE);
        simpleItem(ModItems.SMOKY_QUARTZ_SHARD);
        simpleItem(ModItems.SOOT_PILE);
        simpleItem(ModItems.VOLCANIC_ASH_PILE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(junetech_geo.MOD_ID,"item/" + item.getId().getPath()));
    }
}