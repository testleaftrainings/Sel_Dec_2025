package week3.day2;

public class BMW extends Car{
	
	public void voiceCommand() {
		System.out.println("voice cmd is enabled---->bmw class");
	}
	public void turnOnAc() {
		System.out.println("ac is turnedd on---->bmw class");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBrake();
		b.applyGear();
		b.voiceCommand();
	}

}
