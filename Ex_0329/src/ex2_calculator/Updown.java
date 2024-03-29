package ex2_calculator;

import java.util.Random;

public class Updown {

	Random rnd1 = new Random();
	int rnd = rnd1.nextInt(50)+1;
	
	public int check(int number) {
		if(rnd == number) {
			return 1;
		}else if(rnd > number) {
			return 2;
		}else {
			return 3;
		}
	}
	
}
