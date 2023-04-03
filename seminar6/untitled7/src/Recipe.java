import java.util.Map;

public class Recipe {
    private String name;
    private Map<String, Double> ingredients;

    public Recipe(String name, Map<String, Double> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getIngredients() {
        return ingredients;
    }
}
