package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest me = new MethodTest();
		
		System.out.println(me.add(1,2));
		
		System.out.println("-----------------");
		
		me.sum(1,5);
				
		System.out.println("-----------------");
		
		Integer[] arr = {3,6,1,2,5};
		me.maxFind(arr);
		
		System.out.println("-----------------");
		
		me.circleArea(3);
		me.circleRound(5);
	}
}

