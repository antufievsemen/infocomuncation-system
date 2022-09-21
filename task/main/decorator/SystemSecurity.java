package decorator;

public class SystemSecurity extends DecoratorOptions {
    public SystemSecurity(AutoBase p, String t) {
        super(p, t);
        this.autoProperty = p;
        this.name = p.name + ". Повышенной безопасности";
        this.description = p.description + ". " + this.title + ". Передние боковые подушки безопасности, ESP -система динамической стабилизации автомобиля ";
    }

    public double GetCost() {
        return autoProperty.getCost() + 20.99;
    }
}
