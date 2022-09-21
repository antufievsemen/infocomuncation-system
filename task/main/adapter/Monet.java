package adapter;

import java.util.Random;

public class Monet {
    Random r;

    public Monet() {
        r = new Random();
    }

    public int brosokM() {
//Случаное число 1 или 2.
        return r.nextInt(2) + 1;
    }
}
