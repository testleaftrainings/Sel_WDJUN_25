package week2.day4;

public class BMW  extends Car{
	@Override
	public void brake() {
		super.brake();
		System.out.println("BMW based : Disk brake system along with ABS & Traction control");
	}

	public void modelName() {
		System.out.println("2 Series - coupe");

	}
	public static void main(String[] args) {
		BMW b = new BMW();
		b.modelName();
		b.brake();
		
		
		

	}

}
