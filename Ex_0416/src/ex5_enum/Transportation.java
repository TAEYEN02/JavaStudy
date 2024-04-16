package ex5_enum;


public enum Transportation {
	BUS(100){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},
	TRAIN(150)
	{
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},
	SHIP(200){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},
	ATRPLANE(250){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	};
	
	protected final int fare;
	
	private Transportation(int fare) {
		this.fare = fare;
	}
	
	abstract int totalFare(int distance);
	//열거형에 추상 메서드를 선언하면 각 열거형 상수가
	//이 추상메서드를 반드시 구현해야 한다
	//추상 클래스나 인터페이스를 가지고 추상 메서드를 구현함으로써
	//익명 클래스를 작성하는 것과 유사하다.
	
	
}
