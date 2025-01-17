package net.junedev.junetech_geo.block.tooltips;

import net.minecraft.world.level.block.Block;

public class HornblendeBlock extends Block {
    public HornblendeBlock(Properties pProperties) {
        super(pProperties);
    }
}

/* public class BlockWithTooltip extends Block {
    private final String tooltip;

    public BlockWithTooltip(Properties pProperties, String pTooltip) {
        super(pProperties);
        this.tooltip = pTooltip;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.literal(this.tooltip).withStyle(ChatFormatting.GRAY));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag)
    }
}*/