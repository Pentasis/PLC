package pentasis.plc.core.plc;

/**
 * The Power Supply Unit (PSU) gives power to the PLC.
 * In the configfile you can set the amount of power used (or 0 for none)
 */
public class PowerSupply {

    private DataBus dataBus;

    public PowerSupply(DataBus dataBus) {
        this.dataBus = dataBus;

        initMemoryMapping();
    }

    private void initMemoryMapping() {
        dataBus.tagMemoryAddress("uses_power", "#ST0.0"); // from config
        dataBus.tagMemoryAddress("has_power", "#ST0.1"); // if uses_power and amount = enough.
        dataBus.tagMemoryAddress("power_is_on", "#ST0.2");

        powerOff();
    }

    private void powerOn() {
        dataBus.setBit("power_is_on", true);
    }

    private void powerOff() {
        dataBus.setBit("power_is_on", false);
    }

    private void togglePower() {
        if (dataBus.getBit("power_is_on")) {
            powerOff();
        } else {
            powerOn();
        }
    }

    /*
    The GUI has an on/off button, and a LED that is green when on and red (blinking?) if unpowered.
     */
    public void gui() {

    }

}
