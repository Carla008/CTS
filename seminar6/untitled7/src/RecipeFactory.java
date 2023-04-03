import java.util.HashMap;
import java.util.Map;

public class RecipeFactory {
    private Map<String, Recipe> recipeMap = new HashMap<>();

    public Recipe createRecipe(String name, Map<String, Double> ingredients) {
        Recipe recipe = recipeMap.get(name);
        if (recipe == null) {
            recipe = new Recipe(name, ingredients);
            recipeMap.put(name, recipe);
        }
        return recipe;
    }
}
