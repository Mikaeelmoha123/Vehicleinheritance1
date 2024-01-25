public class Vehicle {
    private String make;
    private String model;
    private String type;

    public Vehicle(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Make: " + make + ", Model: " + model + ", Type: " + type);
    }


}
