package polymorphism;

public class CarTireMax {
	CarTire frontLeftTire=new CarTire("앞왼쪽",6);
	CarTire frontRightTire=new CarTire("앞오른쪽",2);
	CarTire backLeftTire=new CarTire("뒤원쪽",3);
	CarTire backRightTire=new CarTire("뒤오른쪽",4);
	
	int run() {
		System.out.println("[자동차가 달립니다]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
				
		}	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
