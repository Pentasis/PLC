package pentasis.plc.core.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import pentasis.plc.base.BaseBlock;

public class BlockFacade extends BaseBlock {

    public BlockFacade() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }

}
