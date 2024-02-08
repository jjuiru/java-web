package cli_Base;

public class AccountArray {
	String name;
	String ssn;
	String tel;
	int balance;

	String id;
	String pw;

	public AccountArray(String name, String ssn, String tel) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Account [name(ID)=" + name + ", ssn(PW)=" + ssn + ", tel=" + tel + "]";
	}

	public AccountArray(String iD, String pW) {
		super();
		this.id = iD;
		this.pw = pW;

	}
}
