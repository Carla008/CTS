public class VehicleValueCalculator {
    private static final double MAX_VALUE = 10000.0;
    private static final double DEPRECIATION_RATE = 0.0001;

    public double calculateValue(Vehicle vehicle) {
        double mileage = (double) vehicle.getMileage();
        double value = MAX_VALUE - (mileage * DEPRECIATION_RATE);
        return (value < 0) ? 0 : value;
    }
}
