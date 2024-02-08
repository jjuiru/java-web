package boxing;

public class Boxing {

	public static void main(String[] args) {
		Integer num1= new Integer(3);
				Integer num2= new Integer(3);	
				System.out.println(num1==num2);
				System.out.println(num1.equals(num2));
		
		//박싱
		int x = 100;
		String sr = "가나다";
		Integer obj2 = Integer.valueOf("100");
		Integer obj1 = 300;
		System.out.println(obj1);
		
		//언박싱
		int y = obj1.intValue();
		System.out.println(y);
		//언박싱 잘됐는지 확인
		int z = x + obj1;
		System.out.println(z);
		
		System.out.println(x==obj2);
//		System.out.println(x,!=obj1);
	}
}
