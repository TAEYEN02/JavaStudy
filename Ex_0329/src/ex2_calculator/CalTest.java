package ex2_calculator;

public class CalTest {
	private int i;
	private int j;
	private int result;
	
	public void getResult(int i,int j,String s) {
		switch(s) {
		case "+":
			System.out.printf("%d + %d = %d" ,i,j,i+j);
			break;
		case "-":
			System.out.printf("%d - %d = %d" ,i,j,i-j);
			break;
		case "*":
			System.out.printf("%d *%d = %d" ,i,j,i*j);
			break;
		case "/":
			System.out.printf("%d /%d = %d" ,i,j,i/j);
			break;
		}
	}
	
}
