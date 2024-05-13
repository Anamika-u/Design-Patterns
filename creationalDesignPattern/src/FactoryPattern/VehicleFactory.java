package FactoryPattern;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        return switch (type) {
            case "Bus" -> new Bus();
            case "Truck" -> new Truck();
            case "Car" -> new Car();
            default -> new Car();
        };
    }
}
