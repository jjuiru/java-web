package chap09_09;

public class UiWindow {
	UiButton button1 = new UiButton();
	UiButton button2 = new UiButton();
	// 버튼 두개 생성
	UiButton.OnClickListener listener = new UiButton.OnClickListener() {
		// 인터페이스의 구현객체 생성
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};

	UiWindow() {
		button1.setOnclickListener(listener);
		button2.setOnclickListener(new UiButton.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
