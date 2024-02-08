package login0116;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class LoginEx {
	static Scanner scan = new Scanner(System.in);
	static List<Account> list = new ArrayList<>();

	static void menu1St() {
		System.out.println("---------------------------------------------------");
		System.out.println("|1.회원출력 |2.회원등록 |3.입출금조회|4.파일저장 |5.파일읽기 | 6.종료 |");
		System.out.println("---------------------------------------------------");
	}

	static void menu2St() {
		System.out.println("-------------------------------------------");
		System.out.println("|1.로그인 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료 |");
		System.out.println("-------------------------------------------");
	}

	static void main2St(Account account) {
		while (account.isRun2()) {
			menu2St();
			System.out.println("메뉴를 입력세요 :");
			int menuNum2 = Integer.parseInt(scan.nextLine());
			switch (menuNum2) {
			case 1:
				System.out.println("<로그인 해주세요>");
				System.out.println("id :");
				String id = scan.nextLine();
				System.out.println("Pw :");
				String pw = scan.nextLine();
				account.balanceLogin(id, pw, list);

				break;

			case 2:
				System.out.print("입금금액 :");
				int balance = Integer.parseInt(scan.nextLine());
				account.sum(balance);

				break;

			case 3:
				System.out.print("출금금액 :");
				int balance2 = Integer.parseInt(scan.nextLine());
				account.sum2(balance2);
				break;

			case 4:
				account.getBalance();
				break;

			case 5:
				account.setRun2(false);
				break;
			}
		}
	}

	@SuppressWarnings("unchecked")
	static void main1St(Account account) throws IOException, ClassNotFoundException {
		while (true) {
			menu1St();
			account.setRun2(true);
			System.out.print("메뉴를 입력세요 :");
			int menuNum = Integer.parseInt(scan.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("<Account List>");
				for (Account acc : list) {
					System.out.println(acc);
				}
				break;
			case 2:
				System.out.println("<회원 등록을 해주세요>");
				System.out.print("이름 :");
				String name = scan.nextLine();
				System.out.print("i.d :");
				String id = scan.nextLine();
				System.out.print("p.w :");
				String pass = scan.nextLine();
				System.out.print("생년월일 :");
				String age = scan.nextLine();
				System.out.print("잔고 :");
				int balance = Integer.parseInt(scan.nextLine());
				list.add(new Account(name, id, pass, age, balance));

				break;
			case 3:
				main2St(account);
				System.out.println("<입출금 메뉴로 이동합니다>");

				break;

			case 4:
				System.out.println("<파일을 저장합니다>");
				FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				oos.flush();
				oos.close();

				break;
			case 5:

				System.out.println("<파일을 읽어옵니다>");
				FileInputStream fis = new FileInputStream("c:/temp/acc.db");
				ObjectInputStream ois = new ObjectInputStream(fis);
				list = (List<Account>) ois.readObject();
				for (Account acc : list) {
					System.out.println(acc);
				}
				ois.close();
				break;
			case 6:

				System.out.println("<시스템을 종료합니다>");
				System.exit(0);
			}

		}

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account account = new Account("name", "id", "pass", "age");
		main1St(account);

	}
}
