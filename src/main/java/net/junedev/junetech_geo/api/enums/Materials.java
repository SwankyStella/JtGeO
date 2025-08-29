package net.junedev.junetech_geo.api.enums;

import net.junedev.junetech_geo.api.interfaces.IColorify;
import net.junedev.junetech_geo.api.interfaces.ISubTagContainer;
import net.junedev.junetech_geo.api.interfaces.ICondition;
import net.junedev.junetech_geo.api.interfaces.IMaterialHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.Nonnull;

import net.minecraft.world.item.Item;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.FluidStack;


public class Materials implements IColorify, ISubTagContainer {
    public static final List<IMaterialHandler> mMaterialHandlers = new ArrayList<>();
    private static final Map<String, Materials> MATERIALS_MAP = new LinkedHashMap<>();

    public static final Map<FluidType, Materials> FLUID_MAP = new LinkedHashMap<>();


    public static Collection<Materials> VALUES = new LinkedHashSet<>();
    //sets defaults... might not need this?
    public static Materials _NULL = new Materials(-1, "NULL", "NULL", "NULL", "NULL", 0, "NULL", 255, 0, 255, 0, "NULL", -1, "NULL");

    public final short[] mRGBa = new short[] { 255, 255, 255, 0 }, mMoltenRGBa = new short[] { 255, 255, 255, 0 };

    public Materials(int materialID, String name, String localName, String associatedBlock, String formula, int hardness, String crystalHabit, int r, int g, int b, int a, String luster, int rarity, String customCondition) {
    }

    @Override
    public short[] getRGBa() {
        return new short[0];
    }

    @Override
    public boolean contains(SubTag aTag) {
        return false;
    }

    @Override
    public ISubTagContainer add(SubTag... aTags) {
        return null;
    }

    @Override
    public boolean remove(SubTag aTag) {
        return false;
    }
}