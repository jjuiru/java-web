package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer>map= new HashMap<>();
		//제네릭 안에서는 기본타입은 사용이 불가하다.
		// 키값과 정보를 함께 입력한다.
		// 키값을 가져오면 그에 해당하는 정보를 찾아온다.
		map.put("김하나", 95);
		map.put("이하나", 70);
		map.put("박하나", 80);
		map.put("김하나", 85);
		// 키값이 중복되면 최신에 입력한 값이 남고 이전값은 지워둔다.
		Scanner scan= new Scanner(System.in);
		String key= scan.nextLine();
		System.out.println(map.get(key)); // 이하나가 가진 정보
		System.out.println(map.size()); //들어있는 정보의 수
	}
}
