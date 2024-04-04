package ex1_innerclass;

public class LocalClassExample {
	private int speed = 10;
	
	public void getUnit(String unitName) {
		
		//unitName = unitName + "님"; 매개변수 수정은 안됨 -> 기본적으로 final이 되어있어서
		
		class Unit{
			public void move() {
				System.out.println(unitName + "이 "+speed+"속도로 이동합니다");
			}
		}
		
		Unit unit = new Unit();
		unit.move();
		
	}
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
}


