package api;

import java.util.HashMap;

public class HashStudentEx {

	public static void main(String[] args) {
		HashMap<HashStudent,String> hashMap= new HashMap<HashStudent, String>();
		// new Student1의 점수 95를 저장
		hashMap.put(new HashStudent("1"), "95");
		
		// new Student1로 점수를 읽어옴
		String score= hashMap.get(new HashStudent("1"));
		System.out.println("1번 학생의 총점: "+ score);
				
	}
}
