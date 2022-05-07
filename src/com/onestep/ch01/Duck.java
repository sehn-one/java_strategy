package com.onestep.ch01;

// 헤드퍼스트 디자인 패턴
// ch 01 디자인 패턴 소개와 전략 패턴

public abstract class  Duck{
    // 행동 인터페이스 형식의 레퍼런스 변수 2개를 선언합니다.
    // 같은 패키지에 속하는 모든 서브클래스에서 이 변수를 상속 받습니다.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public abstract  void display();
    public void performFly(){
        // 해당클래스에 위임합니다.
        flyBehavior.fly();
    }
    public void performQuack(){
        // 해당클래스에 위임합니다.
        quackBehavior.quack();
    }

    // 동적으로 행동을 지정하기
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }
}