package command;

public class Calculator {
    ArithmeticUnit arithmeticUnit;
    ControlUnit controlUnit;

    public Calculator() {
        arithmeticUnit = new ArithmeticUnit();
        controlUnit = new ControlUnit();
    }

    private double run(Command command) {
        controlUnit.StoreCommand(command);
        controlUnit.ExecuteCommand();
        return arithmeticUnit.register;
    }

    public double add(double operand) {
        return run(new Add(arithmeticUnit, operand));
    }
    public double subtraction(double operand) {
        return run(new Subtraction(arithmeticUnit, operand));
    }
    public double multiply(double operand) {
        return run(new Multiply(arithmeticUnit, operand));
    }
    public double division(double operand) {
        return run(new Division(arithmeticUnit, operand));
    }
}
