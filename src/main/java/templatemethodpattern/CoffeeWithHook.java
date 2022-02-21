package templatemethodpattern;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕 우유를 추가하는 중");
    }

    @Override
    protected boolean customerWantsCondiments() {
        /**
         * 고객이 우유나 설탕을 원하는지 check 하는 기능
         */
        return true;
    }
}
