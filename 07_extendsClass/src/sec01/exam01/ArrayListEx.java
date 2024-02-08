package sec01.exam01;

import java.util.ArrayList;
import java.util.List;
class Student {
	String name;
	int kor;
	public Student(String name, int kor) {
		this.name=name;
		this.kor=kor;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}
	
}

public class ArrayListEx {
	
	public static void main(String[] args) {
		Student[] strArr = new Student[100]; // 인덱스 갯수 고정(고정형 배열/처리속도 빠름)
//-----------------------배열에 객체넣기
		List<Student> slist = new ArrayList<>();
		slist.add(new Student("홍길동",90));
		slist.add(new Student("홍길철",84));
		slist.add(new Student("홍길순",97));
		for(Student student : slist) {
			System.out.println(student);
		}
		// '어레이리스트라고' 읽음, 문자열을 인덱스 갯수 상관없음(가변적인 배열)

		
		
		
//------------------------		
		
		ArrayList<String> alsist=new ArrayList<String>();
		List<String> list = new ArrayList<>(); //
		list.add("홍길동");
		list.add("김하나");
		list.add("강하나");
		for (String str : list) {
			System.out.println(str);
		}
		list.set(1, "박하나");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
