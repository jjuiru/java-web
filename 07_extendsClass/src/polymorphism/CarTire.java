package polymorphism;

public class CarTire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public CarTire(String location, int macRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return false;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
	}
}
