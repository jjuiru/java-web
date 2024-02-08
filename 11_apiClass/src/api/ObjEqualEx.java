package api;

public class ObjEqualEx {

	public static void main(String[] args) {
		ObjEquals obj1= new ObjEquals("blue");
		ObjEquals obj2= new ObjEquals("BLUE");
		ObjEquals obj3= new ObjEquals("red");
		//---Object의 메소드 toString 재정의
		System.out.println(obj1);
		System.out.println(obj1.toString());
		//---Object의 메소드 jashCode 재정의		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		//---Object의 메소드 equals 재정의
		if(obj1.equals(obj2)){
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)){
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
	}
}
