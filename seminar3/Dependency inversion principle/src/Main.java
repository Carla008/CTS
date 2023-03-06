public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();

        Car car1 = new Car(petrolEngine);
        Car car2 = new Car(dieselEngine);

        car1.start();
        car2.start();
    }
}
