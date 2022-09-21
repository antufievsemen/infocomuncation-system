package adapter;

public class Main {
    public static void main(String[] args) {
        Kost kubik = new Kost();
        Gamer g1 = new Gamer("Иван");
        System.out.printf("Выпало очков %s для игрока %s", g1.seansGame(kubik), g1.toString());
        System.out.println();

        Monet mon = new Monet();
        IGame bmon = new AdapterGame(mon);
        System.out.printf("Монета показала %s для игрока %s", g1.seansGame(bmon), g1.toString());
    }
}
