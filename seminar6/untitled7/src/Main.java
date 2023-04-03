import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RecipeFactory recipeFactory = new RecipeFactory();
        Map<String, Double> ingredients = new HashMap<>();
        ingredients.put("Solution A", 10.0);
        ingredients.put("Solution B", 5.0);

        // Create a new recipe object for "Medication X"
        Recipe recipe1 = recipeFactory.createRecipe("Medication X", ingredients);
        System.out.println("Created new recipe: " + recipe1.getName());

        // Try to create another recipe object for "Medication X" with the same ingredients
        Recipe recipe2 = recipeFactory.createRecipe("Medication X", ingredients);
        System.out.println("Reusing existing recipe: " + recipe2.getName());

        // Create a new recipe object for "Medication Y" with different ingredients
        Map<String, Double> newIngredients = new HashMap<>();
        newIngredients.put("Solution C", 8.0);
        Recipe recipe3 = recipeFactory.createRecipe("Medication Y", newIngredients);
        System.out.println("Created new recipe: " + recipe3.getName());
    }
}
