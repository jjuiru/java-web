package jdbc;

import chap09_09.RemoteControl;

public class RemoAnonyEx {

	public static void main(String[] args) {
		RemoAnony anony= new RemoAnony();
		anony.field.turnOn();
		anony.method1();
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트TV");				
			}			
			@Override
			public void turnOff() {
				System.out.println("스마트TV");
			
			}
		});
	}
}
