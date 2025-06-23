package week3.day1;

public class SBI extends SbiHq{

	@Override
	public void repoRate() {
		System.out.println("Repo rate for the month of june is 6%");
	}

	@Override
	public void reverseRepoRate() {
		System.out.println("Reverse Repo rate for the month of june is 5.5%");
	}

	@Override
	public void crr() {
		System.out.println("Cash Reserve Ratio is 4%");
	}

	@Override
	public void slr() {
		System.out.println("Satuatory Liquidity Ratio is 20%");
	}
	
	@Override
	void retailLoanApproval() {
		System.out.println("If any retail loan amounts below 20 Lakhs , approval can be done by Branch Manager");
	}

	@Override
	void humanResourcePlanning() {
		System.out.println("Every year details about the vacancy within the SBI Bank will be released");
	}
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		// Implemation's from RBI 
		sbi.repoRate();
		sbi.reverseRepoRate();
		sbi.crr();
		sbi.slr();
		// Implemantion's from SbiHq
		sbi.humanResourcePlanning();
		sbi.retailLoanApproval();
		sbi.sbiHeadLocation();
		// Default way of Implemented method From Rbi Interface
		sbi.internetBanking();
	}
}
