package net.junedev.junetech_geo.util;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.junedev.junetech_geo.util.CompositionConstants.*;

public class ModTags {
    public static class Blocks {
        // Rock Tags
        public static final TagKey<Block> SEDIMENT = tag("sediment");
        public static final TagKey<Block> SOIL = tag("soil");
        public static final TagKey<Block> SEDIMENTARY = tag("sedimentary");
        public static final TagKey<Block> SED_CHEMICAL = tag("sed_chemical");
        public static final TagKey<Block> SED_CLASTIC = tag("sed_clastic");
        public static final TagKey<Block> SANDSTONE = tag("sandstone");
        public static final TagKey<Block> METAMORPHIC = tag("metamorphic");
        public static final TagKey<Block> META_FOLIATED = tag("meta_foliated");
        public static final TagKey<Block> META_NONFOLIATED = tag("meta_nonfoliated");
        public static final TagKey<Block> IGNEOUS = tag("igneous");
        public static final TagKey<Block> GRANITE = tag("granite");
        public static final TagKey<Block> FELSIC_INTRUSIVE = tag("felsic_intrusive");
        public static final TagKey<Block> FELSIVE_EXTRUSIVE = tag("felsic_extrusive");
        public static final TagKey<Block> INTERMEDIATE_INTRUSIVE = tag("intermediate_intrusive");
        public static final TagKey<Block> INTERMEDIATE_EXTRUSIVE = tag("intermediate_extrusive");
        public static final TagKey<Block> MAFIC_INTRUSIVE = tag("mafic_intrusive");
        public static final TagKey<Block> MAFIC_EXTRUSIVE = tag("mafic_extrusive");
        public static final TagKey<Block> ULTRAMAFIC_INTRUSIVE = tag("ultramafic_intrusive");
        public static final TagKey<Block> ULTRAMAFIC_EXTRUSIVE = tag("ultramafic_extrusive");

        //Mineral Tags
        public static final TagKey<Block> MINERAL = tag("mineral");
        public static final TagKey<Block> MINERALLOID = tag("mineralloid");
        // Gameplay Tags
        public static final TagKey<Block> PRIMARY_REPLACEABLE = tag("primary_replaceable");
        public static final TagKey<Block> SECONDARY_REPLACEABLE = tag("secondary_replaceable");
        public static final TagKey<Block> TERTIARY_REPLACEABLE = tag("tertiary_replaceable");
        public static final TagKey<Block> HARD_STONE_TOOL_MATERIALS = tag("hard_stone_tool_materials");
        // NOTE: hard stone tool materials are separate from normal ones.

        // Tooltip Tags
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

        // TODO: Mod Compatability with tools and everything

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