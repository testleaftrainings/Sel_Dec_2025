package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="FireFox";
		
		//shorcut:type sitch and do ctrl+space
		switch (browser) {
		case "Chrome":
			System.out.println("chrome browser launched sucessfully");
			break;
			
		case "Edge":
			System.out.println("edge is launched");
			break;
		case "safari":
			System.out.println("safari browser is launched sucessfully");
			break;
			default:
				System.out.println("OPEN IE");
			
		}

	}

}
