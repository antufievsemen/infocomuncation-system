package chainofresponsobility;

public class BankPaymentHandler extends PaymentHandler {
    public void handle(Receiver receiver) {
        if (receiver.bankTransfer)
            System.out.println("Выполняем банковский перевод");
        else if (Successor != null)
            Successor.handle(receiver);
    }
}
