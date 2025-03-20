
package net.junedev.modcompat;

import java.util.Map;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public interface IStoneType {
    BlockState getBaseBlock();

    BlockState getCobbleBlock();

    void setCobbleBlock(BlockState var1);

    BlockState getSecondaryReplace();

    void setSecondaryReplace(BlockState var1);

    BlockState getTertiaryReplace();

    void setTertiaryReplace(BlockState var1);

    Map<Block, BlockState> getOreMap();
}
