package templatemethod;

public class Tom extends Hairdresser{
    @Override
    public void combHair() {
        System.out.println("Том напевает и причесывает волосы");
    }

    @Override
    protected void wetHair() {
        System.out.println("Том использует особенную жидкость, чтобы намочить волосы");
    }

    @Override
    protected void started() {
        System.out.println("Том ставит релаксирующую музыку и начинает стричь волосы");
    }

    @Override
    protected void finish() {
        System.out.println("Том выключает музыку и дает зеркало");
    }
}
