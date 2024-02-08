package loginx;

import java.util.Scanner;

public class Loginmini {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 스캐너 만들기

		String 이름정보 = "";
		String 주민번호 = "";
		String 핸드폰번호 = "";
		boolean 회원가입 = false;
		boolean 로그인 = false;
		boolean 실행 = true;
		boolean 확인 = true;
		int 금액=0;
		while (실행) {
			메뉴();
			int 선택번호 = Integer.parseInt(scan.nextLine());
			switch (선택번호) {
			case 1: // ------------------------------------------------------로그인
				switch (로그인(scan, 이름정보, 주민번호, 로그인, 회원가입)) {
				case 1:
					break;
				case 2:
					continue;
				case 3:
					로그인 = true;
					break;
				}

				break;
			case 2:// -------------------------------------------------------회원가입
				if (회원가입) {
					System.out.println("<이미 가입되어 있습니다> 회원이름:\n" + 이름정보);
					switch (question2(scan)) {
					case 1:
						실행 = true;
						continue;
					case 2:
						break;

					}
				}
				System.out.println("<회원 정보를 입력해 주세요>");
				이름정보 = input("[필수 정보 입력]\n1. 이름: ", scan);
				주민번호 = input("2. 주민번호 앞 6자리: ", scan);
				핸드폰번호 = input("3. 전화번호: ", scan);
				System.out.println("<회원 가입 완료!>");
				
				displayMember(이름정보,  주민번호,  핸드폰번호);
				회원가입=true;
				로그인=false;
				break;

			case 3: //------------------------------------------------------입출금정보
				금액 = 정산(로그인, 확인, scan, 금액);
				break;
			case 4:
				break;
			}
		}

	}

	public static int 정산(boolean 로그인, boolean 확인, Scanner scan, int 금액) {
	    int run=0;
		if (로그인) { // 로그인 여부
			확인 = true;
		} else {
			System.out.println("<로그인 하시기 바랍니다>");
			run=1;
			return run;
		}
		while (확인) {
			System.out.println("-------------------------------------");
			System.out.println("| 1.예금  |  2.출금 |  3.잔고  | 4.종료 | ");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int 선택번호2 = Integer.parseInt(scan.nextLine());
			switch (선택번호2) {
			case 1:
				System.out.print("예금액> ");
				금액 += Integer.parseInt(scan.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				금액 -= Integer.parseInt(scan.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(금액);
				break;
			case 4:
				확인 = false;
				break;
			}
			System.out.println();
		}
		return 금액;

	}

	public static int question2(Scanner scan) {
		int status = 0;
		do {
			System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) ");
			String answer = scan.nextLine();
			switch (answer) {
			case "n":
			case "N":
				status = 1;
				return status;
			case "y":
			case "Y":
				status = 2;
				return status;
			}
		} while (true);
	}

	public static void displayMember(String 이름정보, String 주민번호, String 핸드폰번호) {
		System.out.println();
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + 이름정보);
		System.out.println("2. 주민번호 앞 6자리: " + 주민번호);
		System.out.println("3. 전화번호: " + 핸드폰번호);
	}

	public static String input(String comment, Scanner scan) {
		System.out.print(comment);
		return scan.nextLine();
	}

	public static int 로그인(Scanner scan, String 이름정보, String 주민번호, boolean 로그인, boolean 회원가입) {
		int var = 0;
		if (!회원가입) {
			var = 1;
			System.out.println("<회원가입을 해주세요>");
			return var;
		}
		if (로그인) {
			var = 2;
			System.out.println("<이미 로그인 되어있습니다>");
			return var;
		}
		System.out.println("<로그인 해주세요>");
		System.out.print("Id :");
		String 아이디 = scan.nextLine();
		System.out.print("Passward :");
		String 비밀번호 = scan.nextLine();

		if (아이디.equals(이름정보)) {
			if (비밀번호.equals(주민번호)) {
				System.out.println("<정상적으로 로그인 되었습니다>");
				var = 3;
			} else {
				System.out.println("<로그인 실패: 비밀번호가 틀렸습니다>");
			}
		} else {
			System.out.println("<로그인 실패: 아이디가 존재하지 않습니다>");
		}
		return var;
	}

	public static void 메뉴() {
		System.out.println("-------------------------------------");
		System.out.println("|1.로그인  |2.회원가입  |3.입금/출금 |4. 종료  | ");
		System.out.println("-------------------------------------");
		System.out.print("|메뉴선택| ->");
	}
}