package templatemethodpattern;

public abstract class CaffeineBeverageWithHook {
    final void make() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
