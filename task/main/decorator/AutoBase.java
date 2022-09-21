package decorator;

public abstract class AutoBase {
    public String name;
    public String description;
    public double costBase;

    public abstract double getCost();

    public String toString() {
        return String.format("Ваш автомобиль: \n%s \nОписание: %s \nСтоимость %f\n", name, description, getCost());
    }
}
