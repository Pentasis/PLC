package pentasis.plc.core.plc;

import java.util.HashMap;
import java.util.Map;

/**
 * The DataBus is the backbone of the PLC. It is used by all the modules to communicate with each other.
 * It is probably not the most efficient way of programming this, but it does make it more readable and understandable.
 */
public class DataBus {

    private Memory ram;
    private Map<String, String> memoryTags;
    private Map<String, Object> data;

    public DataBus() {
        ram = new Memory();
        memoryTags = new HashMap<>();
        data = new HashMap<>();
    }

    public void tagMemoryAddress(String tag, String address) {
        memoryTags.put(tag, address);
    }

    public String[] getAddressTokens(String tag) {
        String[] tokens;
        if (tag.startsWith("#")) {
            tokens = tag.substring(1).split("\\:|\\.");
        } else {
            tokens = memoryTags.get(tag).split("\\:|\\.");
        }
        return tokens;
    }

}
