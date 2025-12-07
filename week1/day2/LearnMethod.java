package week1.day2;

public class LearnMethod {
	//accessModifiers returnType methodname
	public void userName() {
		System.out.println("userName is entered successfully");
	}
	
	public void passWord() {
		System.out.println("password is entered sucessfully");
	}
	
	public void click() {
		System.out.println("logged in succesfully");
	}
	
	public static void main(String[] args) {
		
		//syntax:for creating an object:className objName=new ClassName();
		LearnMethod lm=new LearnMethod();
		lm.userName();
		lm.passWord();
		lm.click();
	}

}
