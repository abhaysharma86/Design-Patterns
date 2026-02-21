package creational_Patterns.prototype.with;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }
    public void loadData() {
        vehicleList.add("Honda City");
        vehicleList.add("Toyota Fortuner");
        vehicleList.add("Maruti Swift");
    }

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<String> getData(){
        return vehicleList;
    }

    @Override
    public Vehicle clone() {
        Vehicle vehicle = new Vehicle(this.vehicleList);
        return vehicle;
    }
}
