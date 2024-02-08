package api;

class Car {
}

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Car.class; //1 bin의 클래스 파일을 불러오는 코드
		//---이미지 저장 경로 얻기
		String str= clazz.getResource("photo2.jpg").getPath();
		System.out.println(str);
		// /D:/JAVA%ec%98%88%ec%a0%9c/chap11/bin/api/photo2.jpg
		String str2= clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
        // /D:/JAVA%ec%98%88%ec%a0%9c/chap11/bin/api/images/photo2.jpg
//---------1		
		System.out.println(clazz);
		// class api.Car 출력
		System.out.println(clazz.getName());
		//class java.lang.Class 출력
		System.out.println(clazz.getSimpleName());
		//Car
		System.out.println(clazz.getPackageName());
		//api
//	-------	2
		Class clazz2= Class.forName("api.Car"); //클래스 주소 입력
		System.out.println(clazz2);
		// class api.Car 출력
		System.out.println(clazz2.getName());
		//class java.lang.Class 출력
		System.out.println(clazz2.getSimpleName());
		//Car
		System.out.println(clazz2.getPackageName());
		//api
//  ------- 3		
		Car car= new Car(); // 클래스 객체 생성
		Class clazz3= car.getClass();
		System.out.println(clazz3);
		// class api.Car 출력
		System.out.println(clazz3.getName());
		//class java.lang.Class 출력
		System.out.println(clazz3.getSimpleName());
		//Car
		System.out.println(clazz3.getPackageName());
		//api);
	}
}
