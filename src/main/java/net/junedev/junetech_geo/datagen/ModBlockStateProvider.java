package net.junedev.junetech_geo.datagen;

import net.junedev.junetech_geo.junetech_geo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.minecraft.client.model.Model;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, junetech_geo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LIMESTONE);
        blockWithItem(ModBlocks.LIMESTONE_KARST);
        blockWithItem(ModBlocks.LIMESTONE_FOSSILIFEROUS);
        blockWithItem(ModBlocks.LIMESTONE_BLACK);
        blockWithItem(ModBlocks.LIMESTONE_COBBLESTONE);
        blockWithItem(ModBlocks.LIMESTONE_COQUINA);
        blockWithItem(ModBlocks.LIMESTONE_COQUINA_COBBLESTONE);
        blockWithItem(ModBlocks.LIMESTONE_COQUINA_DEFOSSILIZED);
        blockWithItem(ModBlocks.CHALK);
        blockWithItem(ModBlocks.TRAVERTINE_LIME);
        blockWithItem(ModBlocks.TRAVERTINE_PEACH);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}