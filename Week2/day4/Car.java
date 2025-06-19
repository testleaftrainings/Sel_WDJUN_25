package week2.day4;

public class Car extends AutomobileSpares {
     int noOfWheels = 4 ;
     
     public void wheelCount() {
    	 System.out.println("No of wheels a car can have is "+ noOfWheels);
	}
     public void engineChasis() {
         System.out.println("4 cylindar engine");
	}
     
     public static void main(String[] args) {
		Car  c =  new Car();
		c.brake();
		c.steering();
		c.headLight();
		c.horn();
		c.wheelCount();
		c.engineChasis();
		
	}
}
