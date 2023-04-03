public class DrugImpl implements Drug {
    private final String name;
    private final double price;
    private final DrugCategory category;

    private DrugImpl(String name, double price, DrugCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public static DrugImpl create(String name, double price, String categoryName) {
        DrugCategory category = DrugCategory.fromName(categoryName);
        if (category == null) {
            throw new IllegalArgumentException("Invalid category name: " + categoryName);
        }
        return new DrugImpl(name, price, category);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public DrugCategory getCategory() {
        return category;
    }
}
