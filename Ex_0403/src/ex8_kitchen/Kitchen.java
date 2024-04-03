package ex8_kitchen;

public class Kitchen implements Menu1{

	@Override
	public String boggembab() {
		return "밥 + 춘장 + 계란";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기 + 당근 + 양념";
	}

	@Override
	public String jajang() {
		return "중면 + 춘장 + 완두콩";
	}
	
}
