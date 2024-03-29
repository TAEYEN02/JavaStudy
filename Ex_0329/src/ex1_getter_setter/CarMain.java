package ex1_getter_setter;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(50);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(-50);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		if(!myCar.isStop()) {	//getStop()으로도 할 수 있지만 보통 상태와 기능을 분리해서 사용
			myCar.setStop(true);
		}

		System.out.println("현재속도 : "+myCar.getSpeed());
		
	}
}
