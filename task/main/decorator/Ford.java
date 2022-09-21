package decorator;

public class Ford extends AutoBase {
    public Ford(String name, String info, double costbase) {
        this.name = name;
        this.description = info;
        this.costBase = costbase;
    }

    public double getCost() {
        return costBase * 1.88;
    }
}