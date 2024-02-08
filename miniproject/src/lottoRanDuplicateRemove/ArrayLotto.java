package lottoRanDuplicateRemove;

import java.util.Random;

public class ArrayLotto {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // 0~5 인덱스값
		Random rand = new Random(); // 랜덤값 변수선언

		// 아래는 lotto 배열안에 6개의 랜덤 로또 번호를 넣는 코드이다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.println(lotto[i]);

		}

		System.out.println("-----------------------------------");
		// 배열의 값을 빠르게 불러올 때
		for (int val : lotto) { // 배열변수 안에 있는 데이터 타입을 선언해서 넣는다.
			System.out.println(val); // lotto 배열 안에있는 값을 출력한다.
		}

	}

}
