package strategypattern.flybehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓으로 날아갑니다~~");
    }
}
