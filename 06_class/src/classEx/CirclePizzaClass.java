package classEx;

public class CirclePizzaClass {
	int radius;
	String name;

	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public CirclePizzaClass(int radius) {
		this(radius, "어던 원");
	}

	public CirclePizzaClass(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}

//--------------------------------------------------------------
	public static void main(String[] args) {
		CirclePizzaClass pizza;
		pizza = new CirclePizzaClass(10,"자바피자");
//		pizza = new Circle(); //기본생성자가 필요
//		pizza.radius = 10;
//		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 :" + area);
		
		CirclePizzaClass dount;
		dount = new CirclePizzaClass(2,"자바도넛");
//		dount = new Circle();
//		dount.radius = 2;
//		dount.name = "자바도넛";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은 :" + area);
		
		
		
	}
}