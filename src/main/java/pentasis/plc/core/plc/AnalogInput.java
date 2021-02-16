package pentasis.plc.core.plc;

public class AnalogInput {

    private Object[] module_0 ;
    private Object[] module_1 ;

    public AnalogInput() {
        module_0 = new Object[16];
        module_1 = new Object[16];
    }

    public Object[] readModule0() {
        return module_0;
    }

    public Object[] readModule1() {
        return module_1;
    }
}
