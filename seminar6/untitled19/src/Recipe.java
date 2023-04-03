import java.util.Map;

public abstract class Recipe {
    // Define abstract methods for getting recipe details
    public abstract String getName();

    public abstract String getDescription();

    public abstract Map<String, Double> getIngredients();
}
