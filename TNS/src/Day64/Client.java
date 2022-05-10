package Day64;

public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Step1-Step a
		GSShopFactory gssfactory = new GSShopFactory();
				gssfactory.getNewPrimeAccount(123, "Vikas", 1000, true);
				gssfactory.getNewNormalAccount(111, "Vikas2", 1000,50);
				
				
				//Step2
				GSPrime gsprime = new GSPrimeAcc();
				gsprime.getAccNm();
				gsprime.getAccNo();
				gsprime.getCharges();
				
				//Step5/Step e
				gsprime.toString();
				
				//Step3
				GSNormalAcc gsnormal = new GSNormalAcc();
				gsnormal.getAccNm();
				gsnormal.getAccNo();
				gsnormal.getCharges();
				gsnormal.getDeliveryCharge();
				
				//Step4 /Step d
				gsnormal.bookProduct(1000);
				//Step 5 /Step e
				gsnormal.toString();
				}
	}
