package net.junedev.junetech_geo.api.enums;

import net.junedev.junetech_geo.api.interfaces.IMaterialHandler;
import net.minecraftforge.fluids.FluidType;

import java.util.*;

public class Chemicals {
        public static final List<IMaterialHandler> mMaterialHandlers = new ArrayList<>();
        private static final Map<String, net.junedev.junetech_geo.api.enums.Chemicals> CHEMICALS_MAP = new LinkedHashMap<>();

        public static final Map<FluidType, net.junedev.junetech_geo.api.enums.Chemicals> FLUID_MAP = new LinkedHashMap<>();


        public static Collection<net.junedev.junetech_geo.api.enums.Materials> VALUES = new LinkedHashSet<>();
        //sets defaults... might not need this?
        public static net.junedev.junetech_geo.api.enums.Chemicals _NULL = new net.junedev.junetech_geo.api.enums.Chemicals(-1, "NULL", "NULL", "NULL", 0, 0, 0, 0, "NULL", 255, false, 0, "NULL", 0, Collections.singletonList("NULL"));

        public Chemicals(int chemicalID, String name, String IUPACName, String formula, int pH, int meltingPoint, int boilingPoint, int meltsInto, String colorName, int transparency, boolean solubility, int dissolvesInto, String mineralAssociate, int enthalpyOfFormation, List components) {
        }
        //Raw Elements
        public static Chemicals Hydrogen;
}
