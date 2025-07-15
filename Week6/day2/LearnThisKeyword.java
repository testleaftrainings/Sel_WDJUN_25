package week6.day2;

public class LearnThisKeyword {
	
	String companyName;
	public void empDetails(String companyName) {
		// alaising 
		this.companyName=companyName;
		// shadowing
		System.out.println(this.companyName);
	}
	public void empId(int empNo) {
     System.out.println("employee id number is "+empNo);
     this.empDetails(companyName);
	}
	
	public static void main(String[] args) {
		LearnThisKeyword obj = new LearnThisKeyword();
		obj.companyName="qeagle";
		obj.empId(9);
		obj.empDetails(obj.companyName);
	}

}
