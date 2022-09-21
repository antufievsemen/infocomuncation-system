package abstractfactory;

public class AudiCar extends AbstractCar {
    public AudiCar(String name) {
        this.name = name;
    }

    @Override
    public int MaxSpeed(AbstractEngine engine) {
        return engine.max_speed;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name;
    }
}