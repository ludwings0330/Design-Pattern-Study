package factorypattern.pizzastore;

import factorypattern.pizza.CheesePizza;
import factorypattern.pizza.Pizza;
import factorypattern.pizzafactory.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory facotry;

    public PizzaStore(SimplePizzaFactory facotry) {
        this.facotry = facotry;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = facotry.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
