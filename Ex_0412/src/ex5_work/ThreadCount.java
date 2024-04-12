package ex5_work;

public class ThreadCount extends Thread{
	int n;
	
	public ThreadCount(int n) {
		this.n =  n;
	}
	@Override
	public void run() {
		for(int i = n; i>=0;i--) {
				try{
					Thread.sleep(1000);
					System.out.println(i);
				}catch(Exception e) {
					
			}
			
		}
		System.out.println("종료");
	}
}
