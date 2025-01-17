package net.junedev.junetech_geo.mixins;

import com.google.common.collect.Lists;
import net.junedev.junetech_geo.block.BlockWithTooltip;
import net.junedev.junetech_geo.item.ItemWithTooltip;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.*;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.Set;

@Mixin(CreativeModeInventoryScreen.class)
public abstract class CreativeModeInventoryScreenMixin extends EffectRenderingInventoryScreen<CreativeModeInventoryScreen.ItemPickerMenu> {
    @Shadow
    private static CreativeModeTab selectedTab;

    @Final
    @Shadow
    private Set<TagKey<Item>> visibleTags;

    protected CreativeModeInventoryScreenMixin(CreativeModeInventoryScreen.ItemPickerMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Inject(method = "getTooltipFromContainerItem(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", at = @At("HEAD"), cancellable = true)
    public void addTooltip(ItemStack pStack, CallbackInfoReturnable<List<Component>> cir) {
        var resourceLocation = BuiltInRegistries.ITEM.getKey(pStack.getItem());

        if (resourceLocation != null && resourceLocation.getNamespace().equals("junetech_geo") &&
                (pStack.getItem() instanceof BlockItem blockItem && blockItem.getBlock() instanceof BlockWithTooltip ||
                pStack.getItem() instanceof ItemWithTooltip)
        ) {
            boolean flag = this.hoveredSlot != null && this.hoveredSlot instanceof CreativeModeInventoryScreen.CustomCreativeSlot;
            boolean flag1 = selectedTab.getType() == CreativeModeTab.Type.CATEGORY;
            boolean flag2 = selectedTab.hasSearchBar();
            TooltipFlag.Default tooltipflag$default = this.minecraft.options.advancedItemTooltips ? TooltipFlag.Default.ADVANCED : TooltipFlag.Default.NORMAL;
            TooltipFlag tooltipflag = flag ? tooltipflag$default.asCreative() : tooltipflag$default;
            List<Component> list = pStack.getTooltipLines(this.minecraft.player, tooltipflag);
            if (flag1 && flag) {
                cir.setReturnValue(list);
            } else {
                List<Component> list1 = Lists.newArrayList(list);

                int index = 1;

                Item hoveredItem = hoveredSlot.getItem().getItem();

                if (hoveredItem != null) {
                    if (pStack.getItem() instanceof BlockItem bItem && bItem.getBlock() instanceof BlockWithTooltip bTooltip &&
                            !bTooltip.getTooltip().toFlatList().isEmpty()) {
                        index = 2;
                    } else if (pStack.getItem() instanceof ItemWithTooltip iTooltip &&
                            !iTooltip.getTooltip().toFlatList().isEmpty()) {
                        index = 2;
                    }
                }

                if (flag2 && flag) {
                    int finalTooltipIndex = index;
                    this.visibleTags.forEach((p_205407_) -> {
                        if (pStack.is(p_205407_)) {
                            list1.add(finalTooltipIndex, Component.literal("#" + p_205407_.location()).withStyle(ChatFormatting.DARK_PURPLE));
                        }
                    });
                }

                for (CreativeModeTab creativemodetab : CreativeModeTabs.tabs()) {
                    if (!creativemodetab.hasSearchBar() && creativemodetab.contains(pStack)) {
                        list1.add(index++, creativemodetab.getDisplayName().copy().withStyle(ChatFormatting.BLUE));
                    }
                }

                cir.setReturnValue(list1);
            }
        }
    }
}

