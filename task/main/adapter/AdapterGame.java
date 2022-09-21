package adapter;

public class AdapterGame implements IGame {
    Monet mot;

    public AdapterGame(Monet mt) {
        mot = mt;
    }

    public int brosok() {
        return mot.brosokM();
    }
}
