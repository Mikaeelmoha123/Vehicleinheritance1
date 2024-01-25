public class Boat extends Vehicle {
    private double length;
    private String propulsionType;

    public Boat(String make, String model, double length, String propulsionType) {
        super(make, model, "Boat");
        this.length = length;
        this.propulsionType = propulsionType;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Length: " + length + " meters, Propulsion Type: " + propulsionType);
        System.out.println("*******************************************************************");
    }


}
