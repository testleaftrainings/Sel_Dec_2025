package week3.day1;

public class PrintIntersection {

	public static void main(String[] args) {
		
		int num[]= {1,2,1,3,4};
		int num1[]= {2,1,5,6,7,8};
		int length = num1.length;
		System.out.println(length);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if (num[i]==num1[j]) {
					System.out.println("intersection is:"+num[i]);
				}
			}
		}

	}

}
