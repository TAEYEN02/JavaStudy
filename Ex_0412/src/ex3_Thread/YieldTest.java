package ex3_Thread;

class Producer implements Runnable{
	@Override
	public void run() {
		for(int i = 1 ; i<=5; i++) {
			System.out.println("Producer : "+ i);
			Thread.yield();
		}
	}
}//양보 기능이 있는 스레드


class Consumer implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Consumer : "+i);
		}
	}
}//양보 기능이 없는 스레드


public class YieldTest {
	public static void main(String[] args) {
		Thread producerThread = new Thread(new Producer());
		Thread consumerThread = new Thread(new Consumer());
		
		producerThread.start();
		consumerThread.start();
	}
}
