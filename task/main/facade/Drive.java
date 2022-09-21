package facade;


import java.beans.EventHandler;

public class Drive {
    public EventHandler driveevent;
    private String twist;

    public Drive() {
        System.out.println(twist = "исходная позиция");
    }

    public void TurlLeft() {
        System.out.println(twist = "Поверот налево");
    }

    public void TurlRight() {
        System.out.println(twist = "Поверот направо");
    }

    public void Stop() {
        System.out.println(twist = "Стоп");
    }

    public String toString() {
        return String.format("Привод: %s", twist);
    }
}

