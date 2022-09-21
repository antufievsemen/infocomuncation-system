package strategy;

public class AutomobileRoute implements Route {
    @Override
    public String getRoute() {
        return "Дорога машин";
    }

    @Override
    public String getMap() {
        return "Карта машин";
    }

    @Override
    public String getSearch() {
        return "Поиск дорог для машин";
    }
}
