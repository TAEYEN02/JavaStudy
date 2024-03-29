package ex1_getter_setter;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//getter(반환)&setter(설정(세팅))
	//객체 지향 프로그래밍에서 객체의 데이터는 외부에서 접근하는 것을 막는다.
	//객체 데이터를 외부에서 읽고 변경 시 무결성이 깨질 수 있기 때문이다
	//예를 들어 자동차의 속도는 음수가 될 수 없는데, 외부에서 음수로 설정하면 무결성이 깨진다.
	//따라서 객체 지향 프로그램에서는 메서드를 통해 데이터을 변경하는 방법을 선호한다
	//데이터는 외부에서 접근하지 않도록 막고, 메서드는 공개해서 외부에서는 메서드를 통해
	//데이터에 접근하도록 유도한다.
	
	public void setSpeed(int s) {
		if(s<0) {
			speed = 0;
			return;
		}
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStop(boolean s) {
		stop = s;
		speed = 0;
	}
	//현재 자동차의 정지상태(stop 필드의 값을 반환받는 용도)
	public boolean getStop(boolean s) {
		return stop;
	}
	
	//현재 멈춰있는지 안멈췄는지 확인하는 메서드
	public boolean isStop() {
		return stop;
	}
	
}
