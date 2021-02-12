package pentasis.plc.setup.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {

    public final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

    // Properties

    public ClientConfig() {
        CLIENT_BUILDER.comment("FactoryCraft Client Configuration");
        CLIENT_BUILDER.push("Category-name");

        CLIENT_BUILDER.pop();
    }


}
