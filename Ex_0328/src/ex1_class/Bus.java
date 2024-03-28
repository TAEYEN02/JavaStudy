package ex1_class;

public class Bus {
	//return 
	//함수에서 모든 작업을 마치고 경우에 따라 실행 결과를 호출한 곳으로
	//다시 돌려주기도 한다.
	//리턴값이 있는 경우 리턴할 데이터의 타입이 무엇인지 반환형에 기재해줘야 한다
	//리턴값이 없는 경우 메서드를 종료하기 위해 return을 사용할 수 있다.
	public void take(int m) {
		while(true) {
			if(m<3000) {
				System.out.println("교통카드를 충전하러 갑니다");
				return;
			}
			
			System.out.println("버스를 탑니다");
			m -= 1250;
			System.out.println("남은 잔액은 "+m+"원 입니다");
		}
	}
}
