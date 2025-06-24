package week3.day2;

public class LearnWrapperClass {

	public static void main(String[] args) {

		String phonePrice ="$4,000";
		String convertedPrice = phonePrice.replaceAll("[^0-9]", "");
		int convertedNum = Integer.parseInt(convertedPrice);
		System.out.println(convertedNum);
		
	}

}
