package observer;

public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("number : " + generator.getNumber());
    }
}
