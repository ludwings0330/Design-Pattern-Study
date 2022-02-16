package strategypattern.duck;

import strategypattern.flybehavior.FlyBehavior;
import strategypattern.flybehavior.FlyWithRocket;
import strategypattern.quackbehavior.QuackBehavior;
import strategypattern.quackbehavior.SQuack;

public class RocketDuck extends Duck {

    public RocketDuck() {
        super(new FlyWithRocket(), new SQuack());
    }

    @Override
    public void display() {
        System.out.println("로봇모양을 하고 있어요..");
    }
}
