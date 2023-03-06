public class Main {
    public static void main(String[] args) {
        // Create a new vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setMaker("Toyota");
        vehicle.setModel("Camry");
        vehicle.setYear(2010);
        vehicle.setMileage(100000);

        // Print the details of the vehicle
        VehicleDetailsPrinter printer = new VehicleDetailsPrinter();
        printer.printDetails(vehicle);

        // Calculate the value of the vehicle
        VehicleValueCalculator calculator = new VehicleValueCalculator();
        double value = calculator.calculateValue(vehicle);
        System.out.println("Valoarea vehiculului este: $" + value);

        // Add the vehicle to the database
        VehicleDBHandler dbHandler = new VehicleDBHandler();
        dbHandler.addVehicleToDB(vehicle);
    }

}