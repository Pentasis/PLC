package pentasis.plc.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import pentasis.plc.core.misc.BlockFacade;
import pentasis.plc.core.network.cables.BlockCableSignal;
import pentasis.plc.core.instumentation.redstone.BlockConnectorRedstone;
import pentasis.plc.core.plc.BlockPLC;
import pentasis.plc.core.plc.workstation.BlockWorkstation;

import static pentasis.plc.PLC.registryManager;

public class ContentManager {

    // List of Blocks
    public final RegistryObject<BlockPLC> SYSTEM_CABINET;
    public final RegistryObject<BlockWorkstation> WORKSTATION;
    public final RegistryObject<BlockConnectorRedstone> REDSTONE_CONNECTOR;
    public final RegistryObject<BlockCableSignal> SIGNAL_CABLE;
    public final RegistryObject<BlockFacade> FACADE;

    // List of Items


    public ContentManager() {
        SYSTEM_CABINET = registryManager.BLOCKS.register("system_cabinet", BlockPLC::new);
        WORKSTATION = registryManager.BLOCKS.register("workstation", BlockWorkstation::new);
        REDSTONE_CONNECTOR = registryManager.BLOCKS.register("redstone_connector", BlockConnectorRedstone::new);
        SIGNAL_CABLE = registryManager.BLOCKS.register("signal_cable", BlockCableSignal::new);
        FACADE = registryManager.BLOCKS.register("facade", BlockFacade::new);
    }
}
