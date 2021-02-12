package pentasis.plc.blocks.cables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import pentasis.plc.base.BaseBlock;

public class Facade extends BaseBlock {

    public Facade() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }

}
