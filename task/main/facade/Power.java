package facade;

import java.beans.EventHandler;

public class Power {
    public EventHandler powerevent;
    private int _power;
    public int microwavePower;

    public void setMicropower(int power) {
        microwavePower = power;
        System.out.format("Задана мощность %s w ", microwavePower);
    }
}
