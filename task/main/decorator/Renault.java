package decorator;

public class Renault extends AutoBase {
    public Renault(String name, String info, double costbase) {
        this.name = name;
        this.description = info;
        this.costBase = costbase;
    }

    public double getCost() {
        return costBase * 1.18;
    }
}
