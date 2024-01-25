public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int numberOfWheels;

    public Motorcycle(String make, String model, boolean hasSidecar, int numberOfWheels) {
        super(make, model, "Motorcycle");
        this.hasSidecar = hasSidecar;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Has Sidecar: " + hasSidecar + ", Number of Wheels: " + numberOfWheels);
        System.out.println("*******************************************************************");
    }


}
