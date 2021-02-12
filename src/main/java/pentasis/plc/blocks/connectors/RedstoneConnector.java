package pentasis.plc.blocks.connectors;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import pentasis.plc.base.BaseBlock;

public class RedstoneConnector extends BaseBlock {

    public RedstoneConnector() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }
}
