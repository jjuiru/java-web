package polymorphism;

public class CarTireHankookTire extends CarTire {

	public CarTireHankookTire(String location, int macRotation) {
		super(location, macRotation);	
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return false;
		}else {
			System.out.println("***"+location+"HnkookTire 펑크***");
			return false;
		}
	} 
}
