package factorymethod;

public class ShipTransCom extends TransportCompany {

    public ShipTransCom(String n) {
        super(n);
    }

    @Override
    public TransportService create(String n, int k) {
        return new Shipping(n, k);
    }
}
