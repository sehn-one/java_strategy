package com.onestep.ch01;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("=========");
        // 생성자에서 설정되었던 flyBehavior : noway 인스턴스의 fly 가 호출됨
        Duck model = new ModelDuck();
        model.performFly();
        // 상속받은 행동 세터 메서드가 호출되어 로켓 추진력으로 오리가 날게됨
        // 동적으로 나는 행동을 바꿀수 있음 -> 실행중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 Duck 의 세터 메서드를 호출
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
