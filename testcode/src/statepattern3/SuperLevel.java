package statepattern3;

public class SuperLevel implements PlayerLevel{
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
    public void showLevelMessage() {
        System.out.println("SuperLevel~!");
    }
}