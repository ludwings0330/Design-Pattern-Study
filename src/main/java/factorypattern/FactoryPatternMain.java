package factorypattern;

import factorypattern.pizza.Pizza;
import factorypattern.pizzafactory.SimplePizzaFactory;
import factorypattern.pizzastore.PizzaStore;

public class FactoryPatternMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }
}
