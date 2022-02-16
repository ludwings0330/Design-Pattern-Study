package factorypattern.pizzastore;

import factorypattern.NYPizzaIngredientFactory;
import factorypattern.pizza.CheesePizza;
import factorypattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore2 {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(new NYPizzaIngredientFactory());
        }

        throw new RuntimeException(type + " is not exist");
    }
}
