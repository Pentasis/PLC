package pentasis.plc.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import pentasis.plc.core.misc.BlockFacade;
import pentasis.plc.core.network.cables.BlockCableSignal;
import pentasis.plc.core.instumentation.redstone.BlockConnectorRedstone;
import pentasis.plc.core.plc.functionblock.BlockProgrammerFB;
import pentasis.plc.core.plc.ladderdiagram.BlockProgrammerLD;
import pentasis.plc.core.plc.structuredtext.BlockProgrammerST;
import pentasis.plc.core.plc.ItemEPROM;

import static pentasis.plc.PLCMain.registryManager;

public class ContentManager {

    // List of Blocks
    public final RegistryObject<BlockProgrammerST> PROGRAMMER_ST;
    public final RegistryObject<BlockProgrammerLD> PROGRAMMER_LD;
    public final RegistryObject<BlockProgrammerFB> PROGRAMMER_FB;
    public final RegistryObject<BlockConnectorRedstone> REDSTONE_CONNECTOR;
    public final RegistryObject<BlockCableSignal> SIGNAL_CABLE;
    public final RegistryObject<BlockFacade> FACADE;

    // List of Items
    public final RegistryObject<ItemEPROM> EPROM;

    public ContentManager() {
        PROGRAMMER_ST = registryManager.BLOCKS.register("programmer_st", BlockProgrammerST::new);
        PROGRAMMER_LD = registryManager.BLOCKS.register("programmer_ld", BlockProgrammerLD::new);
        PROGRAMMER_FB = registryManager.BLOCKS.register("programmer_fb", BlockProgrammerFB::new);
        REDSTONE_CONNECTOR = registryManager.BLOCKS.register("redstone_connector", BlockConnectorRedstone::new);
        SIGNAL_CABLE = registryManager.BLOCKS.register("signal_cable", BlockCableSignal::new);
        FACADE = registryManager.BLOCKS.register("facade", BlockFacade::new);

        EPROM = registryManager.ITEMS.register("eprom", () -> new ItemEPROM(new Item.Properties()));
    }
}
