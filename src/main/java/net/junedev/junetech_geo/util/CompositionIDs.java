package net.junedev.junetech_geo.util;

import net.junedev.junetech_geo.block.tooltips.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class CompositionIDs {
    protected static final List<Integer> caso4 = new ArrayList<>();
    protected static final List<Integer> fe2o3 = new ArrayList<>();
    protected static final List<Integer> hornblende = new ArrayList<>();
    protected static final List<Integer> kcl = new ArrayList<>();
    protected static final List<Integer> kclnacl = new ArrayList<>();
    protected static final List<Integer> kspar = new ArrayList<>();
    protected static final List<Integer> nacl = new ArrayList<>();
    protected static final List<Integer> olivine = new ArrayList<>();
    protected static final List<Integer> pspar = new ArrayList<>();
    protected static final List<Integer> sio2 = new ArrayList<>();

    public static void getCompositionIDs() {
        for (Item item : BuiltInRegistries.ITEM) {
            if (item instanceof BlockItem blockItem) {
                Block block = blockItem.getBlock();
                if (block.getClass() == CaSO4Block.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    caso4.add(id);
                }
                if (block.getClass() == Fe2O3Block.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    fe2o3.add(id);
                }
                if (block.getClass() == HornblendeBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    hornblende.add(id);
                }
                if (block.getClass() == KClBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    kcl.add(id);
                }
                if (block.getClass() == KClNaClBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    kclnacl.add(id);
                }
                if (block.getClass() == KSparBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    kspar.add(id);
                }
                if (block.getClass() == NaClBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    nacl.add(id);
                }
                if (block.getClass() == OlivineBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    olivine.add(id);
                }
                if (block.getClass() == PSparBlock.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    pspar.add(id);
                }
                if (block.getClass() == SiO2Block.class) {
                    int id = BuiltInRegistries.ITEM.getId(item);
                    sio2.add(id);
                }
            }
        }
    }
    public static List<Integer> getCaso4() {
        return caso4;
    }

    public static List<Integer> getFe2o3() {
        return fe2o3;
    }

    public static List<Integer> getHornblende() {
        return hornblende;
    }

    public static List<Integer> getKcl() {
        return kcl;
    }

    public static List<Integer> getKclnacl() {
        return kclnacl;
    }

    public static List<Integer> getKspar() {
        return kspar;
    }

    public static List<Integer> getNacl() {
        return nacl;
    }

    public static List<Integer> getOlivine() {
        return olivine;
    }

    public static List<Integer> getPspar() {
        return pspar;
    }

    public static List<Integer> getSio2() {
        return sio2;
    }
}
