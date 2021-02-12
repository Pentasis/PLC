package pentasis.plc.setup.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

    public final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

    // Properties

    public ServerConfig() {
        SERVER_BUILDER.comment("FactoryCraft Server Configuration");
        SERVER_BUILDER.push("Category-name");

        SERVER_BUILDER.pop();
    }
}
