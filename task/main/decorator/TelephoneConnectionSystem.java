package decorator;

public class TelephoneConnectionSystem extends DecoratorOptions {
    public TelephoneConnectionSystem(AutoBase p, String t) {
        super(p, t);
        this.autoProperty = p;
        this.name = p.name + ". Современный";
        this.description = p.description + ". " + this.title + ". Система приявязки телефона";
    }

    public double getCost() {
        return autoProperty.getCost() + 15.99;
    }
}
