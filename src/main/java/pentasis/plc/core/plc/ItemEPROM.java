package pentasis.plc.core.plc;

import net.minecraft.item.Item;

public class ItemEPROM extends Item {

    private int program_id;
    private char program_type;
    private char program_name;
    private char program_src;
    private char program_compiled;

    public ItemEPROM(Properties properties) {
        super(properties);
    }

    public int getProgram_id() {
        return program_id;
    }

    public void setProgram_id(int program_id) {
        this.program_id = program_id;
    }

    public char getProgram_name() {
        return program_name;
    }

    public void setProgram_name(char program_name) {
        this.program_name = program_name;
    }

    public char getProgram_compiled() {
        return program_compiled;
    }

    public void setProgram_compiled(char program_compiled) {
        this.program_compiled = program_compiled;
    }

    public char getProgram_type() {
        return program_type;
    }

    public void setProgram_type(char program_type) {
        this.program_type = program_type;
    }

    public char getProgram_src() {
        return program_src;
    }

    public void setProgram_src(char program_src) {
        this.program_src = program_src;
    }
}
