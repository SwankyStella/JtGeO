package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

    public class ModBlockStateProvider extends BlockStateProvider {
        private final ExistingFileHelper exFileHelper;

        public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
            super(output, JunetechGeo.MOD_ID, exFileHelper);
            this.exFileHelper = exFileHelper;
        }

        @Override
        protected void registerStatesAndModels() {
            for (RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                if (!exFileHelper.exists(block.getId().withPrefix("models/block/").withSuffix(".json"), PackType.CLIENT_RESOURCES)) {
                    try {
                        blockWithItem(block.get());
                    } catch (IllegalArgumentException ignored) {
                        JunetechGeo.LOGGER.warn("Block without texture: {}", block.getId());
                    }
                }
            }
        }

        private void blockWithItem(Block block) {
            simpleBlockWithItem(block, cubeAll(block));
        }
    }
