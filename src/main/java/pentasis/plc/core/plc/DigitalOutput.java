package pentasis.plc.core.plc;

public class DigitalOutput {

    private Boolean[][] modules;

    public DigitalOutput() {
        modules = new Boolean[2][16];
    }

    public void writeToModule(Integer module, Boolean[] output) {
         modules[module] = output;
    }


    /**
     * The GUI has a header (plate) saying Digital Outputs DO
     * Then there are 2 columns named O0 and O1
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
