package net.junedev.junetech_geo.util;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.junedev.junetech_geo.util.CompositionConstants.*;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SEDIMENTARY = tag("sedimentary");
        public static final TagKey<Block> METAMORPHIC = tag("metamorphic");
        public static final TagKey<Block> IGNEOUS = tag("igneous");
        public static final TagKey<Block> GROUND_COVER = tag("ground_cover");
        public static final TagKey<Block> PRIMARY_REPLACEABLE = tag("primary_replaceable");
        public static final TagKey<Block> SECONDARY_REPLACEABLE = tag("secondary_replaceable");
        public static final TagKey<Block> TERTIARY_REPLACEABLE = tag("tertiary_replaceable");
        public static final TagKey<Block> DONTDATAGEN = tag("dont_datagen");

        // TODO: Tag names cannot contain special characters
        public static final TagKey<Block> caso4 = tag(CASO4);
        public static final TagKey<Block> fe2o3 = tag(FE2O3);
        public static final TagKey<Block> hornblende = tag(HBL);
        public static final TagKey<Block> kcl = tag(KCL);
        public static final TagKey<Block> kclnacl = tag(KCL_NACL);
        public static final TagKey<Block> kspar = tag(KSPAR);
        public static final TagKey<Block> nacl = tag(NACL);
        public static final TagKey<Block> olivine = tag(OL);
        public static final TagKey<Block> pspar = tag(PSPAR);
        public static final TagKey<Block> sio2 = tag(SIO2);

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(JunetechGeo.id(name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(JunetechGeo.id(name));
        }
    }
}