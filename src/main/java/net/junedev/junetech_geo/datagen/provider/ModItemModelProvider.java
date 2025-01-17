package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JunetechGeo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
            if (!(item.get() instanceof BlockItem)) {
                try {
                    basicItem(item.getId());
                } catch (IllegalArgumentException ignored) {
                    JunetechGeo.LOGGER.warn("Item without texture: {}", item.getId().toString());
                }
            }
        }
    }
}