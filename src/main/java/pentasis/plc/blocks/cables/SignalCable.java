package pentasis.plc.blocks.cables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import pentasis.plc.base.BaseBlock;

public class SignalCable extends BaseBlock {

    public SignalCable() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }

}
