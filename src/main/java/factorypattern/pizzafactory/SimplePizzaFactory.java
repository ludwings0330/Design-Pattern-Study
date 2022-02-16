package factorypattern.pizzafactory;

import factorypattern.NYPizzaIngredientFactory;
import factorypattern.PizzaIngredientFactory;
import factorypattern.pizza.CheesePizza;
import factorypattern.pizza.Pizza;
import factorypattern.pizza.PotatoPizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(new NYPizzaIngredientFactory());
        } else if (type.equals("potato")) {
            pizza = new PotatoPizza();
        }

        return pizza;
    }
}
