package abstractfactory;

public abstract class CarFactory
{
    public abstract AbstractCar createCar();
    public abstract AbstractEngine createEngine();
    public abstract AbstractCusov createCusov();
}