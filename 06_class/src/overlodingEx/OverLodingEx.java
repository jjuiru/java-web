package overlodingEx;

public class OverLodingEx {
	public static void main(String[]args){
		OverLoding myCalcu= new OverLoding();
		OverLoding cal = new OverLoding();
		
		int num1 = cal.plus(100, 200);
		System.out.println(num1);

		double num2 = cal.plus(3.14, 0.59);
		System.out.println(num2);
		
		//정사각형의 넓이 구하기
		
		double result1= myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2= myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형의 넓이:"+result1);
		System.out.println("정사각형의 넓이:"+result2);
	}

}
