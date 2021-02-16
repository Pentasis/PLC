package pentasis.plc.core.workstation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockWorkstation extends Block {

    public BlockWorkstation() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }
}
