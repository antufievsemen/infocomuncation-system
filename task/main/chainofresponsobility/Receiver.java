package chainofresponsobility;

public class Receiver {
    // банковские переводы
    public boolean bankTransfer;
    // денежные переводы - WesternUnion, Unistream
    public boolean moneyTransfer;
    // перевод через PayPal
    public boolean payPalTransfer;

    public Receiver(boolean bt, boolean mt, boolean ppt) {
        bankTransfer = bt;
        moneyTransfer = mt;
        payPalTransfer = ppt;
    }
}
