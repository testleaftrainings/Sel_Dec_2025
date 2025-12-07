package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		int marks=40;
		//type if and do ctrl+space
		/*
		 * if (marks>=35) { System.out.println("pass"); }
		 * 
		 * if (marks>=50) { System.out.println("pass"); } else {
		 * System.out.println("fail"); }
		 */
		
		int marks1=90;
		if (marks1==70) {
			System.out.println("gradeA");
		} else if(marks1<40) {
			System.out.println("fail");
		}
		else if(marks1>=85) {
			System.out.println("distinction");
		}
		else {
			System.out.println("out of range");
		}

	}

}
