package polymorphism;

import java.util.Scanner;

public class VehicleDriverEx {
	public static void main(String[] grgs) {
		VehicleDriver vehicleDriver = new VehicleDriver();

		VehicleBus vehicleBus = new VehicleBus();
		VehicleTaxi vehicleTaxi = new VehicleTaxi();

		vehicleDriver.drive(vehicleBus);
		vehicleDriver.drive(vehicleTaxi);

		Scanner scan = new Scanner(System.in);
		System.out.println("이동할 차량을 선택하세요 (1.버스. 2.택시)");
		System.out.println("번호 : ");
		int num = Integer.parseInt(scan.nextLine());
		Vehicle vehicle = null; // 중괄호 안에서 선언하면 메모리가 사라져서
		switch (num) {
		case 1:
			vehicle = new VehicleBus();
			break;
		case 2:
			vehicle = new VehicleTaxi();
			break;
		default:
			break;
		}
		vehicleDriver.drive(vehicle);
	}
}
