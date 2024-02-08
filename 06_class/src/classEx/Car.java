package classEx;

public class Car {
	String company; // 필드-객체의 성격을 뜻한다.
	String model;
	String color;
	int maxSpeed;

	public Car() { // 생성자-클래스이름과 같고 중괄호가 있다. 리턴타입 없이 만든다.
		System.out.println("Car()");
	}

	public Car(String str) { //  생성자 이름이 같으면 오류. 하지만 내용이 다르면 가능
		company=str;
	}
	
	public Car(String str,String str1) { //  생성자 이름이 같으면 오류. 하지만 내용이 다르면 가능>오버로딩
		company=str;
		model= str1;
	}
	

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	public Car(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

}
