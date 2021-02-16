package pentasis.plc.core.plc;

public class AnalogOutput {

    private Object[] module_0 ;
    private Object[] module_1 ;

    public AnalogOutput() {
        module_0 = new Object[16];
        module_1 = new Object[16];
    }

    public void writeModule0(Object[] output) {
        module_0 = output;
    }

    public void writeModule1(Object[] output) {
        module_1 = output;
    }
}
