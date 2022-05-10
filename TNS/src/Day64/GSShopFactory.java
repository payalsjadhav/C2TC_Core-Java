package Day64;

public class GSShopFactory implements ShopFactory
{
	@Override 
	public GSPrimeAcc getNewPrimeAccount(int Account)
	{
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}
	
	@Override 
	public GSNormalAcc getNewNormalAccount(int Acc)
	{
		GSNormalAcc gsnormal = new GSNormalAcc();
		return gsnormal;
	}

}
