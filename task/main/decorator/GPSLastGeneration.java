package decorator;

public class GPSLastGeneration extends DecoratorOptions {
    public GPSLastGeneration(AutoBase p, String t) {
        super(p, t);
        this.autoProperty = p;
        this.name = p.name + ". Современный";
        this.description = p.description + ". " + this.title + ". Последнияя навигационная система ";
    }

    public double getCost() {
        return autoProperty.getCost() + 15.99;
    }
}
