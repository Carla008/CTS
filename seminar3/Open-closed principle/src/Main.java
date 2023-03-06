public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setValue(10000.0);

        Vehicle bike = new Bike();
        bike.setValue(5000.0);

        Vehicle truck = new Truck();
        truck.setValue(20000.0);

        VehicleCalculations calculations = new VehicleCalculations();
        double carValue = calculations.calculateValue(car);
        double bikeValue = calculations.calculateValue(bike);
        double truckValue = calculations.calculateValue(truck);

        System.out.println("Valoarea mașinii: " + carValue);
        System.out.println("Valoarea bicicletei: " + bikeValue);
        System.out.println("Valoarea camionului: " + truckValue);
    }
}
