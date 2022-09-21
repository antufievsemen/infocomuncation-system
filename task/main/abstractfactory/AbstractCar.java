package abstractfactory;

public abstract class AbstractCar
{
    public String name;
    public abstract int MaxSpeed(AbstractEngine engine);
    public String cusovType;
}