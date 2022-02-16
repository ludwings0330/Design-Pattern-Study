package strategypattern.quackbehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽊!!");
    }
}
