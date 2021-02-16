# Programmable Logic Controller (PLC)

Is a minecraft mod for automating your builds using the same technology as Real Life factories do.
It is based on [IEC 61131-3](https://en.wikipedia.org/wiki/IEC_61131-3) so it can be used as an educational tool as well.

Mind you, the educational value is to be seen as an introduction on the subject of PLCs. Minecraft is a game after all.

The main difference between this mod and mods like Steve's FactoryManager, RFTools Control and Integrated Dynamics, (besides implementing a realistic industry standard) is the way in which you handle signals.
This mod does not come with complex instructions or mnemonics to process e.g. NBT data. You will need instrumentation (e.g. sensors) that convert a situation or event into a digital signal (true or false).

The mod consists of signal cables, connectors, a PLC and a workstation.

**_I am looking for help/collaboration on this project. If you're interested and versed in Minecraft Modding; please message me._**

## Instrumentation
Instrumentation is anything that reads or writes information. E.g. buttons, switches, monitors, sensors, motors, etc.
For now, the only instrument this mod comes with is a Redstone Connector. In future there will be more instruments and an API so others can extend it.

Instruments connect to Signal Cables and have a designed amount of Input/Output signals. 

Each Instrument is automatically given an ID `C<number>` where `<number>` is sequential (C stands for Connector, but other letters can be used e.g. B for Button, V for Valve, S for Sensor, etc.).

Each Instrument has a gui where it can be given an alphanumeric name by the player.

## Signals & Redstone
The redstone connector has 2 input (read) signals and 2 output (write) signals: A digital redstone_signal and an analogue redstone_value. The digital signal is True when there is a redstone signal of any value. The analogue signal holds the actual value (0-15);

## PLC
The PLC block itself has 2 Digital Input Modules, 2 Digital Output Modules, 2 Analogue Input Modules and 2 Analogue Output Modules. Each module can be connected to 16 signals (wires) on the same network.

There is also a Power Supply Unit (PSU) which can be enabled in the config file (disabled by default).
The PSU has an on/off button.

## Workstation
The workstation has two modes:
- Operator mode. Here you can see and control the process.
- Engineer mode. Used for writing the program.

## Terminal designations (Variables)
In order to access a 'terminal' you refer to it with a variable using the following syntax:

`%<D/A><type><number>.<designator>`

`D` or `A` stand for Digital and Analogue respectively.

`<type>` can be:
- `I` for Input terminals.
- `Q` for Output terminals.
- `M` for Memory registers.

`<number>` is either the number of the I/O module or a memory location.

`<designator>` is the bit or 'wire' or 'terminal'.

Examples:
- `%DI0.3` refers to bit (terminal) 3 on digital input module 0.
- `%AI1.3` refers to signal (terminal) 3 on analogue input module 1.
- `%DQ1.14` refers to bit (terminal) 14 on digital output module 1.
- `%AM290` refers to the analogue value in memory location 290.

However, Input and Output terminals will get a name automatically as you connect them to signals. E.g.

If you assign the digital redstone_signal of a redstone connector with id C12 to terminal 8 of module 0 it will assign %DI0.8 the name/tag `C12:redstone_signal`.
In the GUI of the memory module you can assign names to each memory location.

## IEC 61131-3
This is the industry standard. The current (3rd) edition is from 2012 but I have chosen to use the 2nd edition for 2 reasons:
- Most of the PLCs currently used in the real world work with the 2nd edition. Only newer devices will have implemented the newer instructions from the 3rd edition. Besides, the 3rd edition is backwards compatible.
- Most tutorials and articles online use the 2nd edition.

That said; Minecraft is a game and things differ from real life. As such I had to make some choices and this is not a perfect 1:1 emulation of real life PLCs. But it does teach you the basics and the concepts of how PLCs work and how you can program them.

In my defence: every PLC manufacturer implements things differently as well. I used the SLC 500 series from Allen-Bradley as a base reference.

## TODO
- Work towards a first alfa release with just Structural Text programming
- Based on gameplay and feedback improve until beta. Then:
- Add Ladder Diagram programming
- Add Function Block programming
- Add Sequential function chart programming
- Add SCADA (to workstation) and multiblock monitors ????
- Add Field Juncion Boxes & Marshalling Cabinets ????
- In-game manual/reference
- Wiki
- Add instrumentation like sensors, multi-lights, buttons, etc.

**I want this to be a quality mod with nice models, textures and an intuitive UX. But it is a big project and I am looking for help/collab on this.**
