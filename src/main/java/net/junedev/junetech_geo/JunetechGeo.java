package net.junedev.junetech_geo;

import com.mojang.logging.LogUtils;
import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.client.screen.JtGeOWorldPresetScreen;
import net.junedev.junetech_geo.item.ModCreativeModeTabs;
import net.junedev.junetech_geo.item.ModItems;
import net.junedev.junetech_geo.worldgen.JtGeOChunkGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JunetechGeo.MOD_ID)
public class JunetechGeo {
    public static final String MOD_ID = "junetech_geo";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public JunetechGeo() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        JtGeOChunkGenerator.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(JtGeOWorldPresetScreen::register);
        }

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.MACUAHUITL);
        }
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.BUCKET_OF_CRUDE_OIL);
            event.accept(ModItems.BUCKET_OF_LAHAR);
            event.accept(ModItems.BUCKET_OF_MERCURY);
            event.accept(ModItems.BUCKET_OF_TAR);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.CHISEL_IRON);
            event.accept(ModItems.CHISEL_DIAMOND);
            event.accept(ModItems.CHISEL_NETHERITE);
            event.accept(ModItems.ROCKHOUNDERS_BACKPACK);
            event.accept(ModItems.ROCKHOUNDERS_SATCHEL);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}