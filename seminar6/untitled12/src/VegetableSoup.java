public class VegetableSoup extends Soup {
    public VegetableSoup(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepareSoup() {
        System.out.println("Preparing vegetable soup...");
    }

    // add more specific methods or properties here as needed
}
