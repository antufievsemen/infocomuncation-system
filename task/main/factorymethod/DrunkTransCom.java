package factorymethod;

public class DrunkTransCom extends TransportCompany{

    public DrunkTransCom(String n) {
        super(n);
    }

    @Override
    public TransportService create(String n, int k) {
        return new DrunkServices(n, k);
    }
}
