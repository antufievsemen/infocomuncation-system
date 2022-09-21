package abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        Client c1 = new Client(audiFactory);
        System.out.println(("Максимальная скорость {0} составляет {1} км/час " + c1.toString() + " " + c1.RunMaxSpeed() + c1.getCusov()));

        final CarFactory fordFactory = FordFactory.getFordFactory();
        final Client client = new Client(fordFactory);
        System.out.println(("Максимальная скорость {0} составляет {1} км/час " + client.toString() + " " + client.RunMaxSpeed() + client.getCusov()));
    }
}
