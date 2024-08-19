package Framework;

public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getCharges() {
        return charges;
    }

    public abstract void bookProduct(float charges);

    @Override
    public String toString() {
        return "AccNo: " + accNo + ", AccNm: " + accNm + ", Charges: " + charges;
    }
}
