package pentasis.plc.core.plc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockPLC extends Block {

    // When block is broken, should retain all information. Is this a forge/mc default or must this be implicitly programmed?
    private PowerSupply psu; // Power should turn off, when block is broken.
    private Processor cpu;
    private DataBus dataBus;
    private CommunicationsModule communicationsModule;

    public BlockPLC() {
        super(Block.Properties
              .create(Material.IRON)
              .harvestLevel(2)
              .harvestTool(ToolType.PICKAXE)
        );

        dataBus = new DataBus();
        psu = new PowerSupply(dataBus);
        cpu = new Processor(dataBus);
        communicationsModule = new CommunicationsModule(dataBus);
    }

    // run every 6 (?) gameticks Event <- TODO: make frequency configurabe?
    private void runScanCycle() {
        if (checkStatus()) {
            communicationsModule.readInputs();
            cpu.runProgram();
            communicationsModule.writeOutputs();
        }
    }

    private Boolean checkStatus() {
        // is PLC ready?
        return true;
    }

}
