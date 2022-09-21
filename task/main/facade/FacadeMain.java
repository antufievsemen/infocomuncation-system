package facade;

import java.io.Console;

public class FacadeMain {

    public static void main(String[] args) {
        Drive drive = new Drive();
        Power power = new Power();
        Notification notification = new Notification();
        Microwave microwave = new Microwave(drive, power, notification);
        System.out.println("Приготовление еды");
        microwave.cook();
    }
}
