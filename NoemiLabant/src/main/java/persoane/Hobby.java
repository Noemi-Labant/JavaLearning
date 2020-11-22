package persoane;

import java.util.LinkedList;
import java.util.List;

public class Hobby {
    private String hobbyName;
    private int frequency;
    private List<Address> addresses;

    public Hobby(String hobbyName, int frequency, List<Address> addresses) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
