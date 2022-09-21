package command;

public class ArithmeticUnit {
    public double register;

    public void run(char operationCode, double operand) {
        switch (operationCode) {
            case '+' -> register += operand;
            case '-' -> register -= operand;
            case '*' -> register *= operand;
            case '/' -> register /= operand;
        }
    }
}
