package strategy;

public class StrategyRoute {

    Route getRoute(String name) {
        Route route = null;
        switch (name) {
            case "attraction" -> route = new AttractionRoute();
            case "automobile" -> route = new AutomobileRoute();
            case "commonauto" -> route = new CommonAutoRoute();
            case "hiking" -> route = new HikingRoute();
            case "velocycle" -> route = new VelocycleRoute();
        }
        return route;
    }
}
