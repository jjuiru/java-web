package classEx;

public class CirclePizzaClassEx {

	public static void main(String[] args) {
		CirclePizzaClass[] c; // 서클 클래스 배열의 변수이다.
		c = new CirclePizzaClass[5]; // 인덱스 5개 생성
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new CirclePizzaClass(i);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}

}
