package ex3_Thread;

public class Storage { //창고에 대한 행동에 대한 클래스
	private int stackCount = 10;
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >=10) {
			System.out.println("===스레드 깨우기===");
			notify();
		}
	}//addStack -> 짐을 쌓는다
	
	public synchronized void popStack(int leaveCount) {
		try {
			if(leaveCount > this.stackCount) {
				this.stackCount = 0;
			}else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0) {
				System.out.println("===나를 짐 없음 대기합니다===");
				wait();
				System.out.println("===짐 추가됨 다시 나릅니다.===");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//popStack -> 짐을 나른다
	
	public int getStackCount() {
		return this.stackCount;
	} //짐의 개수
}
