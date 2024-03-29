package ex2_calculator;

public class TimesTable {
	
	public void showTable(int n) {
		for(n=1;n<=9;n++) {
			for(int j = 1;j<=9;j++) {
				int r = n*j;
				System.out.printf("%d단\n",n);
				System.out.printf("%d x %d = %d",n,j,r);
			}
		}
	}
}
