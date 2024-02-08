package sec01.exam04;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// set 은 인덱스가 없어서 값을 추출하려면 향상된 for문을 사용하거나, iterator 를 사용한다.
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
//		for(String st: set) {
//			System.out.println(st);
//		}
//		
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) { //자료가 있는지 확인하여 true false 출력
//			String str= it.next(); //있으면 자료를 가져와서 str에 저장하여 프린트 
//			System.out.println(str);
//		}
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();		
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}
}

