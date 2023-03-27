public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.start();
        bike.stop();

        VehicleFactory busFactory = new BusFactory();
        Vehicle bus = busFactory.createVehicle();
        bus.start();
        bus.stop();
    }
}
