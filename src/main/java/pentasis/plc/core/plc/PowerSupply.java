package pentasis.plc.core.plc;

/**
 * The Power Supply Unit (PSU) gives power to the PLC.
 */
public class PowerSupply {

    private DataBus dataBus;

    public PowerSupply(DataBus dataBus) {
        this.dataBus = dataBus;

        initMemoryMapping();
    }

    private void initMemoryMapping() {
        dataBus.tagMemoryAddress("uses_power", "#S2:0.0");
        dataBus.tagMemoryAddress("has_power", "#S2:0.1");
        dataBus.tagMemoryAddress("power_is_on", "#S2:0.2");
    }

    /*
    The GUIS has an on/off button, and a LED that is red when on.
     */
    public void gui() {

    }

}
