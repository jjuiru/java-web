package overlodingEx;

public class OverLoding {
	//-------------------------------calculex----
	int plus(int x, int y) { // 타입이 다르면 오류 x
		return x + y;
	}

	double plus(double x, double y) {
		return x + y;
	}
//------------------------------------------overlodingex---
	double areaRectangle(double x) {
		return x * x;
	}

	double areaRectangle(double x, double y) {
		return x * y;
	}
}
