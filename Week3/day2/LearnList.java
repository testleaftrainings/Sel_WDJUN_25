package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	// interface 
		List<String> mentors;// declared The list
		mentors = new ArrayList<String>(); // initialized the list 
		mentors.add("anbu");
		mentors.add("seenivasan");
		mentors.add("Vinoth");
		mentors.add("Muthu");
		Collections.sort(mentors);
		for (String name : mentors) {
			System.out.println(name);
		}
		boolean verifyText = mentors.contains("Seenivasan");
		System.out.println(verifyText);
		mentors.remove(0);
		mentors.remove("Seenivasan");
		mentors.clear();
		System.out.println(mentors.size());
		System.out.println("******************");
		Object[] mentorsArray = mentors.toArray();
		System.out.println(mentorsArray[0]);
		System.out.println("******************");
		List<String> trainers = Arrays.asList("Bhuvanesh","Vineeth","Saranya");
		trainers.forEach(System.out::println);
		System.out.println("******************");
		List<Object> mixedList = new ArrayList<Object>();
		mixedList.add(679);
		mixedList.add("Testleaf");
		mixedList.add('A');
		mixedList.add(true);
		mixedList.forEach(System.out::println);
	}

}
