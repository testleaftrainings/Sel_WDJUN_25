package week1.day2;

public class PrintTheOddNumber {

	public static void main(String[] args) {
		int num =10;
		
		for (int i = 1; i <= num; i++) {
			// 9%2=1---> Odd number
			// 1,3,5,7,9
			if (i%2==1) {
				System.out.println("The value is Odd number "+i);
			}
		}
	}
}
