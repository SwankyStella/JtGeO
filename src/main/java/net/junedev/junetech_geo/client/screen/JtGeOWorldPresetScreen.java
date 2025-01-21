package net.junedev.junetech_geo.client.screen;

import net.junedev.junetech_geo.worldgen.JtGeOChunkGenerator;
import net.junedev.junetech_geo.worldgen.settings.Settings;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.OptionsList;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationContext;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterPresetEditorsEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class JtGeOWorldPresetScreen extends Screen {
    private final CreateWorldScreen parent;
    private final WorldCreationContext context;

    private OptionsList options;
    private OptionInstance<Boolean> test;

    public JtGeOWorldPresetScreen(CreateWorldScreen parent, WorldCreationContext context) {
        super(Component.translatable("junetech_geo.tooltip.create_world.title"));

        this.parent = parent;
        this.context = context;
    }

    @Override
    protected void init() {
        assert minecraft != null;

        if (!(context.selectedDimensions().overworld() instanceof JtGeOChunkGenerator chunkGenerator))
            throw new IllegalArgumentException("chunk generator " + context.selectedDimensions().overworld() + " must be instance of JtGeoChunkGenerator. This can be configured in data/<namespace>/worldgen/world_preset/<preset_name>.json");

        Settings settings = chunkGenerator.settings();

        options = new OptionsList(minecraft, width, height, 32, height-32, 25);

        options.addBig(
                test = OptionInstance.createBoolean("junetech_geo.create_world.test", settings.test(), val -> {})
        );

        addWidget(options);

        addRenderableWidget(Button.builder(CommonComponents.GUI_DONE, button -> {
            applySettings();
            minecraft.setScreen(parent);
        }).bounds(width/2-155, height-28, 150, 20).build());
        addRenderableWidget(Button.builder(CommonComponents.GUI_CANCEL, button -> {
            minecraft.setScreen(parent);
        }).bounds(width/2+5, height-28, 150, 20).build());
    }

    private void applySettings() {
        if (context.selectedDimensions().overworld() instanceof JtGeOChunkGenerator generator) {
            generator.applySettings(old -> new Settings(
                    test.get()
            ));
        }
    }

    @Override
    public void onClose() {
        assert minecraft != null;
        minecraft.setScreen(parent);
    }

    @Override
    public void render(@NotNull GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pGuiGraphics);
        options.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        pGuiGraphics.drawCenteredString(font, title, width/2, 8, 16777215);
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
    }

    @ApiStatus.Internal
    public static void register(RegisterPresetEditorsEvent event){
        event.register(JtGeOChunkGenerator.DEFAULT_WORLD_PRESET, JtGeOWorldPresetScreen::new);
    }
}
