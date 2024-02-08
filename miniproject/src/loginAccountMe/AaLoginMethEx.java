package loginAccountMe;

import java.util.Scanner;

public class AaLoginMethEx {
	static Scanner scan = new Scanner(System.in);
	
	public static void menu1() {
		{
			System.out.println("-----------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-----------------------------");
		}
	}

	public static void print () {
		All.search(scan, true);
		while (All.menuBoolean(mainmenu.MAIN_MENU)) {
			menu1();
			System.out.print("선택 :");
			int num = Integer.parseInt(scan.nextLine()); // v1은 스캔값을 정수화함
			switch (num) {

			case 1:
				System.out.print("id:");
				String name = scan.nextLine();

				System.out.print("P.W:");
				String strPassword = scan.nextLine();
				int password = Integer.parseInt(strPassword);

				if (name.equals("java")) {// if(name=="java") 정수가 아니므로 비교문을 equals로 쓴다
					if (password == 12345) {
						System.out.println("로그인 되었습니다.");
					} else {
						System.out.println("로그인에 실패했습니다.\n패스워드가 맞는지 확인해주세요.");
					}
				} else {
					System.out.println("로그인에 실패했습니다.\n아이디가 맞는지 확인해주세요.");
				}
				System.out.println("로그인 처리");
				break;

			case 2:
				System.out.println("[회원가입]");

				System.out.print("이름:");
//				int 이름= scan.nextInt();
				String 이름 = scan.nextLine();

				System.out.print("주민번호 앞 6자리:");
				String 주민번호 = scan.nextLine();

				System.out.print("전화번호:");
				String 전화번호 = scan.nextLine();

				System.out.println();
				System.out.println("[필수 정보 입력]");
				System.out.println("1. 이름:" + 이름);
				System.out.println("2. 주민번호 앞 6자리:" + 주민번호);
				System.out.println("3. 전화번호:" + 전화번호);
				System.out.println("회원 가입");
				break;

			case 3:
				System.out.println("-----------------------------");
				System.out.println("1.잔액 | 2.예금기록 | 3.출금기록 | 4.종료");
				System.out.println("-----------------------------");
				System.out.print("선택>");
				int v2 = Integer.parseInt(scan.nextLine());
				if (v2 == 1) {
					System.out.println("10000");
				} else if (v2 == 2) {
					System.out.println("2000");
				} else if (v2 == 3) {
					System.out.println("8000");
				} else if (v2 == 4) {
					System.out.println("프로그램종료");
					break;
				}
				System.out.println("예금 출금");

			case 4:
				break;
			}

		}
	}

	


	public static void main(String[] args) {
		All all = new All(true, true, LoginInfo);
		Search(scan, run);

	}

}

// 회원가입,로그인/ 예금,출금,조회,종료/ 회원정보(이름,주민6자리,전번), 로그인(이름,주민앞6)/ 예금/출금(잔금)
