package carPactory.mycompany;

import carPactory.hankook.SnowTire;
import carPactory.hankook.Tire;
import carPactory.hyundai.Engine;
import carPactory.kumho.BigWidthTire;

//import sec06.exam02.hyundai.Engine; // hyundai.* 이면 패키지 아래 모든 클래스 사용가능

public class Car {
	Tire tire= new Tire(); // 같은 이름의 클래스일 경우 자동완성시 선택해야한다.
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	carPactory.kumho.Tire tire4 = new carPactory.kumho.Tire(); // 이렇게 써도 된다.
}
