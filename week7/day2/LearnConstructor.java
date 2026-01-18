package week7.day2;

public class LearnConstructor {
	/**
	 * Constructor:used to initialize the state of the objects
	 * -constructor name should be as like the classname
	 * -difference between the constructor and method --->constructor will not have the return type 
	 * Types of constructor:
	 * 1)default-->constructor of no arguments
	 * 2)parameterized constructor-->has different input parameters as arguments
	 *    -supports constructor overloading--->having more than one constructor inside the class with different parameters
	 *   this Keyword:
	 *    1)it is used to differentiate between local and global variable
	 *    2)to call one constructor from another constructor.
	 *    
	 *  can you call one constructor from another constructor?-Yes
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		//this(56, "saranya", true);
		System.out.println("default constructor");
		//empId=90;
	}
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		this();
		System.out.println("parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		  LearnConstructor lc1=new LearnConstructor(67, "saran", false);
		  System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 
		
		/*
		 * LearnConstructor lc=new LearnConstructor();
		 * System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 */
		
	}
	

}
