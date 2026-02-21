package creational_Patterns.builderPattern.with;

public class Application {
    public static void main(String[] args) {
        Pizza large = new Pizza.PizzaBuilder("large").addPepperoni().build();
        System.out.println(large);

        Pizza small = new Pizza.PizzaBuilder("small").addPepperoni().addCheese().build();
        System.out.println(small);
    }
}
