package week4.day1;

public class Axis implements RBI {

	@Override
	public void withDrawalimit() {
		System.out.println("limit is 50000");
		
	}
	public void housingLoan() {
		System.out.println("rate of interst is 8%");
	}
	public static void main(String[] args) {
		Axis A=new Axis();
		A.KYC();
		A.housingLoan();
	}

}
