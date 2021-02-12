package pentasis.plc.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BaseProgrammer extends Block {

    public BaseProgrammer() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );
    }
}
