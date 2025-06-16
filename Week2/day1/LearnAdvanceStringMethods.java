package week2.day1;

public class LearnAdvanceStringMethods {
	public static void main(String[] args) {
		String sentence ="Testleaf is your Favourite automation Partner";
		String[] split = sentence.split("\\s");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("****Substring****");
		String substring = sentence.substring(4, 10);
		System.out.println(substring);
		System.out.println("****replace****");
		String replace = sentence.replace("automation", "Selenium");
		System.out.println(replace);
		String replaceAll = sentence.replaceAll("\\s", "@");
		System.out.println(replaceAll);
	}
}
