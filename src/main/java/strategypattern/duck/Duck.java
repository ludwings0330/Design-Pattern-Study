package strategypattern.duck;

import strategypattern.flybehavior.FlyBehavior;
import strategypattern.quackbehavior.QuackBehavior;

public abstract class Duck {
    // 날기, 수영, 울기, 생김새
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("수영은 공통 기능!");
    }
}
