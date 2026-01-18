package week7.day2;

public class LearnEncapsulation {
	
	private int SSN;
	private String empName;
	
	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void main(String[] args) {
		
		LearnEncapsulation le=new LearnEncapsulation();
		le.setSSN(123456);
		le.setEmpName("Saranya");
		System.out.println(le.getSSN());
		System.out.println(le.getEmpName());
		
	}

}
