package week3.day2;

public class LearnOverloading {
/**
 * Method overloading:
 * -method signature is same but with different input arguments and with different datatypes.
 */
	public void add() {
		int a=10;
		int b=5;
		System.out.println(a+b);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,float b,int c) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LearnOverloading l=new LearnOverloading();
		l.add();
	}
	
}
