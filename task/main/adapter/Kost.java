package adapter;

import java.util.Random;

public class Kost implements IGame {
    Random r;

    public Kost() {
        r = new Random();
    }

    public int brosok() {
// Случайное число от 1 до 6.
        return r.nextInt(6) + 1;
    }
}
