import java.util.ArrayList;
import java.util.List;

public class Soup {
    private final String name;
    private final List<String> ingredients;
    private final int calories;

    private Soup(Builder builder) {
        this.name = builder.name;
        this.ingredients = builder.ingredients;
        this.calories = builder.calories;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public static class Builder {
        private final String name;
        private final List<String> ingredients;
        private int calories;

        public Builder(String name) {
            this.name = name;
            this.ingredients = new ArrayList<>();
        }

        public Builder addIngredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Soup build() {
            return new Soup(this);
        }
    }
}
