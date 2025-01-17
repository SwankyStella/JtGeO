package net.junedev.junetech_geo.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemWithTooltip extends Item {
	private final String tooltip;

	private final boolean displayBelowName;

	public ItemWithTooltip(Properties pProperties, String pTooltip, boolean pDisplayBelowName) {
		super(pProperties);
		this.tooltip = pTooltip;
		this.displayBelowName = pDisplayBelowName;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
		if (!displayBelowName)
			pTooltip.add(Component.literal(this.tooltip).withStyle(ChatFormatting.GRAY));
		super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
	}

	public Component getTooltip() {
		return Component.literal(this.tooltip).withStyle(ChatFormatting.GRAY);
	}
}