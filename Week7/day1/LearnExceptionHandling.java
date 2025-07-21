package week7.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
         int a;
         int b []= {11,22,33};
         int c = b.length-1;
		try {
			a = 100/0;// click()
			System.out.println(a);
			System.out.println(b[c]);
			throw new NullPointerException();
		} catch (ArithmeticException e) {
			System.out.println(" Please check the value in the denominator "+e);
			a=100/1;// javascriptClick()
			System.out.println(a);	
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(b[c-1]);
		}
		finally {
			System.out.println("FINALLY BLOCK");
		}
		
	}

}
