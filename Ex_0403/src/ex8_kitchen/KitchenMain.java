package ex8_kitchen;

public class KitchenMain {
	public static void main(String[] args) {
		Kitchen k = new Kitchen();
		
		System.out.println(k.jajang());
		System.out.println(k.tangsuyuck());
		System.out.println(k.boggembab());
		
		Menu1 im1 = k;
		System.out.println(im1.jajang());
		System.out.println(im1.tangsuyuck());
		System.out.println(im1.boggembab());
		
	}
}
