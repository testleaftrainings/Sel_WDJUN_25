package week1.day2;

public class LearnIfCondition {

	public static void main(String[] args) {
		boolean user = false;
		//if(condition){ body  }
		int a = 3;
		int b = 5;
		// if any condition is true --> if block will get executed
		// if any condition is false --> else block will get executed
		    //false
		if (a==b) {
			System.out.println("Value of a and b is same");
		}
		     // true
		else if (a<b) {
			System.out.println("Value of a is lesser than b");
		}
		else if (a>b) {
			System.out.println("Value of a is greater than b");
		}
		else {
			System.out.println("check the input Value of a and b");
		}
		
		if (user) {
			System.out.println("Tourist Family movie will start to play");
		}
		else {
			System.out.println("user will be redirected the subscription page");
		}
		
		
		
		

	}

}
