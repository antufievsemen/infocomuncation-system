package chainofresponsobility;

public class PayPalPaymentHandler extends PaymentHandler {
    public void handle(Receiver receiver) {
        if (receiver.payPalTransfer)
            System.out.println("Выполняем перевод через paypal");
        else if (Successor != null)

            Successor.handle(receiver);
    }
}
