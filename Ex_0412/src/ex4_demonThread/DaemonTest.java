package ex4_demonThread;

class MyDaemonRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i<=5;i++) {
			System.out.println("저장되었습니다");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonTest {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(new MyDaemonRunnable());
		
		daemonThread.setDaemon(true);
		
		daemonThread.start();
		
		//메인 스레드에서 1부터 15까지 출력
		for(int i = 1; i<=15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
}
