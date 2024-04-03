package ex7_phone;

public class PineapplePhone implements Phone{

	int batteryCarpacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCarpacity > 30) {
			System.out.println("@@@Power On!");
			isOn = true;
		}else {
			System.out.println("Low Battery...");
		}
		
	}

	@Override
	public void powerOff() {
		System.out.println("@@@Power Off@@@\n");
		isOn = false;
		
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
			return false;
		}	
	}

	@Override
	public void watchUtube() {
		if(batteryCarpacity >10) {
			System.out.println("---Watching Utube---");
			batteryCarpacity -= 10;
			System.out.println("battery is..."+batteryCarpacity+"%\n");
		}else {
			System.out.println("Low Battery...");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if(batteryCarpacity <Phone.MAX_BATTERY_CAPRCITY-20) {
			System.out.println("---Charging---");
			batteryCarpacity += 5;
			System.out.println("Charged..."+ batteryCarpacity+"%\n" );
		}else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough..."+batteryCarpacity+"%");
		}
	}

}
