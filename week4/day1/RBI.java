package week4.day1;

public interface RBI {
	/**
	 * interface-100% abstraction till 1.7 version of java
	 * After 1.7 it is possible to implement the methods in interface,for backward compatibility.
	 * objects cannot be created
	 */
	public int speed=200;
	public default void KYC() {
		System.out.println("customer details---PanCard");
	}
	public void withDrawalimit();
		
	
		
	

}
