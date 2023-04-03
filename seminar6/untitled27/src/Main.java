public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .setBun("chifla")
                .setMeat("beef")
                .setCondiments("mayo")
                .setVegetables("lettuce")
                .build();
        System.out.println(burger.toString());

    }
}