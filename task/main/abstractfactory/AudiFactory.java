package abstractfactory;

public class AudiFactory extends CarFactory {

    @Override
    public AbstractCar createCar() {
        return new AudiCar("Ауди");
    }

    @Override
    public AbstractEngine createEngine() {
        return new AudiEngine();
    }

    @Override
    public AbstractCusov createCusov() {
        return new AudiCusov();
    }
}