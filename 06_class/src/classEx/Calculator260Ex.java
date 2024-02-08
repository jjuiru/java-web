package classEx;

public class Calculator260Ex {
private	int plus(int x, int y) {  //클래스 내부에서는 접근가능. 외부로 호출은 불가
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = this.plus(x, y); //this. 은 내부호출 생략도 가능
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = this.avg(7, 10);
		println("실행결과 : " + result);

	}

	void println(String message) {
		System.out.println(message);
	}

}
