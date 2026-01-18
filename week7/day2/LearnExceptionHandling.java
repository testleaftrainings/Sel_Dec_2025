package week7.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x=10;
		int y=5;
		int num[]= {1,2,3};
		
			try {
				System.out.println(x/y);
				System.out.println(num[4]);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
		
		
		System.out.println("completed");
	}

}
