package ex3_Thread;

class AddStackThread extends Thread{
	private Storage storage;
	public AddStackThread(Storage storage) {
		this.storage = storage;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount()==0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}//짐을 쌓는 스레드

class PopStackThread extends Thread{
	private Storage storage;
	
	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}//짐을 나르는 스레드


public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		add.start();
		pop.start();
	}
}
