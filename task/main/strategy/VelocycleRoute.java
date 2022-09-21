package strategy;

public class VelocycleRoute implements Route {
    @Override
    public String getRoute() {
        return "Дорога велосепедов";
    }

    @Override
    public String getMap() {
        return "Карта велосепедов";
    }

    @Override
    public String getSearch() {
        return "Поиск дорог велосепедов";
    }
}
