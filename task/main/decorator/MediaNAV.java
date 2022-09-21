package decorator;

public class MediaNAV extends DecoratorOptions {
    public MediaNAV(AutoBase p, String t) {
        super(p, t);
        this.autoProperty = p;
        this.name = p.name + ". Современный";
        this.description = p.description + ". " + this.title + ". Обновленная мультимедийная навигационная система ";
    }

    public double getCost() {
        return autoProperty.getCost() + 15.99;
    }
}
