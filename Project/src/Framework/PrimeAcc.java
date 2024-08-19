package Framework;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;
    private static final float deliveryCharges = 0.0f;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Product booked with no delivery charges. Total charges: " + charges);
    }

    @Override
    public String toString() {
        return super.toString() + ", isPrime: " + isPrime;
    }
}
