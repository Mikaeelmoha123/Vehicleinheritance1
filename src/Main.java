public class Main {
    public static void main(String[] args) {
        Car corolla = new Car("Toyota", "Corolla", "Saloon", 4, "Petrol");
        Motorcycle harley = new Motorcycle("Harley-Davidson", "Sportster", false, 2);
        Bus cityBus = new Bus("Mercedes", "Sprinter", 20, "Diesel");
        Trailer cargoTrailer = new Trailer("Utility", "Flatbed", 10.5, true);
        Boat speedBoat = new Boat("Bavaria", "Sundancer", 8.5, "Outboard Motor");

        corolla.displayVehicleInfo();
        harley.displayVehicleInfo();
        cityBus.displayVehicleInfo();
        cargoTrailer.displayVehicleInfo();
        speedBoat.displayVehicleInfo();
    }
}
