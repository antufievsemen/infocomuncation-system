package strategy;

public class StrategyMain {

    public static void main(String[] args) {
        final StrategyRoute strategyRoute = new StrategyRoute();
        final Route route = strategyRoute.getRoute("attraction");
        System.out.println("Еду по дороге смотреть на достопремичательности: " + route.getRoute());
        System.out.println("Ищу дорогу с достопремичательностями: " + route.getSearch());
        System.out.println("Смотрю карту с достопремичательностями: " + route.getMap());

        final Route route1 = strategyRoute.getRoute("velocycle");
        System.out.println("Нужна велодорога: " + route1.getRoute());
        System.out.println("Поиск маршрутов по велодороге: " + route1.getSearch());
        System.out.println("Просмотр карты велодороги: " + route1.getMap());
    }
}
