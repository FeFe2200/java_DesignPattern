package templatemethod;

public class AICar extends Car{
    @Override
    void startCar() {
        System.out.println("시동을 켭니다");
    }

    @Override
    void drive() {
        System.out.println("자율 주행합니다.");
    }

    @Override
    void stop() {
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
        System.out.println("스스로 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("시동을 끕니다.");
    }
}
