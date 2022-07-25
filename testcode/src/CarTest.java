abstract class Car { //public abstract class Car {
    String productName;
    public Car(String productName) {
        this.productName = productName;
    }
    public String toString() {
        return productName;
    }

    public abstract void startTheCar();
}

class SonataCar extends Car { //public class SonataCar extends Car {
    public SonataCar(){
        super("Sonata");
    }

    @Override
    public void startTheCar() {
        System.out.println("Sonaaa~!");
    }
}

class GrandeurCar extends Car { //public class GrandeurCar extends Car {
    public GrandeurCar(){
        super("Grandeur");
    }

    @Override
    public void startTheCar() {
        System.out.println("Gran~!");
    }
}

class GenesisCar extends Car { //public class GenesisCar extends Car {
    public GenesisCar(){
        super("Genesis");
    }

    @Override
    public void startTheCar() {
        System.out.println("Gen~!");
    }
}

abstract class CarFactory { //public abstract class CarFactory

    public abstract Car produceCar(String name);
}

class HundaiCarFactory extends CarFactory {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    public Car produceCar(String name) {
        Car car = null;
        if( name.equalsIgnoreCase(SONATA)) {
            car = new SonataCar();
        }
        else if( name.equalsIgnoreCase(GRANDEUR)) {
            car = new GrandeurCar();
        }
        else if( name.equalsIgnoreCase(GENESIS)) {
            car = new GenesisCar();
        }
        return car;
    }
    //싱글톤 적용
    /*
    private HundaiCarFactory() {}
    private static HundaiCarFactory hundaiCarFactory = new HundaiCarFactory();
     public static Car produceCar(String name) { // 추상화 클래스에서는 static 불가
     */

}


public class CarTest {
    public static void main(String[] args) {
        CarFactory carFactory = new HundaiCarFactory();
        Car car = carFactory.produceCar("Sonata");
        //싱글톤 적용, 현재 static 때문에 안됨, 추상화클래스를 제거, 혹은 추상화 클래스 에서 추상화메소드 제거(내용물 없는데?), 새로운 store클래스 선언?(공장도 1개여야....)
        /*
        Car car = HundaiCarFactory.produceCar("Sonata");
        */
        System.out.println(car.toString());
    }

}