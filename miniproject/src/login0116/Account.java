package login0116;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable { // 내용을 배열로 정리해준다
	private String name;
	private String id;
	private String pass;
	private String age;
	private int balance;
	private boolean run2 = true;
	private boolean run = true;
	private Account acc1;

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}

	public int sum(int balance) {
		if (balance < 0) {
			balance = 0;
			this.balance += balance;
		} else {
			this.balance += balance;
		}
		return balance;
	}

	public int sum2(int balance) {
		if (balance < 0) {
			balance = 0;
			this.balance -= balance;
		} else {
			this.balance -= balance;
		}
		return balance;
	}

	public int getBalance() {
		System.out.println("잔액 : " + balance);
		return balance;

	}

	public void setBalance(int balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}

	public Account balanceLogin(String id, String pw, List<Account> list2) {
		for (Account acc1 : list2) {
			if (acc1.getId().equals(id) && acc1.getPass().equals(pw)) {
				System.out.println("로그인 성공!");
				System.out.println(acc1.getId());
				return acc1;
			} else {

			}
		}

//		for (int i = 0; i < list2.size(); i++) {
//			Account acc = list2.get(i);		
//			if (acc.getId().equals(ballog)) {			
//				System.out.println("로그인 성공!");
//			} else {			
//				System.out.println("로그인 실패!");
//			}			
//		}
		return null;
	}

	public Account(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	public Account(String name, String id, String pass, String age) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
	}

	public Account(String name, String id, String pass, String age, int balance) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", pass=" + pass + ", age=" + age + ", balance=" + balance
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
