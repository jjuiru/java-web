package cli_Base;

import java.util.Scanner;

public class AccountEx {
// 회원가입을 여러명 받을 수 있도록 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;				
		boolean run2 = true;
		AccountArray acc = null;

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:// 로그인
				System.out.println("<로그인 해주세요>");
				System.out.print("ID :");
				String id = scanner.nextLine();
				System.out.print("PW :");
				String pw = scanner.nextLine();
				if ((id.equals(acc.name)) && (pw.equals(acc.ssn))) {
					System.out.println("로그인에 성공!");
				} else {
					System.out.println("로그인에 실패 했습니다");
				}

				break;
			case 2:// 회원 가입
				System.out.println("<회원 가입>");
				System.out.print("이름 : ");
				String name = scanner.nextLine();
				System.out.print("생년월일 6자리 : ");
				String ssn = scanner.nextLine();
				System.out.print("전화번호 : ");
				String tel = scanner.nextLine();
				acc = new AccountArray(name, ssn, tel);

				System.out.println(acc);

				break;
			case 3:// 예금 출금
				System.out.println("예금 출금");
				int balance1 = 0;

				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						acc.balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						acc.balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance1);
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
		System.out.println("프로그램 종료");
	}
}
