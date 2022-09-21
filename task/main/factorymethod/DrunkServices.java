package factorymethod;

public class DrunkServices extends TransportService {
    public int category;

    public DrunkServices(String name, int cat) {
        super(name);
        category = cat;
    }

    public double costTransportation(double distance) {
        return distance * category;
    }

    public String toString() {
        return String.format("Фирма %s, поездка категории %s", name, category);
    }
}
