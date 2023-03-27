public class Main {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        // Order a cheese pizza
        Pizza cheesePizza = factory.createPizza(PizzaFactory.PizzaType.CHEESE);
        cheesePizza.prepare();


        // Order a pepperoni pizza
        Pizza pepperoniPizza = factory.createPizza(PizzaFactory.PizzaType.PEPPERONI);
        pepperoniPizza.prepare();


        // Order a vegetarian pizza
        Pizza vegetarianPizza = factory.createPizza(PizzaFactory.PizzaType.VEGETARIAN);
        vegetarianPizza.prepare();

    }

}
