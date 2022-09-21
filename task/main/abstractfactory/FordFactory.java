package abstractfactory;

import java.util.Objects;

public class FordFactory extends CarFactory {
    private static FordFactory fordFactory = null;

    private FordFactory() {
    }

    public static FordFactory getFordFactory() {
        if (Objects.isNull(fordFactory)) {
            fordFactory = new FordFactory();
        }
        return fordFactory;
    }

    @Override
    public AbstractCar createCar() {
        return new FordCar("Форд");
    }

    @Override
    public AbstractEngine createEngine() {
        return new FordEngine();
    }

    @Override
    public AbstractCusov createCusov() {
        return new FordCusov();
    }
}