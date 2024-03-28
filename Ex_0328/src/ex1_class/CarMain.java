package ex1_class;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		
		//변수명.필드명
		System.out.println("바퀴의 개수는 " + car.wheel+"개 입니다");
	
		car.wheel = 5;
		System.out.println("바퀴의 개수는 "+ car.wheel+"개 입니다");
	}
}
