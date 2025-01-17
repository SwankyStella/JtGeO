package net.junedev.junetech_geo.util;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SEDIMENTARY = tag("sedimentary");
        public static final TagKey<Block> METAMORPHIC = tag("metamorphic");
        public static final TagKey<Block> IGNEOUS = tag("igneous");
        public static final TagKey<Block> GROUND_COVER = tag("ground_cover");
        public static final TagKey<Block> PRIMARY_REPLACEABLE = tag("primary_replaceable");
        public static final TagKey<Block> SECONDARY_REPLACEABLE = tag("secondary_replaceable");
        public static final TagKey<Block> TERTIARY_REPLACEABLE = tag("tertiary_replaceable");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(JunetechGeo.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(JunetechGeo.MOD_ID, name));
        }
    }
}