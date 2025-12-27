package week4.day1;

public class ICICI extends HDFC {

	@Override
	public void withDrawalimit() {
		System.out.println("15,000");
		
	}

	@Override
	public void convertCurrency() {
		System.out.println("in dollars");
		
	}
	public static void main(String[] args) {
		ICICI IC=new ICICI();
		IC.convertCurrency();
	}

}
