package ex2_annoymous;

interface buttonClickListener{
	public void click();
}

public class AnnoymousExample {
	
	public class Button{
		private buttonClickListener listener;
		
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		//버튼 클릭 기능
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		AnnoymousExample exam = new AnnoymousExample();
		AnnoymousExample.Button button = exam.new Button();
		button.setButtonListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다");
			}
		});
		//버튼을 누름
		button.click();
	}
}
