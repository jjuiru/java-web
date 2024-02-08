package loginAccountMe;

import java.util.Scanner;

public class All {
	private boolean run1 = true; // run은 참이다
	private boolean run2 = true;
	private int balance = 0;// balance는 0값을 가진다
	private MenuBoolean mainmenu = MenuBoolean.MAIN_MENU;
	
	
	 	 
	public boolean isRun1() {
		return run1;
	}

	public void setRun1(boolean run1) {
		this.run1 = run1;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public MenuBoolean getMainmenu() {
		return mainmenu;
	}

	public void setMainmenu(MenuBoolean mainmenu) {
		this.mainmenu = mainmenu;
	}

	public void menuBoolean(MenuBoolean mainmenu) {
		if(mainmenu==MenuBoolean.MAIN_MENU) {
			run1=true;
		}
		
	}
	
	public All(boolean run1) {
		this.run1 = run1;
	}

	public All(boolean run1, boolean run2, int balance) {
		this.run1 = run1;
		this.run2 = run2;
		this.balance = balance;
	}
	
	
//	static boolean islogin() {
//		if() {
//			
//		}
//		
//	}


	static void search(Scanner scan, boolean run) {
			while (run) {
				System.out.print("검색(신한은행) :");
				String home = scan.nextLine();
				if (home.equals("신한은행")) {
					System.out.println("환영합니다 신한은행입니다.");
				} else {
					System.out.println("정확한 주소를 입력해주세요");
					continue;
				}
			}
		}
}
