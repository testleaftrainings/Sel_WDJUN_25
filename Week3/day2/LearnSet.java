package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> mentors = new HashSet<String>();
		mentors.add("Anbu");
		mentors.add("Seenivasan");
		mentors.add("Vinoth");
		mentors.add("Muthu");
		mentors.add("seenivasan");
		System.out.println(mentors.size());
		mentors.forEach(System.out::println);
		System.out.println("*****TreeSet******");
		Set<String> mentors2 = new TreeSet<String>();
		mentors2.add("Anbu");
		mentors2.add("Seenivasan");
		mentors2.add("Vinoth");
		mentors2.add("Muthu");
		mentors2.forEach(System.out::println);
		System.out.println("*****LinkedHashSet******");
		Set<String> mentors3 = new LinkedHashSet<String>();
		mentors3.add("Anbu");
		mentors3.add("Seenivasan");
		mentors3.add("Vinoth");
		mentors3.add("Muthu");
		mentors3.forEach(System.out::println);
		System.out.println("*****converting Set into List******");
		List<String> convertedList = new ArrayList<String>(mentors2);
		System.out.println(convertedList.get(1));
	}

}
