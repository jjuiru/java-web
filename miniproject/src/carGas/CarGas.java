package carGas;

public class CarGas {

	int gas;

	void setGas(int gas) { //gas 초기화
		this.gas = gas;
	}

	boolean isLeftGas() { //가스가 없을때 false 있을때 true 리턴
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // 리턴
		} 
			System.out.println("gas가 있습니다.");
			return true;		
	}

	void run() { 
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량:" + gas + ")");
				return; //메소드 내에서 break; 여기서는 break를 사용해도 된다.
				// 하지만 브레이크 이후에도 코드가 존재하면 return을 사용.
			}
		}
	}

}