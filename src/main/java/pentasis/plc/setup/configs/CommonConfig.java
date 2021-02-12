package pentasis.plc.setup.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {

    public final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    // Properties
    public final ForgeConfigSpec.ConfigValue<Integer> rainPreventionChance;
    public final ForgeConfigSpec.BooleanValue rainAfterSleep;

    public CommonConfig() {
        COMMON_BUILDER.comment("Pluvio Common Configuration");
        COMMON_BUILDER.push("Settings");

        rainPreventionChance = COMMON_BUILDER
              .comment("Precentage chance rain will be held back when the game wants to start it.")
              .defineInRange("rainPreventionChance", 50, 0, 100);

        rainAfterSleep = COMMON_BUILDER
              .comment("Will rain continue after you slept?")
              .define("rainAfterSleep", false);

        COMMON_BUILDER.pop();
    }
}
