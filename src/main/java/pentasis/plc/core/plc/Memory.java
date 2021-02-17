package pentasis.plc.core.plc;

/*
 *
 * - Program memory
 *     - Slot 1 : SFC Programs
 *     - Slot 2 : Program to run
 *     - Slot 3 - 999: Subroutines
 *
 * - Data memory
 *     - DI: Digital Inputs
 *     - DO: Digital Outputs
 *     - AI: Analog Inputs
 *     - AO: Analog Outputs
 *     - ST: PLC Status
 *
 *  The word 'file' here is an industry standard and refers to a memory-block, it has nothing to do with a file
 *  as it is used anywhere else in the world.
 */

import java.util.HashMap;
import java.util.Map;

public class Memory {

    private Map<String, Integer[]> dataMemory;
    private Map<String, Object[]> analogMemory;
    private String programMemory;

    public Memory() {
        initializeRAM();
    }

    private void initializeRAM() {
        dataMemory = new HashMap<>();
        analogMemory = new HashMap<>();
        programMemory = "";

        dataMemory.put("DI", new Integer[32]);
        dataMemory.put("DO", new Integer[32]);
        dataMemory.put("DM", new Integer[32]);

        dataMemory.put("ST", new Integer[32]);

        analogMemory.put("AI", new Object[32]);
        analogMemory.put("AO", new Object[32]);
        analogMemory.put("AM", new Object[32]);
    }

    // TODO: check for valid range modules & bits

    public Integer getWord(String address) {
        return dataMemory.get(getMemoryType(address))[getModuleNr(address)];
    }

    public Boolean getBit(String address) {
        return (dataMemory.get(getMemoryType(address))[getModuleNr(address)] & (1 << getBitNr(address))) != 0;
    }

    public void setWord(String address, Integer value) {
        dataMemory.get(getMemoryType(address))[getModuleNr(address)] = value;
    }

    public void setBit(String address, Boolean set) {
        if (set) {
            dataMemory.get(getMemoryType(address))[getModuleNr(address)] = dataMemory.get(getMemoryType(address))[getModuleNr(address)] | (1 << getBitNr(address));
        } else {
            dataMemory.get(getMemoryType(address))[getModuleNr(address)] = dataMemory.get(getMemoryType(address))[getModuleNr(address)] & ~(1 << getBitNr(address));
        }
    }

    public Object getValue(String address) {
        return analogMemory.get(getMemoryType(address))[getModuleNr(address)];
    }

    public void setValue(String address, Object value) {
        analogMemory.get(getMemoryType(address))[getModuleNr(address)] = value;
    }

    private String getMemoryType(String address) {
        return address.substring(0, 1);
    }

    private Integer getModuleNr(String address) {
        String[] parts;
        parts = address.substring(2).split("\\.");
        return Integer.valueOf(parts[0]);
    }

    private Integer getBitNr(String address) {
        address = address.substring(address.indexOf(".") + 1);
        return Integer.valueOf(address);
    }

    public String getProgramMemory() {
        return programMemory;
    }
}
