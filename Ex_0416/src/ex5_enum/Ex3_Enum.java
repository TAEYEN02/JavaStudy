package ex5_enum;

public class Ex3_Enum {
	public static void main(String[] args) {
		Transportation[] trans = Transportation.values();
		
		for(Transportation tran : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n",tran.name(),tran.totalFare(100));
		}
	}
}
