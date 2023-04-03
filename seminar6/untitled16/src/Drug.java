public class Drug {
    private String name;
    private double price;
    private DrugCategory category;

    public Drug(String name, double price, DrugCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DrugCategory getCategory() {
        return category;
    }
}
