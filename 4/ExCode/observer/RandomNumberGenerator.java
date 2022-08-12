package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;
    public int getNumber() {
        return number;
    }
    public void execute() {
        number = random.nextInt(10) + 1;
        notifyObservers(); // 옵저버에게 정보 전송
    }
}
