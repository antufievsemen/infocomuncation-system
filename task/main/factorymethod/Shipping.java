package factorymethod;

class Shipping extends TransportService {
    public double tariff;

    public Shipping(String name, int taff) {
        super(name);
        tariff = taff;
    }

    public double costTransportation(double distance) {
        return distance * tariff;
    }

    public String toString() {
        return String.format("Фирма %s, доставка по тарифу %s", name, tariff);
    }
}
