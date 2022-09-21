package strategy;

public class HikingRoute implements Route{
    @Override
    public String getRoute() {
        return "Дорога пешеходов";
    }

    @Override
    public String getMap() {
        return "Карта пешеходов";
    }

    @Override
    public String getSearch() {
        return "Поиск дорог пешеходов";
    }
}
