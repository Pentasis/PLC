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

    public Memory() {
        initializeRAM();
    }

    private void initializeRAM() {
        dataMemory = new HashMap<>();
        analogMemory = new HashMap<>();

        dataMemory.put("DI", new Integer[32]);
        dataMemory.put("DO", new Integer[32]);
        dataMemory.put("DM", new Integer[32]);

        dataMemory.put("ST", new Integer[32]);

        analogMemory.put("AI", new Object[32]);
        analogMemory.put("AO", new Object[32]);
        analogMemory.put("AM", new Object[32]);
    }

    public Integer getWord(String type, Integer moduleNr) {
        return dataMemory.get(type)[moduleNr];
    }

    public Boolean getBit(String type, Integer moduleNr, Integer bitNr) {
        return (dataMemory.get(type)[moduleNr] & (1 << bitNr)) != 0;
    }

    public void setWord(String type, Integer moduleNr, Integer value) {
        dataMemory.get(type)[moduleNr] = value;
    }

    public void setBit(String type, Integer moduleNr, Integer bitNr, Boolean set) {
        if (set) {
            dataMemory.get(type)[moduleNr] = dataMemory.get(type)[moduleNr] | (1 << bitNr);
        } else {
            dataMemory.get(type)[moduleNr] = dataMemory.get(type)[moduleNr] & ~(1 << bitNr);
        }
    }

    public Object getValue(String type, Integer moduleNr) {
        return analogMemory.get(type)[moduleNr];
    }

    public void setValue(String type, Integer moduleNr, Object value) {
        analogMemory.get(type)[moduleNr] = value;
    }


}
