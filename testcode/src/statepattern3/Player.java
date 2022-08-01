package statepattern3;

public class Player {
    private  PlayerLevel _level;

    public void play(int time) {
        _level.run();
        for(int i =0; i<time; i++) {
            _level.jump();
        }
        _level.turn();
        _level.go(1);
    }
    public Player() {
        _level = new BeginnerLevel();
    }
    public void upgradeLevel(PlayerLevel level) {
        _level= level;
    }
}
