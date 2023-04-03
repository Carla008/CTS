import java.util.Map;

public class AntibioticSolutionRecipe extends Recipe {
    private String name;
    private String description;
    private Map<String, Double> ingredients;

    public AntibioticSolutionRecipe(String name, String description, Map<String, Double> ingredients) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Map<String, Double> getIngredients() {
        return ingredients;
    }
}
