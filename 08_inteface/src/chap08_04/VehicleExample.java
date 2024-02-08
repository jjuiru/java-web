package chap08_04;

import java.util.ArrayList;
import java.util.List;

class Myclass {
}

interface Inter {
}

class Acc { // arraylist 의 타입은 생성된 제네릭 타입 안에 필드값을 정의하여 여러 객체를 저장할 수 있다.
	Inter inter;
	Vehicle vehicle;
	Myclass mc = new Myclass();
	int x;
	String str;

	String method() {
		return str;
	}
}

public class VehicleExample {

	public static void main(String[] args) {
		new Bus().checkFare(); // 변수호출이 없어 일회용으로만 사용가능 "승차요금을 체크합니다" 호출

		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); // Vehicle 안에 체크페이스의 추상 메소드가 없어서 사용 불가
		if(vehicle instanceof Bus) {//instanceof를 사용하여 다운캐스팅이 가능한지 체크
			System.out.println("가능"); //가능
		}
		Bus bus = (Bus) vehicle; //다운캐스팅 가능
//		Bus bus1 = new Bus();
		bus.checkFare(); // 버스안의 오버라이딩 되지않은 메소드 실행 가능
		//다운 캐스팅을 하는 이유는 Vehicle이 Bus의 부모가 맞는지 확인하는 과정이다.

		// ----------------------

		String str = new String("테스트");//스트링 타입의 변수 선언 "테스트"
		String str1 = "";
		for (int i = 0; i < 100; i++) {
			// 많은 텍스트를 뽑아낼 때 성능 고민 필요?? 이런 형식으로 많은 양의 문자열을 저장할 때 버퍼가 생길 수 있다.
			str1 += str;
		}
//		System.out.println(str1);

		List<Acc> list = new ArrayList<>(); //
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
//		list.add(new Acc());
		
		for (Acc obj : list) {
			Acc acc = obj;
			System.out.println(acc);
		}
		
		for (Object obj : list) {
			Acc acc = (Acc) obj;
			System.out.println(acc);
		}
//		Vehicle vehicle = new Bus();

//		vehicle.run();
		// vehicle.checFare();
	}
}
