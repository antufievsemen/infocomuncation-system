package templatemethod;

abstract public class Hairdresser {

    public void templateMethod() {
        wetHair();
        combHair();
        started();
        finish();
    }

    protected abstract void combHair();

    protected abstract void wetHair();

    protected abstract void started();

    protected abstract void finish();
}
