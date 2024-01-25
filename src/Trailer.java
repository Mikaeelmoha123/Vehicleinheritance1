public class Trailer extends Vehicle {
    private double loadCapacity;
    private boolean hasBrakes;

    public Trailer(String make, String model, double loadCapacity, boolean hasBrakes) {
        super(make, model, "Trailer");
        this.loadCapacity = loadCapacity;
        this.hasBrakes = hasBrakes;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons, Has Brakes: " + hasBrakes);
        System.out.println("*******************************************************************");
    }


}
