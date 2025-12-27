package week4.day1;

public abstract class HDFC implements RBI{
/**
 * Abstract class---partial abstraction.
 * implemented and unimplemented methods.
 * -cannot able to create the objects
 * 
 */
	private int empID=78;
	public void goldLoan() {
		System.out.println("rate of interest--->10%");
	}
	public abstract void convertCurrency();
	
	
}
