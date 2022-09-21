package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Log lg = Log.getMyLog();
        lg.LogExecution("Метод Main()");
        double op = Operation.Run('-', 35);
        op = Operation.Run('+', 30);
    }
}
