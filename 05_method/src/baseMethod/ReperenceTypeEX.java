package baseMethod;

public class ReperenceTypeEX {

	// 참조타입 공부
	public static void main(String[] args) {

		int age = 32; // 기본타입> Stack에 값이 저장된다(필드내부)
		String name = "지현"; // 참조타입 Stack에 번지저장 Heap 영역에 값이 저장된다(번지가 있는 객체)

//	   int[] intArray= null;     // Q배열 선언시 초기 인덱스 값은?> 인덱스는x 스텍 영역에 null이 저장
//	   intArray[0]= 10;
//	   
	    String str0= null; //>Stack 영역만 널로 초기화> 힙스텍엔 데이터가 없기 때문에 오류. 값이없음
		str0="가나다"; // 안에 값을 넣어두면 오류가 발생하지 않음 >초기화됨
		
		String str = new String("가나다"); // > String[]str={가나다};인가?? 근본적으로 다르다고 한다
		System.out.println(str.length()); // > 3출력 

		String name1 = "이지현";
		String name2 = "이지현"; // 똑같은 값은 같은 번지에 저장됨
		System.out.println(name1 == name2);// > true 번지비교
		System.out.println(name1.equals(name2));// > true 문자자체 비교
		// 그러나
		String name3 = new String("이지현");
		String name4 = new String("이지현"); // new를 사용해 서로 다른 번지에 저장
		System.out.println(name3 == name4);// > false 번지비교
		System.out.println(name1.equals(name2));// > true 문자자체 비교

	}

}
