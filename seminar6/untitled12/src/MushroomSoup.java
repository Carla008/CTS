public class MushroomSoup extends Soup {
    public MushroomSoup(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepareSoup() {
        System.out.println("Preparing mushroom soup...");
        // add preparation steps here
    }

    // add more specific methods or properties here as needed
}
