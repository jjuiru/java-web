package instansOf;

public class InstanceOf {

	public static void main(String[] args) {
//		Parent parentA =new Child();
//		mathod2(parentA);
		
//		Parent parentB=new Parent();
		Parent parentB=new Child();
		if(parentB instanceof Child) {
		mathod2(parentB);
		}else {
			System.out.println("변환 불가");
		}
	}
	
	public static void mathod2(Parent parent) {
		Child child= (Child) parent;
		System.out.println("변환 가능");
	}
}
