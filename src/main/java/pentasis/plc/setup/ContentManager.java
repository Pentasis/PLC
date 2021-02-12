package pentasis.plc.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import pentasis.plc.blocks.cables.Facade;
import pentasis.plc.blocks.cables.SignalCable;
import pentasis.plc.blocks.connectors.RedstoneConnector;
import pentasis.plc.blocks.plc.ProgrammerFB;
import pentasis.plc.blocks.plc.ProgrammerLD;
import pentasis.plc.blocks.plc.ProgrammerST;
import pentasis.plc.items.plc.EPROM;
import pentasis.plc.items.plc.FirmwareFB;
import pentasis.plc.items.plc.FirmwareLD;
import pentasis.plc.items.plc.FirmwareST;

import static pentasis.plc.PLCMain.registryManager;

public class ContentManager {

    // List of Blocks
    public final RegistryObject<ProgrammerST> PROGRAMMER_ST;
    public final RegistryObject<ProgrammerLD> PROGRAMMER_LD;
    public final RegistryObject<ProgrammerFB> PROGRAMMER_FB;
    public final RegistryObject<RedstoneConnector> REDSTONE_CONNECTOR;
    public final RegistryObject<SignalCable> SIGNAL_CABLE;
    public final RegistryObject<Facade> FACADE;

    // List of Items
    public final RegistryObject<EPROM> EPROM;
    public final RegistryObject<FirmwareFB> FIRMWARE_FB;
    public final RegistryObject<FirmwareLD> FIRMWARE_LD;
    public final RegistryObject<FirmwareST> FIRMWARE_ST;

    public ContentManager() {
        PROGRAMMER_ST = registryManager.BLOCKS.register("programmer_st", ProgrammerST::new);
        PROGRAMMER_LD = registryManager.BLOCKS.register("programmer_ld", ProgrammerLD::new);
        PROGRAMMER_FB = registryManager.BLOCKS.register("programmer_fb", ProgrammerFB::new);
        REDSTONE_CONNECTOR = registryManager.BLOCKS.register("redstone_connector", RedstoneConnector::new);
        SIGNAL_CABLE = registryManager.BLOCKS.register("signal_cable", SignalCable::new);
        FACADE = registryManager.BLOCKS.register("facade", Facade::new);

        EPROM = registryManager.ITEMS.register("eprom", () -> new EPROM(new Item.Properties()));
        FIRMWARE_FB = registryManager.ITEMS.register("firmware_fb", () -> new FirmwareFB(new Item.Properties()));
        FIRMWARE_LD = registryManager.ITEMS.register("firmware_ld", () -> new FirmwareLD(new Item.Properties()));
        FIRMWARE_ST = registryManager.ITEMS.register("firmware_st", () -> new FirmwareST(new Item.Properties()));
    }
}
