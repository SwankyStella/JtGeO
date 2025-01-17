package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JunetechGeo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
            try {
                blockWithItem(block);
            } catch (IllegalArgumentException ignored) {
                JunetechGeo.LOGGER.warn("Block without texture: {}", block.getId());
            }
        }
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}