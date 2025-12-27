package week4.day1;

public class SBI extends Axis implements RBI,Inter{

	@Override
	public void withDrawalimit() {
		System.out.println("liit is 10000");
		
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.withDrawalimit();
		s.KYC();
		s.housingLoan();
		s.systemDesign();
	}
	@Override
	public void systemDesign() {
		System.out.println("design is in process");
		
	}

}
