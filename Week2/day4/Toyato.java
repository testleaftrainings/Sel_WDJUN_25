package week2.day4;

public class Toyato extends Car {
	
	public void fixLogo() {
		System.out.println('T');
	}

	public void modelName() {
		System.out.println("Glanza");
	}

	public void freeService() {
		System.out.println("2 Services free of cost");
	}
	
	public static void main(String[] args) {
		Toyato t = new Toyato();
		t.engineChasis();
		t.wheelCount();
		t.headLight();
		t.steering();
		t.horn();
		t.brake();
		t.fixLogo();
		t.modelName();
		t.freeService();
	}
}
