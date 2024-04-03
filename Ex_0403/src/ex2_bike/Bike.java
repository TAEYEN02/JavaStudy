package ex2_bike;

public class Bike {
	String name;
	int wheel = 2;
	
	public Bike(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println(name+"의 자전거는 "+wheel+"발 자전거 입니다");
	}
	public void ride() {
		System.out.println("씽씽");
	}
}
