package templatemethod;

public abstract class Car {
    void startCar() { //hook메서드
        System.out.println("시동을 켭니다");
    }

    abstract void drive();
    abstract void stop();

    void turnOff() { //hook메서드
        System.out.println("시동을 끕니다.");
    }

    final void run(){ // 템플릿 메서드
        startCar();
        drive();
        stop();
        turnOff();
    }

}
