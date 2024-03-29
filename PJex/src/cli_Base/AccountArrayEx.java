package cli_Base;

import java.util.Scanner;

public class AccountArrayEx {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		AccountArray[] acc = new AccountArray[3];
		acc[0] = new AccountArray("김하나", "911224", "010-1234-1234");
		acc[1] = new AccountArray("김두울", "921224", "010-1234-1234");
		acc[2] = new AccountArray("김세엣", "931224", "010-1234-1234");
		int idx = -1;
		boolean login = false;
		while (run) {
			System.out.println("-------------------------------------");
			if (login) {
				System.out.println(acc[idx].name + " 고객님으로 로그인 상태입니다.");
			}
			System.out.println("1.로그인 | 2.회원수정 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				System.out.print("아이디: ");
				String id = scanner.nextLine();
				System.out.print("패스워드: ");
				String pass = scanner.nextLine();
				for (int i=0; i < acc.length; i++) {
					if (id.equals(acc[i].name)) {
						if (pass.equals(acc[i].ssn)) {
							System.out.println("로그인 성공!");
							idx = i;
							run2 = true;
							login = true;
						} 
					}
				}
				break;
			case 2:
				// 회원 수정
				if (login == true) {
					System.out.println("회원 수정");
					System.out.print("이름: ");
					acc[idx].name = scanner.nextLine();
					System.out.print("생년월일: ");
					acc[idx].ssn = scanner.nextLine();
					System.out.print("전화번호: ");
					acc[idx].tel = scanner.nextLine();
//					acc[idx] = new Account(name, ssn, tel);
					System.out.println(acc[idx]);
					login = false;
				} else {
					System.out.println("로그인 후 회원 수정을 하세요.");
				}
				break;
			case 3:
				if (!login) {
					System.out.println("로그인 후 사용하세요.");
					break;
				}
				// 예금 출금
				System.out.println("예금 출금");
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						acc[idx].balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						acc[idx].balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(acc[idx].balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}