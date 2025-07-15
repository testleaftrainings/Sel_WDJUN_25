package week6.day2;

public class LearnConstructor extends SuperClass {

	int a ;
	
	public LearnConstructor() {
		super("Special method from parent class");
		a=10;
		System.out.println("The vales is initialized using constructor : "+a);
	}
	public LearnConstructor(String cname) {
		this();
		System.out.println("The company name is : "+ cname);
	}
	
	
	public static void main(String[] args) {
		LearnConstructor li = new LearnConstructor("Testleaf");
		//int b;
		//System.out.println(li.a);
		//System.out.println(b);

	}
}
