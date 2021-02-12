package pentasis.plc.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import pentasis.plc.setup.configs.ClientConfig;
import pentasis.plc.setup.configs.CommonConfig;
import pentasis.plc.setup.configs.ServerConfig;

public class ConfigManager {

    public final ForgeConfigSpec COMMON_CONFIG;
    public final ForgeConfigSpec CLIENT_CONFIG;
    public final ForgeConfigSpec SERVER_CONFIG;

    public ConfigManager(){
        CommonConfig commonConfig = new CommonConfig();
        ClientConfig clientConfig = new ClientConfig();
        ServerConfig serverConfig = new ServerConfig();

        COMMON_CONFIG = commonConfig.COMMON_BUILDER.build();
        CLIENT_CONFIG = clientConfig.CLIENT_BUILDER.build();
        SERVER_CONFIG = serverConfig.SERVER_BUILDER.build();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
    }

}
