public class Bus extends Vehicle {
    private int seatingCapacity;
    private String fuelType;

    public Bus(String make, String model, int seatingCapacity, String fuelType) {
        super(make, model, "Bus");
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
        System.out.println("*******************************************************************");
    }
}
