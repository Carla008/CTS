public class PizzaFactory {

    public enum PizzaType {
        CHEESE,
        PEPPERONI,
        VEGETARIAN
    }

    public static Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case VEGETARIAN:
                return new VegetarianPizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
