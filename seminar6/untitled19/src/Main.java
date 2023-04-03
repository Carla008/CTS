import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a RecipeFactory instance
        RecipeFactory factory = new RecipeFactory();

        // Create a PainKillerRecipe using the factory
        Recipe painKiller = factory.createRecipe("PainKiller");

        // Output the details of the PainKillerRecipe
        System.out.println("Recipe Name: " + painKiller.getName());
        System.out.println("Recipe Description: " + painKiller.getDescription());
        System.out.println("Recipe Ingredients: " + painKiller.getIngredients());
        // Create an AntibioticSolutionRecipe using the factory
        Recipe antibioticSolution = factory.createRecipe("AntibioticSolution");

// Output the details of the AntibioticSolutionRecipe
        System.out.println("Recipe Name: " + antibioticSolution.getName());
        System.out.println("Recipe Description: " + antibioticSolution.getDescription());
        System.out.println("Recipe Ingredients: " + antibioticSolution.getIngredients());

    }
}
