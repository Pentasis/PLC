package pentasis.plc.core.network.cables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import pentasis.plc.base.BaseBlock;

public class BlockCableSignal extends BaseBlock {

    public BlockCableSignal() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }

}
