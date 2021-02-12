package pentasis.plc.setup;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SetupManager {

    public SetupManager() {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
    }

    @SubscribeEvent
    public void setupCommon(final FMLCommonSetupEvent event) {
        // Things that are done on both Clients & the Dedicated server.
        // Creating and reading the config files
        // Registering Capabilities
    }

    @SubscribeEvent
    public void setupClient(final FMLClientSetupEvent event) {
        // Things that are only done on the Clients
    }

    @SubscribeEvent
    public void setupServer(final FMLDedicatedServerSetupEvent event) {
        // Things that are only done on the Dedicated (physical) Server
    }

    @SubscribeEvent
    public void enqueueIMC(final InterModEnqueueEvent event) {
        // Send messages to all other mods ths mod wants to integrate with, using the InterModComms.sendTo() method
    }

    @SubscribeEvent
    public void processIMC(final InterModProcessEvent event) {
        // Retrieve messages that have been sent here using the InterModComms.getMessages() method.
    }

}
