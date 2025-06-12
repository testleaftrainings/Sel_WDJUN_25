package week1.day2;

public class LearnForStatement {

	public static void main(String[] args) {
		//segment 1 --> Declaration AND Initialization
		//segment 2 --> (condition) --> true/false
		//segment 3 --> Iteration --> pre/post iteration
		for (int i = 1; i <= 4; i++) { // outerloop
			for (int j = 1; j <= 4 ; j++) {//inner loop
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
