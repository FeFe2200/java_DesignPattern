package observer;

public class GraphObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        for(int i = 0;i < generator.getNumber();i++){
            for(int j = 0;j < generator.getNumber();j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

