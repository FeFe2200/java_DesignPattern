package command;

import java.util.HashMap;

public class RemoteControl {
    private HashMap<Integer, Command> onCommand = new HashMap<>();
    private HashMap<Integer, Command> offCommand = new HashMap<>();

    public void setCommand(int num, Command commandOn,Command commandOff){
        onCommand.put(num, commandOn);
        offCommand.put(num, commandOff);
    }

    public void onButtonWasPushed(int num){
        if (onCommand.get(num) != null)
            onCommand.get(num).execute();
    }

    public void offButtonWasPushed(int num){
        if (onCommand.get(num) != null)
            offCommand.get(num).execute();
    }
}
