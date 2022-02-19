package decoratorpattern;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        info(beverage);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);

        beverage2 = new Whip(beverage2);

        info(beverage2);
    }

    public static void info(Beverage beverage) {
        System.out.println(beverage.getDescription() + " : $" + beverage.cost());
    }
}
