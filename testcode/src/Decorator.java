abstract class Coffee { //public abstract class Coffee
    protected String coffeeName;

    public abstract void makeCoffee();
    public String getCoffeeName() {
        return coffeeName;
    }
}

class KenyaAmericano extends Coffee { //public class KenyaAmericano extends Coffee
    public KenyaAmericano() {
        coffeeName = "KenyaAmericano";
    }

    @Override
    public void makeCoffee() {
        System.out.print(coffeeName);
    }
}

class EtiopiaAmericano extends Coffee { //public class EtiopiaAmericano extends Coffee
    public EtiopiaAmericano() {
        coffeeName = "EtiopiaAmericano";
    }

    @Override
    public void makeCoffee() {
        System.out.print(coffeeName);
    }
}

class CoffeeMachine { //public class CoffeeMachine
    private Coffee orderCoffeeName;

    public void orderCoffee(Coffee order){
        this.orderCoffeeName = order;
    }

    public void makeingCoffee(){
        if (orderCoffeeName == null)
            return ;
        orderCoffeeName.makeCoffee();
        System.out.println();
    }
}

class CoffeeDcorator extends Coffee { //public class CoffeeMmachineDcorator extends Coffee
    public Coffee coffee;

    public CoffeeDcorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        // 서브클래스 구현
    }
}

class addMilk extends CoffeeDcorator { //public class addMilk extends CoffeeDcorator
    public addMilk(Coffee coffee){
        super(coffee);
        coffeeName = coffee.getCoffeeName();
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
        System.out.print(" Adding Milk");
    }
}

class addMochaSyrup extends CoffeeDcorator { //public class addMilk extends CoffeeDcorator
    public addMochaSyrup(Coffee coffee){
        super(coffee);
        coffeeName = coffee.getCoffeeName();
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
        System.out.print(" Adding Mocha Syrup");
    }
}

class addWhippedCream extends CoffeeDcorator { //public class addMilk extends CoffeeDcorator
    public addWhippedCream(Coffee coffee){
        super(coffee);
        coffeeName = coffee.getCoffeeName();
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
        System.out.print(" Adding WhippedCream");
    }
}

public class Decorator {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.orderCoffee(new KenyaAmericano());
        coffeeMachine.makeingCoffee();
        coffeeMachine.orderCoffee(new addMilk(new KenyaAmericano()));
        coffeeMachine.makeingCoffee();
        coffeeMachine.orderCoffee(new addMochaSyrup(new addMilk(new KenyaAmericano())));
        coffeeMachine.makeingCoffee();
        coffeeMachine.orderCoffee(new addWhippedCream(new addMochaSyrup(new addMilk(new EtiopiaAmericano()))));
        coffeeMachine.makeingCoffee();
    }
}
