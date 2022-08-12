package templatemethod;

public class ManualCar extends Car{
    @Override
    void startCar() {
        System.out.println("시동을 켭니다");
    }

    @Override
    void drive() {
        System.out.println("사람이 운전합니다.");
    }

    @Override
    void stop() {
        System.out.println("사람이 핸들을 조작합니다.");
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

    @Override
    void turnOff() {
        System.out.println("시동을 끕니다.");
    }
}
