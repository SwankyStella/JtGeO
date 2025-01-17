package net.junedev.junetech_geo.mixins;

import com.google.common.collect.Lists;
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

import static net.junedev.junetech_geo.util.CompositionIDs.*;

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
    public void junetech_geo$CreativeModeInventoryScreenMixin(ItemStack pStack, CallbackInfoReturnable<List<Component>> cir) {
        var resourceLocation = BuiltInRegistries.ITEM.getKey(pStack.getItem());

        if (resourceLocation != null && resourceLocation.getNamespace().equals("junetech_geo") && pStack.getItem() instanceof BlockItem) {
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
                    if (getCaso4().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("CaSO₄·H₂O").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getFe2o3().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("Fe₂O₃").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getHornblende().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("Ca₂(Mg,Fe,Al)₅(Al,Si)₈O₂₂(OH)₂").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getKcl().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("KCl").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getKclnacl().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("KCl·(NaCl)₂").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getKspar().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("K(AlSi₃O₈)").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getNacl().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("NaCl").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getOlivine().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("(Mg,Fe)₂·SiO₄").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getPspar().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("NaAlSi₃O₈·CaAl₂Si₂O₈").withStyle(ChatFormatting.GRAY));
                        index = 2;
                    }
                    if (getSio2().contains(Item.getId(hoveredItem))) {
                        list1.add(1, Component.literal("SiO₂").withStyle(ChatFormatting.GRAY));
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

