package factorymethod;

public abstract class TransportService {
    public String name;

    public TransportService(String name) {
        this.name = name;
    }

    abstract public double costTransportation(double distance);
}
