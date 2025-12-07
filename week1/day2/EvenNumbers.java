package week1.day2;

public class EvenNumbers {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			
			if (i%2==0) {
				System.out.println("EvenNumbers are:"+i);
			}
			
		}
		
		LearnMethods l=new LearnMethods();
		System.out.println(l.bicycleData("activa", "white", 54));

	}

}
