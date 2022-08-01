package statepattern3;

public interface PlayerLevel {
    void run();
    void jump();
    void turn();
    void showLevelMessage();

    default void go(int step)
    {
        System.out.println(step +" 걸음 전진");
    }

}
