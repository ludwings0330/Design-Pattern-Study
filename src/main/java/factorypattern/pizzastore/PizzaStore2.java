package factorypattern.pizzastore;

import factorypattern.pizza.Pizza;

public abstract class PizzaStore2 {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
