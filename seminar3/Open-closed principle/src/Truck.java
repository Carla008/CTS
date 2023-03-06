public class Truck extends Vehicle {
    @Override
    public double calculateValue() {
        return getValue() * 0.9;
    }
}
