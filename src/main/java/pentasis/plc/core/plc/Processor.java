package pentasis.plc.core.plc;

public class Processor {

    private DataBus dataBus;
    private String currentProgram;

    public Processor(DataBus dataBus) {
        this.dataBus = dataBus;
    }

    public void runProgram() {
        currentProgram = dataBus.getProgramFromMemory();
    }

}
