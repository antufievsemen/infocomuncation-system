package strategy;

public class AttractionRoute implements Route{
    @Override
    public String getRoute() {
        return "Дорога достопримечательностей";
    }

    @Override
    public String getMap() {
        return "Карта достопримечательностей";
    }

    @Override
    public String getSearch() {
        return "Поиск дорог достопримечательностей";
    }
}
