# Programmable Logic Controller (PLC)

Is a minecraft mod for automating your builds using the same technology as Real Life factories do.
It conforms as close as possible to [IEC 61131-3](https://en.wikipedia.org/wiki/IEC_61131-3) so it can be used as an educational tool as well.

The mod consists of signal cables, connectors and a PLC.

For now, the PLC can be programmed with Structured Text Language (ST).

Ladder Diagram Language (LD) and Function Block Language (FB) will be added later as well.

**_I am looking for help/collaboration on this project. If you're interested and versed in Minecraft Modding; please message me._**

## Instrumentation
Instrumentation is anything that reads or writes information. E.g. buttons, switches, monitors, sensors, motors, etc.
For now, the only instrument this mod comes with is a Redstone-Connector. In future there will be more instruments and an API so others can extend it.

Instruments connect to Signal Cables. This connection consists of 2 (virtual) cables; an Input 'cable' and an Output 'cable'. They have 16 'wires' each allowing a 16 bit wide signal.

Each Instrument is automatically given an ID `C<number>` where `<number>` is sequential (C stands for Connector, but other letters can be used e.g. B for Button, V for Valve, S for Sensor, etc.).

Each Instrument has a gui where it can be given an alphanumeric name by the player.

## Signals & Redstone
Not every instrument will have a need for redstone, but if it does, it should conform to these defaults:

Redstone can have a value of 0 to 15. This means it is 4 bits or 1 nybble.

Bit 0 of the signal-cables will be 1 if there is any redstone value (1-15). Bits 4, 5, 6 & 7 (the High Nybble of the Least Significant Byte) will hold the actual redstone value in binary.

Bit 1, 2, 3 and 8 to 15 are reserved for other uses specific to the type of instruments.

## PLC
The PLC block itself has 32 Input 'terminals', 32 Output 'terminals' and 32 Memory Registers. Each 16 bits.
There is also an EPROM slot.
The EPROM slot contains a chip-item that holds the program (to be edited or run).
Finally there is an on/off button in the GUI. When off, you can edit the program and when on, the program runs.
When editing a program it is immediately saved on the EPROM, but you must click the 'compile' button before it can be used.

You assign each input and output to an instrument on the same cable-network as the PLC.

## Terminal designations (Variables)
In order to access a 'terminal' you refer to it with a variable:

- Input terminals: `%I<type><number>`
- Output terminals: `%Q<type><number>`
- Memory registers: `%M<type><number>`

There are 3 types:

- `X` this is optional. Refers to a bit.
- `B` refers to a byte (8 bits).
- `W` refers to a word (16 bits).

You can refer to a specific bit with the syntax:

`%IX<number>.<bit>` E.g. `%IX12.5` will refer to bit 5 of input terminal 12.

or:

`%I<number>.<bit>`  E.g. `%I12.5` this is the same as above.

For bytes the syntax is:

`%IB<number>.<byte>` where byte=0 refers to the LSB and byte=1 to the MSB. E.g. `%IB8.1`

Finally:

`%IW<number>` refers to the whole word. E.g. `%IW28`

Obviously where `I` is used in these examples you can also use `Q` or `M`.

_An extensive Wiki (and perhaps in-game manual) will be added at a later date._
