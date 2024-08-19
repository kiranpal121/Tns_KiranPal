package Framework;

public abstract class NormalAcc extends ShopAcc {
    private static final float deliveryCharges = 50.0f;

    public NormalAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Product booked with delivery charges. Total charges: " + (charges + deliveryCharges));
    }

    @Override
    public String toString() {
        return super.toString() + ", Delivery Charges: " + deliveryCharges;
    }
}
