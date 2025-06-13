package week1.day3;
public class LearnMethodsAndObjects {
	String companyName;// Global variable is declared here
	int c;
	//instance/object method
	void addNum(){
		int a=3,b=8,c;
		c=a+b;
		System.out.println(c);
	}
	int mutiplyNum(int a , int b) {
		return a*b;
	}
	private void addStudentDetails(int yearOfBirth, String name) {
		System.out.println("The Name of the students is :"+name);
		System.out.println("Student's year Of Birth is :"+yearOfBirth);
	} 
	public static void main(String[] args) {
		// ClassName              objectName  ---> Declared the Object
		LearnMethodsAndObjects   learnObject;
		// objectName = new	ConstructorName() --> Intializated the object
		learnObject  =  new  LearnMethodsAndObjects();
		int multiplication = learnObject.mutiplyNum(13, 16);// ctrl+2 then after a break press the key "L"
		System.out.println("Multiplies two number : "+multiplication);
		learnObject.addNum();
		learnObject.addStudentDetails(2008,"Bhuvanesh");
		learnObject.companyName="Qeagle";// Global variable is Initialized here
		System.out.println("Global variable is printed here : "+learnObject.companyName);
	}
}
