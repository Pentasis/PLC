package pentasis.plc.core.plc.functionblock;

import pentasis.plc.base.BaseProgrammer;

public class BlockProgrammerFB extends BaseProgrammer {

    // Input terminals, 64 (0-63) * 16. I0:0
    // Output terminals, idem. Q0:0
    // Memory registers, 64 (0-63). M0:0
    // These are all 16 bits.
    // Least Significant Nybble (LSN) carries Redstone value.
    // Internally bit 3 is used as Boolean for redstone, this means that:
    // LOW = 0 - 7
    // HIGH = 8 - 15

    // Firmware slot (ST, LD, FD)

    // EPROM slot, contains program
    // Name & save EPROM

    // ON/OFF switch (redstone/power?)


    public BlockProgrammerFB() {

    }


}
