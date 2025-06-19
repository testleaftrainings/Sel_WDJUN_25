package week2.day4;

public class Maruthi extends Car {

	public void fixLogo() {
		System.out.println('S');
	}

	public void modelName() {
		System.out.println("Baleno");
	}

	public void freeService() {
		System.out.println("3 Services free of cost");
	}

	public static void main(String[] args) {
   Maruthi m = new Maruthi();
   m.engineChasis();
   m.wheelCount();
   m.headLight();
   m.steering();
   m.horn();
   m.brake();
   m.fixLogo();
   m.modelName();
   m.freeService();
   
	}

}
