package Application;

import Framework.ShopFactory;
import Framework.PrimeAcc;
import Framework.NormalAcc;

public class GSShopFactory extends ShopFactory {
    @Override
    public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSPrimeAcc(accNo, accNm, charges, isPrime);
    }

    @Override
    public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges) {
        return new GSNormalAcc(accNo, accNm, charges);
    }
}
