package ex4_overriding;

public class CalMain {
	public static void main(String[] args) {
		Calplus cp = new Calplus();
		CalMinus cm = new CalMinus();
		
		System.out.println("CalPlus : "+cp.getResult(20, 10));
		System.out.println("CalMinus : "+cm.getResult(20, 5));
		
	}
}
