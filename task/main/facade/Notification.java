package facade;

import java.beans.EventHandler;

public class Notification {
    public EventHandler notificationevent;
    private String mess;

    public void StartNotification() {
        System.out.println(mess = "Операция началась");
    }

    public void StopNotification() {
        System.out.println(mess = "Операция завершена");
    }

    public String toString() {
        return String.format("Информация: %s", mess);
    }
}
