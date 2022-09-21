package factorymethod;

public class TaxiTransCom extends TransportCompany{

    public TaxiTransCom(String n) {
        super(n);
    }

    @Override
    public TransportService create(String n, int k) {
        return new TaxiServices(n, k);
    }
}
