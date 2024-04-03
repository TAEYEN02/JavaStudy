package ex2_bike;

public class FourWheelBike extends Bike{
	
	public FourWheelBike(String name) {
		super(name);
	}
	
	@Override
	public void info() {
		super.info();
	}
	
	public void addWheel() {
		if(wheel==2) {
			wheel= 4;
			System.out.println(name+"의 자전거에 보조바퀴를 부착하였습니다");
		}else {
			System.out.println(name+"의 자전거에 이미 보조바퀴가 부착되었습니다");
		}
	}
	
	

}
