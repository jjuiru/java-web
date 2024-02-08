package arrayAndCmd;

public class ArrayCmdStrEx {

	public static void main(String[] ar) {
		if (ar.length != 2) { // cmd 에서 입력받은 배열이 2개가 아닐경우 강제종료
			System.out.println("값의 수가 부족합니다.");
			System.out.println("시스템 종료");
			System.exit(0);
		}
		String str= ar[0]; //2개가 아닐경우 첫번재 배열 출력
		System.out.println(ar[0]);
	}
}
