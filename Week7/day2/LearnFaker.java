package week7.day2;

import java.util.Locale;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
 
		Faker data = new Faker(Locale.UK);
		String firstName = data.name().firstName();
		String lastName = data.name().lastName();
		String cName = data.company().name();
		String email = firstName+"."+lastName+"@"+cName;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(cName);
		System.out.println(email);
	}

}
