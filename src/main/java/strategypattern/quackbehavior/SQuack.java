package strategypattern.quackbehavior;

public class SQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삒!!!");
    }
}
