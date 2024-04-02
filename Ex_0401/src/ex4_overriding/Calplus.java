package ex4_overriding;

public class Calplus extends Calculator {

	@Override
	public int getResult(int n1,int n2) {
		return n1+n2;
	}
}
