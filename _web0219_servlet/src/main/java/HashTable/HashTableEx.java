package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
 public static void main(String[] args) {
	 Map<String, String> map=new Hashtable<>();
	 
	 map.put("spring", "12");
	 map.put("summer", "123");
	 map.put("fall", "1234");
	 map.put("winter", "12345");
	 Scanner scan = new Scanner(System.in);
	 while (true) {
		 System.out.println("아이디와 비밀번호 입력");
		 System.out.println("아이디: ");
		 String id= scan.nextLine();
		 System.out.println("비밀번호: ");
		 String password= scan.nextLine();
		 System.out.println();
		 
//		 if(map.containsKey(id)) {
		 String str = map.get(id);
		if(map.get(id).equals(password)) { 
			 System.out.println("로그인됨");
			 break;
		 }else {
			 System.out.println("비밀번호 오류");
		 }
		 
//	 }else {
//		 System.out.println("입력한 아이디가 존재하지 않습니다.");
//	 }
	 
 }
}
}
