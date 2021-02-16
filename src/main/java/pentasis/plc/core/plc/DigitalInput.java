package pentasis.plc.core.plc;

public class DigitalInput {

    private Boolean[][] modules;

    public DigitalInput() {
        modules = new Boolean[2][16];
    }

    public Boolean[] readFromModule(Integer module) {
        // TODO: update from instruments?
        return modules[module];
    }

    /**
     * The GUI has a header (plate) saying DI
     * Then there are 2 columns named I0 and I1
     * Each column has 16 rows, showing an LED, a terminal (screwhead) and a selectionbox (drop-down?).
     * The drop down is used to select which read-signal from which instrument is connected to this terminal.
     * this also sets the (memory)tag to [instrument-name or ID]:[signal-name]
     * When the instrument-name changes, this changes also automatically
     * When the instrument disconnects, the LED turns red.
     * if the signal is HIGH, the led is green, if the signal is LOW the LED is off.
     */
    private void gui() {

    }
}
