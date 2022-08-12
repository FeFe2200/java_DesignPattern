package templatemethod;

public abstract class Car {
    abstract void startCar();
    abstract void drive();
    abstract void stop();
    abstract void turnOff();

    void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }

}
