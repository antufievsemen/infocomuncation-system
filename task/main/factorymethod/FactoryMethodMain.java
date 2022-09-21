package factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        double dist = 15.5;
        TransportCompany trCom = new TaxiTransCom("Служба такси");
        TransportService compService = trCom.create("Такси", 1);
        TransportCompany gCom = new ShipTransCom("Служба перевозок");
        TransportService compService2 = gCom.create("Грузоперевозки", 1);
        TransportCompany drunkTransCom = new DrunkTransCom("Служба пьяных перевозок");
        TransportService drunkService = drunkTransCom.create("Пьяный водитель", 1);
        print(compService, dist);
        print(compService2, dist);
        print(drunkService, dist);
    }

    public static void print(TransportService transportService, double dist) {
        System.out.printf("Компания %s, расстояние %f, стоимость: %s%n",
                transportService.toString(), dist, transportService.costTransportation(dist));
    }
}
