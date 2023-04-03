import java.util.HashMap;

public class RecipeFactory {
    public Recipe createRecipe(String type) {
        Recipe recipe = null;
        if (type.equals("PainKiller")) {
            recipe = new PainKillerRecipe("Pain Killer", "A recipe for pain relief", new HashMap<String, Double>());
        } else if (type.equals("AntibioticSolution")) {
            recipe = new AntibioticSolutionRecipe("Antibiotic Solution", "A recipe for fighting bacterial infections", new HashMap<String, Double>());
        }
        return recipe;
    }
}
