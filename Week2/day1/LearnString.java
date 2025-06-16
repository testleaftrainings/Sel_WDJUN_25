package week2.day1;

import java.util.Arrays;

public class LearnString {
	public static void main(String[] args) {
		// using literals way 
		String nameOne ="TestLeaf";
		// using Instantiation way
		String nameTwo = new String("TestLeaf");
		String nameThree ="TestLeaf";
		String nameFour = new String("TestLeaf");
		System.out.println(nameFour+" "+nameFour.length());
		System.out.println("using literals way : "+System.identityHashCode(nameOne));
		System.out.println("using Instantiation way : "+System.identityHashCode(nameTwo));
		System.out.println("using Instantiation way : "+System.identityHashCode(nameThree));
		System.out.println("using Instantiation way : "+System.identityHashCode(nameFour));
		if (nameTwo.equalsIgnoreCase(nameFour)) {
			System.out.println("Both values were same");
		} else {
			System.out.println("Both values were not same");
		}
		if (nameOne.contains("leaf")) {
			System.out.println("Partial values were same");
		} else {
			System.out.println("Partial values were not same");
		}
		System.out.println("************toCharArray************");
		char[] charArray = nameFour.toCharArray();
		Arrays.sort(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		System.out.println("***********charAt*************");
		char charAt = nameFour.charAt(3);
		System.out.println(charAt);
		int length = nameFour.length();
		
		System.out.println("************************");
		int j=0; // segment 1
		do {
			// (segment 2)
			System.out.println(nameFour.charAt(j));
			j++;// segment 3	
		}while (j<length);	
	}
}
