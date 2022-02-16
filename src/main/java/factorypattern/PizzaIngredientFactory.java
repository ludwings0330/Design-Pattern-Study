package factorypattern;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
}
