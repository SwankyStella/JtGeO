package net.junedev.junetech_geo.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlockWithTooltip extends Block {
    private final Component tooltip;
    private final boolean displayBelowName;

    public BlockWithTooltip(Properties pProperties, String pTooltip, boolean pDisplayBelowName) {
        super(pProperties);
        this.tooltip = Component.literal(pTooltip).withStyle(ChatFormatting.GRAY);
        this.displayBelowName = pDisplayBelowName;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(this.tooltip);
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }

    public Component getTooltip() {
        return this.tooltip;
    }

    public boolean displaysBelowName() {
        return this.displayBelowName;
    }
}
