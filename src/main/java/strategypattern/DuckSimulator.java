package strategypattern;

import strategypattern.duck.Duck;
import strategypattern.duck.RocketDuck;

public class DuckSimulator {
    public static void main(String[] args) {

        Duck duck = new RocketDuck();

        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
