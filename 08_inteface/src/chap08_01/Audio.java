package chap08_01;

public class Audio implements RemoteControl { //인터페이스 상속시 
	private int volume;

	public Audio () {}
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			//지금 티비 볼륨이 리모콘의 맥스볼륨보다 크면 티비 볼륨은 0이 된다.
			this.volume = RemoteControl.MIN_VOLUME;
		} else { // 맥스 볼륨에 도달하지 않으면 그 볼륨을 출력한다.
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
		
	}
}
