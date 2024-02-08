package classEx;

public class AccountClassConstructor {
	private String name;
	private int balance; //은행 잔고(마이너스 통장이 아닐 경우)
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
//		if(balance<0) { // 실수가 될 수 있기 때문에
//			this.balance=0;
//		}
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>0) {
			this.balance=balance;
		}
	}
}
