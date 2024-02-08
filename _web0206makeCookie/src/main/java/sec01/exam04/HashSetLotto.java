package sec01.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		//무작위의 로또 번호를 담을 set 생성
		Set<Integer> lottoNumbers = new HashSet<>();
		
		//중복되지 않은 6개의 로또 번호 선택 
		Random random = new Random();
		while(lottoNumbers.size() <6) {//6개의 값이(중복은 제외) 전부 차면 종료
			int number = random.nextInt(45)+1;
			lottoNumbers.add(number);
		}
		
		System.out.println("로또 번호: ");
		List<Integer> sortedNumbers = new ArrayList<>(lottoNumbers);
		// 혹시 인덱스를 사용할 수 있으니 set 컬렉션 값을 arrayList 에 넣는다.
		Collections.sort(sortedNumbers); //숫자를 정렬해준다.
		for(int num: sortedNumbers) {
			System.out.println(num+ " ");
		}
	}
}
