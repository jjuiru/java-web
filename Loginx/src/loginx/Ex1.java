package loginx;

import java.util.Scanner;

public class Ex1 {
	static boolean loginStatus;

	public static void login(Scanner scanner, String memberName, String memberSSN) {

//		if (loginStatus) {
//			System.out.println("이미 로그인 상태입니다.");
//			continue; // 조건,반복문중 사용 컨티뉴 시점부터 다시 while 시점으로 넘어간다
//		}

		System.out.println("로그인 처리");

		System.out.print("아이디:"); // 출력문
		String name = scanner.nextLine(); // name 변수의 값 입력
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();// 패스워드입력
//		int password = Integer.parseInt(strPassword); // stpassword값을 정수로 변환
		if (name.equals(memberName)) {
			if (strPassword.equals(memberSSN)) {
				loginStatus = true; // 성공하면 트루
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}

	}

	public static void main(String[] args) {
		String memberName = "abcd"; // 회원 이름 문자열 형식의 지역변수 설정
		String memberSSN = "1111"; // 회원 생년월일(패스워드로 사용)
		String memberTel = "010-1234-1234"; // 회원 전화번호

		boolean loginStatus = false; // 로그인 여부
		boolean membershipStatus = false; // 회원가입 여부
		int balance = 0; // 은행잔고
		boolean run2 = false;
		// ------------------ 회원가입 정보와 회원가입 했을경우 데이터, 로그인 했을때 데이터가 맞지 않을때의 경우를 선언후 초기화

		Scanner scanner = new Scanner(System.in);
		boolean run = true; // 메인 메뉴의 변수값(run)을 선언
		AAA: while (run) { // 메인메뉴 run을 반복실행
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			// -------------------- 메인 메뉴---------------------

			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			
			case 1:                                                   // -----------------------------------로그인 처리------------------------------------
				if (loginStatus) {
					System.out.println("이미 로그인 상태입니다.");
					continue; // 조건,반복문중 사용 컨티뉴 시점부터 다시 while 시점으로 넘어간다
				}
				login(scanner, memberName, memberSSN);
				break;
				
			case 2:                                                  // ------------------------------------- 회원 가입------------------------------
				if (membershipStatus) {
					System.out.println("이미 가입하셨습니다./n 회원이름:" + memberName);
				}
				do { // 반복문 내에서 처음 한번만 실행한다
					System.out.print("가입 절차를 계속 진행 하시겠습니까?(y/n):");
					String yesno = scanner.nextLine();
					if (yesno.equals("n") || yesno.equals("N")) {
//							run=true;
						continue AAA;
					} else if (yesno.equals("y") || yesno.equals("y")) {
						break;
					}
				} while (true);

				System.out.println("회원 가입");
				System.out.println("[필수 정보 입력]");
				System.out.print("1. 이름: ");
				memberName = scanner.nextLine(); // 변수 String으로 선언하면 정보가 블록내에서만 사용됨
				System.out.print("2. 주민번호 앞 6자리: ");
				memberSSN = scanner.nextLine(); // 변수 상위에 선언한 이름으로 변경
				System.out.print("3. 전화번호: ");
				memberTel = scanner.nextLine(); // 변수 상위에 선언한 이름으로 변경

				membershipStatus = true; // 가입완료하면 트루
				System.out.println();
				System.out.println("[입력된 내용]");
				System.out.println("1. 이름: " + memberName);
				System.out.println("2. 주민번호 앞 6자리: " + memberSSN);
				System.out.println("3. 전화번호: " + memberTel);

				break;
			case 3:
				// 예금 출금
				if (loginStatus) {
					run2 = true;
				} else {
					System.out.println("로그인 하시기 바랍니다.");
				}

				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				System.out.println("프로그램 종료");
				break;
			case 4:
				run = false;
				break;
			}
		}
		scanner.close(); // 스캐너 사용종료 자동으로 종료되어서 안써도 오류는 없다.
		System.out.println("프로그램 종료");
	}
}