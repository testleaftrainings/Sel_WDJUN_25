package week3.day2;

public class LearnStatic {
	static String browser;
	int b = 0;

	public void readData() {
		System.out.println("NON STATIC METHOD");
		System.out.println("NON STATIC VARIABLE "+b);
	}

	public static void read() {
		System.out.println("STATIC METHOD");
		System.out.println(browser);
	}
	
	{
		System.out.println("NON STATIC Block");
	}
	
	static{
		System.out.println("STATIC Block");
		browser="Chrome";//initialization 
	}

	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		read();
		ls.readData();
	}

}
