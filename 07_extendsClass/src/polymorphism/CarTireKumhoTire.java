package polymorphism;

public class CarTireKumhoTire extends CarTire {

		public CarTireKumhoTire(String location, int macRotation) {
			super(location, macRotation);	
		}

		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.println(location+"KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
				return false;
			}else {
				System.out.println("***"+location+"KumhoTire 펑크***");
				return false;
			}
		} 
	}


