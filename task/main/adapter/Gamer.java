package adapter;

public class Gamer {
    public String name;

    public Gamer(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int seansGame(IGame ig) {
        return ig.brosok();
    }
}
