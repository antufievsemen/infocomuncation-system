package chainofresponsobility;

public class ChainsOfResponsobilityMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver(true, true, false);
        PaymentHandler bankPaymentHandler = new BankPaymentHandler();
        PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler();
        PaymentHandler paypalPaymentHandler = new PayPalPaymentHandler();

        moneyPaymentHandler.handle(receiver);
        paypalPaymentHandler.handle(receiver);
        bankPaymentHandler.handle(receiver);
    }
}
