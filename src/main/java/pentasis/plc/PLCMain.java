package pentasis.plc;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pentasis.plc.setup.*;

@Mod(PLCMain.MODID)
public class PLCMain {

    public static final String MODID = "plc";
    public static final String MOD_NAME = "PLC";

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static RegistryManager registryManager;
    public static ContentManager contentManager;
    public static ItemGroupManager itemGroup;
    public static SetupManager setupManager;
    public static ConfigManager configManager;
    public static PLC plc;

    public PLCMain() {
        /*
           Yeah, I know everyone seems to use Static/Utility classes. And while I have no opinion on the matter
           I choose to keep to a SOLID way of doing things. Hence the use of objects here.
         */
        registryManager = new RegistryManager();
        contentManager = new ContentManager();
        itemGroup = new ItemGroupManager(MODID, () -> new ItemStack(contentManager.EPROM.get()));
        setupManager = new SetupManager();
        configManager = new ConfigManager();
        plc = new PLC();
    }

}
