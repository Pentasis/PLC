#Programmable Logic Controller (PLC)

Is a minecraft mod for automating your builds.
It conforms as close as possible to IEC 61131-3 so it can be used as an educational tool as well.

The mod consists of signal cables, connectors and a PLC.

The PLC can be programmed with Structured Text Language (ST), Ladder Diagram Language (LD) or Function Block Language (FB).

Currently only ST is implemented. LD and FB will follow later.

##Connectors
A connector has 2 "rows" of 16 bits. An Input row and an Output row.
The Input row reads values from the block (or machine) it is connected to.
The Output row writes values to the block (or machine) it is connected to.
Each connector is automatically given an ID C<number> where <number> is sequential.
Each connector can be given an alphanumeric name by the player.

##Signals & Redstone
Redstone can have a value of 0 to 15. This means it is 4 bits or 1 nybble.
The Least Significant Nybble (LSN) or the I/O terminals is reserved for redstone signals.
The other 12 terminals are reserved for future use (I want to add specific instruments like sensors, displays, etc. to this mod)

Internally boolean values are converted based on the 3rd bit. This means that:

- HIGH = redstone value of 8 to 15
- LOW = redstone value of 0 to 7

##PLC
The PLC block itself has 32 Inputs, 32 Outputs and 32 Memory Registers. Each 16 bits.
There is also a Firmware slot and an EPROM slot.
The Firmware slot determines if the PLC is in ST, LD or FB mode.
The EPROM slot contains a chip-item that holds the program (to be edited or run).
Finally there is an on/off button in the GUI. When off, you can edit the program and when on, the program runs.
When editing a program it is immediately saved on the EPROM, but you must click the 'compile' button before it can be used.

You assign each input and output to a connector on the same cable-network as the PLC.

##Terminal designations
In order to access a terminal you refer to it as follows:

- Input terminals: `%I<number>`
- Output terminals: `%Q<number>`
- Memory registers: `%M<number>`

If no further designation is given, bit 3 is default. BE AWARE; this deviates from the IEC standard!

You can refer to other bits like this:

`%I<number>.<bit>`  E.g. `%I12.5` will refer to bit 5 of input terminal 12.

or:

`%IX<number>.<bit>` E.g. `%IX12.5` this is the same as above. The `X` is optional.

You can also do:

`%IB<number>.<byte>` which will refer to a byte (8 bits) where byte=0 refers to the LSB and byte=1 to the MSB. E.g. `%IB8.1`

`%IW<number>` refers to the whole word (16 bits). E.g. `%IW28`

Obviously where `I` is used in these examples you can also use `Q` or `M`.

