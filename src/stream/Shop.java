package stream;

import java.util.List;

public class Shop {
    private String name;
    private String address;
    List<String> workers;

    public Shop(String name, String address, List<String> workers) {
        this.name = name;
        this.address = address;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getWorkers() {
        return workers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workers=" + workers +
                '}';
    }

    public void setWorkers(List<String> workers) {
        this.workers = workers;
    }
}
