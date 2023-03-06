public class VehicleDetailsPrinter {
    public void printDetails(Vehicle vehicle) {
        System.out.println("Producător: " + vehicle.getMaker());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("An: " + vehicle.getYear());
        System.out.println("Kilometraj: " + vehicle.getMileage() + " kilometri");
    }
}