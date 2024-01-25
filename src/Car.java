public class Car extends Vehicle {
    private int numberOfDoors;
    private String engineType;

    public Car(String make, String model, String type, int numberOfDoors, String engineType) {
        super(make, model, type);
        this.numberOfDoors = numberOfDoors;
        this.engineType = engineType;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors + ", Engine Type: " + engineType);
        System.out.println("*******************************************************************");
    }


}
