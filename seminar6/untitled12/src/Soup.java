public abstract class Soup {
    private String name;
    private double price;

    public Soup(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void prepareSoup();

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
