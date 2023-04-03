public class Main {
    public static void main(String[] args) {
        Soup vegetableSoup = new Soup.Builder("Vegetable Soup")
                .addIngredient("carrots")
                .addIngredient("celery")
                .addIngredient("potatoes")
                .calories(150)
                .build();

        Soup mushroomSoup = new Soup.Builder("Mushroom Soup")
                .addIngredient("mushrooms")
                .addIngredient("onions")
                .calories(200)
                .build();

        Soup beefSoup = new Soup.Builder("Beef Soup")
                .addIngredient("beef")
                .addIngredient("carrots")
                .addIngredient("potatoes")
                .calories(300)
                .build();

        System.out.println("Soup Name: " + vegetableSoup.getName());
        System.out.println("Ingredients: " + vegetableSoup.getIngredients());
        System.out.println("Calories: " + vegetableSoup.getCalories());

        System.out.println("Soup Name: " + mushroomSoup.getName());
        System.out.println("Ingredients: " + mushroomSoup.getIngredients());
        System.out.println("Calories: " + mushroomSoup.getCalories());

        System.out.println("Soup Name: " + beefSoup.getName());
        System.out.println("Ingredients: " + beefSoup.getIngredients());
        System.out.println("Calories: " + beefSoup.getCalories());
    }
}
