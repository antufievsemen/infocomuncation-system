package abstractfactory;

public class Client {
    private AbstractCar abstractCar;
    private AbstractEngine abstractEngine;
    private AbstractCusov abstractCusov;

    public Client(CarFactory car_factory) {
        abstractCar = car_factory.createCar();
        abstractEngine = car_factory.createEngine();
        abstractCusov = car_factory.createCusov();
    }

    public String getCusov() {
        return abstractCusov.name;
    }

    public int RunMaxSpeed() {
        return abstractCar.MaxSpeed(abstractEngine);
    }

    @Override
    public String toString() {
        return abstractCar.toString();
    }
}