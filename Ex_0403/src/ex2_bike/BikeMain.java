package ex2_bike;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel();
		
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.info();
		fwb.ride();
		fwb.addWheel();
		
		
	}
	
}
