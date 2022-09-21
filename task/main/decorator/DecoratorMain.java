package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Ford ford = new Ford("Форд", "Форд фокус", 499.0);
        Print(ford);
        AutoBase myford = new MediaNAV(ford, "Навигация");
        Print(myford);
        AutoBase newmyReno = new SystemSecurity(new MediaNAV(ford, "Навигация"), "Безопасность");
        Print(newmyReno);
        AutoBase newmyReno1 = new GPSLastGeneration(ford, "Навигация");
        Print(newmyReno1);
        AutoBase newmyReno2 = new TelephoneConnectionSystem(ford, "Простота управления");
        Print(newmyReno2);
    }

    private static void Print(AutoBase av) {
        System.out.println(av.toString());
    }
}
