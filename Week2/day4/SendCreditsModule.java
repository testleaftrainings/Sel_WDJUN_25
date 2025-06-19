package week2.day4;

public class SendCreditsModule {
	
	public void accountCredits() {
		System.out.println("Total balance of the account");
	}
	
	public void accountCredits(int cdmDeposit) {
		System.out.println("The cash has been deposited using The CDM machine  : "+ cdmDeposit);
	}
	
	public void accountCredits(double internetBanking) {
		System.out.println("The payment has been transferred using The Internet Banking  : "+ internetBanking);
	}
	
	
	public void accountCredits(float chequePayment) {
		System.out.println("The payment has been transferred using cheque  : "+ chequePayment);
	}
	
	public void accountCredits(double currencyAmount, double conversionRate,String currenyName) {
		double convertedCurreny ;
		convertedCurreny= currencyAmount * conversionRate;
		System.out.println("Donor Curreny type is "+ currenyName);
		System.out.println("The payment has been transferred using Forex  : "+ convertedCurreny);		
	}	

	public static void main(String[] args) {
		SendCreditsModule scm = new SendCreditsModule();
		scm.accountCredits(100.00, 99.37, "EUR");
		scm.accountCredits(70000.00f);
		scm.accountCredits(999.99);
		scm.accountCredits(60000);
		scm.accountCredits();

	}

}
