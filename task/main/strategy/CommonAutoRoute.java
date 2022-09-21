package strategy;

public class CommonAutoRoute implements Route{
    @Override
    public String getRoute() {
        return "Дорога общественного транспорта";
    }

    @Override
    public String getMap() {
        return "Карта общественного транспорта";
    }

    @Override
    public String getSearch() {
        return "Поиск дорог общественного транспорта";
    }
}
