package creational_Patterns.prototype.with;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.loadData();
        System.out.println(vehicle.getData());


        Vehicle clone = vehicle.clone();
        List<String> data = clone.getData();
        data.add("Hyundai Verna");
        System.out.println(data);

    }
}
