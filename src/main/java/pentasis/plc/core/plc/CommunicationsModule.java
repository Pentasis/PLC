package pentasis.plc.core.plc;

import pentasis.plc.core.network.Network;
import pentasis.plc.core.workstation.BlockWorkstation;

/**
 * The Communications Module (CM) or I/O Controller. Regulates the signals beween inputs, outputs, different PLCs, memory etc.
 * There are 3 protocols:
 * - Wired
 * - Wireless
 * - Quantum Entangled (inter-dimensional)
 */
public class CommunicationsModule {

    private DataBus dataBus;
    private Network[] connectedNetworks;
    private DigitalInput digitalInput;
    private DigitalOutput digitalOutput;
    private AnalogInput analogInput;
    private AnalogOutput analogOutput;

    public CommunicationsModule(DataBus dataBus) {
        this.dataBus = dataBus;
        digitalInput = new DigitalInput();
        digitalOutput = new DigitalOutput();
        analogInput = new AnalogInput();
        analogOutput = new AnalogOutput();

        initMemoryMapping();
    }

    private void initMemoryMapping() {
        //dataBus.tagMemoryAddress("uses_power", "S2:0.0");
    }

    public void readInputs() {

    }

    public void writeOutputs() {

    }

    // private BlockWorkstation[] connected_workstations;

    // Scan network for connected instrumentation (always) If a connection is lost while running -> stop & error.

    // Scan network for signals and store them.
    // Write inputs to memory.
    // Read outputs from memory and store them.
    // Send outputs.


}
