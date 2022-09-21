package chainofresponsobility;

abstract public class PaymentHandler {
    public PaymentHandler Successor;

    public abstract void handle(Receiver receiver);
}
