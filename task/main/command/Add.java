package command;

public class Add extends Command {
    public Add(ArithmeticUnit unit, double operand) {
        this.unit = unit;
        this.operand = operand;
    }

    public void execute() {
        unit.run('+', operand);
    }

    public void unExecute() {
        unit.run('-', operand);
    }
}
