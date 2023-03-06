public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bicicleta conduce.");
    }

    @Override
    public void stop() {
        System.out.println("Bicicleta se oprește.");
    }

    @Override
    public void refuel() {
        System.out.println("Bicicleta este alimentată.");
    }

    @Override
    public void openDoors() {
        // Bikes do not have doors to open, so this method is empty
    }
}
