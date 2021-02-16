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

    public DataBus() {
        ram = new Memory();
        memoryTags = new HashMap<>();
    }

    public void tagMemoryAddress(String tag, String address) {
        if (tag.startsWith("#") || tag.startsWith("%")) {
            memoryTags.put(tag, address.substring(1));
        } else {
            memoryTags.put(tag, address); // TODO: this should never happen, if it does: Error.
        }
    }

    public String getAddress(String tag) {
        if (tag.startsWith("#") || tag.startsWith("%")) {
            return tag.substring(1);
        } else {
            return memoryTags.get(tag);
        }
    }

    public void setBit(String address, Boolean state) {
        address = getAddress(address);
        ram.setBit(address, state);
    }

    public void setWord(String address, Integer value) {
        address = getAddress(address);
        ram.setWord(address, value);
    }

    public void setValue(String address, Object value) {
        address = getAddress(address);
        ram.setValue(address, value);
    }

    public Boolean getBit(String address) {
        address = getAddress(address);
        return ram.getBit(address);
    }

    public Integer getWord(String address) {
        address = getAddress(address);
        return ram.getWord(address);
    }

    public Object getValue(String address) {
        address = getAddress(address);
        return ram.getValue(address);
    }

}
