package chainofresponsobility;

public class MoneyPaymentHandler extends PaymentHandler {
    public void handle(Receiver receiver) {
        if (receiver.moneyTransfer)
            System.out.println("Выполняем перевод через системы денежных переводов");
        else if (Successor != null)

            Successor.handle(receiver);
    }
}
