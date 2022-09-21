package adapter;

public class AdapterMain {

    static class FahrenheitSensor implements Sensor{
        public double getTemperature() {
            return 64;
        }
    }

    interface Sensor {
        double getTemperature();
    }

    static class Adapter implements Sensor {
        public FahrenheitSensor sensor;

        public Adapter(FahrenheitSensor sensor) {
            this.sensor = sensor;
        }

        public double getTemperature() {
            return (sensor.getTemperature() - 32) / 1.8;
        }
    }

    public static void main(String[] args) {
        final FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
        final Adapter adapter = new Adapter(fahrenheitSensor);
        System.out.println(adapter.getTemperature());
    }
}
