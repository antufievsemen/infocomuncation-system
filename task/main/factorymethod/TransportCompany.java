package factorymethod;

public abstract class TransportCompany {
    public String name;

    public TransportCompany(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

    abstract public TransportService create(String n, int k);
}
