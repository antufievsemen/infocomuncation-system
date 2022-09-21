package factorymethod;

public class TaxiServices extends TransportService {
    public int category;

    public TaxiServices(String name, int cat) {
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
