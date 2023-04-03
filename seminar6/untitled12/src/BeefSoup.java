public class BeefSoup extends Soup {
    public BeefSoup(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepareSoup() {
        System.out.println("Preparing beef soup...");
        // add preparation steps here
    }

    // add more specific methods or properties here as needed
}
