package loginAccountEx;

public class Session {
	private boolean run;  // 메뉴화면 1의 접속값
	private boolean run2; // 메뉴화면 2의 접속값
	LoginInfo loginInfo;  // 로그인 데이터값 주소 저장
	private MenuState menuState = MenuState.TOP; // 메뉴 시작 필드에 열거상수 top값 지정

	public MenuState getMenuState() { //메소드 
		return menuState;
	}

	public LoginInfo getLoginInfo() { //메소드
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) { //리턴값없이 로그인 인포 데이터값을 저장하는 메소드
		this.loginInfo = loginInfo;
	}

	public void setMenuState(MenuState menuState) { 
		if (menuState == MenuState.DEPOSIT) {
			run2 = true;
		} else if (menuState == MenuState.TOP_EXIT) {
			run = false;
		} else if (menuState == MenuState.DEPOSIT_EXIT) {
			run2 = false;
		}
		this.menuState = menuState;
	}

	public Session(boolean run, boolean run2, LoginInfo loginInfo) {
		super();
		this.run = run;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	public Session(boolean run, boolean run2) {
		super();
		this.run = run;
		this.run2 = run2;
	}

	public boolean isRun() { // 실행 선언
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}

}
