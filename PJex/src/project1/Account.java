package project1;

import java.util.List;

public class Account {
	private String name;
	private String id;
	private String pass;
	private String ssn;
	private String tel;
	private int balance;
	int index;

	
	


	@Override
	public String toString() {
		return "계정 [이름 :" + name + ", id :" + id + ", pass: " + pass + ", ssn :" + ssn + ", tel :" + tel
				+ ", 잔고 :" + balance + ", 회원번호 :" + index+1 + "]";
	}


	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}


	public String getPass() {
		return pass;
	}


	public String getSsn() {
		return ssn;
	}


	public String getTel() {
		return tel;
	}


	public int getBalance() {
		return balance;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public Account(String name, String id, String pass, String ssn, String tel, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.ssn = ssn;
		this.tel = tel;
		this.balance = balance;
	}
	



	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public Account array( List<Account> list) {
		for (Account arr : list) {

		}
		return null;

	}



}
