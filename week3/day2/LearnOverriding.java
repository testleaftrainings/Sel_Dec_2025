package week3.day2;

public class LearnOverriding extends LearnOverloading {
	/**
	 * method overriding:
	 * -applicable for inheritance
	 * -to redefine a method of parent class in a child class.
	 */

	public void add() {
		int c=5;
		int d=6;
		System.out.println(c+d);
		super.add();
	}
	public static void main(String[] args) {
		LearnOverriding lo=new LearnOverriding();
		lo.add();
		LearnOverloading l=new LearnOverloading();
		l.add();
	}
}
