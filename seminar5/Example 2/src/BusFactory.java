public class BusFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Bus();
    }
}
