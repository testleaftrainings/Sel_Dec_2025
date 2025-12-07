package week1.day2;

public class LearnMethods {
/**
 * syntax:accessModifiers returnType methodname(input arguments)
 * returnTYpe:type of output that the method is expecting
 * @param a
 * @param b
 */
	
	public void addNumbers(int a,float b){
		System.out.println(a+b);
	}
	
	private int noOfBicycles(){
		return 2;
	}
	
	String bicycleData(String brandName ,String colour,int regNo){
		
		return brandName+" "+colour+" "+regNo;
	}
	
	public static void main(String[] args) {
		LearnMethods lm1=new LearnMethods();
		lm1.addNumbers(5,6.5f );
		System.out.println(lm1.bicycleData("honda", "red",1234));
		//lm1.bicycleData("honda", "red",1234);
		/*
		 * int num = lm1.noOfBicycles();//do ctrl+2,L System.out.println(num);
		 */
		System.out.println(lm1.noOfBicycles());
	}
}
