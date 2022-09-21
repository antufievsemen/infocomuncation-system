package command;

public class CommandMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result;
        result = calculator.add(5);
        System.out.println(result);
        result = calculator.multiply(4);
        System.out.println(result);

        result = calculator.division(4);
        System.out.println(result);
        result = calculator.subtraction(4);
        System.out.println(result);
        calculator.controlUnit.redo();
        System.out.println(calculator.arithmeticUnit.register);
        calculator.controlUnit.undo(2);
        System.out.println(calculator.arithmeticUnit.register);
    }
}
