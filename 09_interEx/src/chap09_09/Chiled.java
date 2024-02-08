package chap09_09;

class Parent1{
	void parentMeghod() {}
}
public class Chiled {
 Chiled0 field=new Chiled0() {
	 int childFeid; //자식이 가지고있는 필드
	 void chiledMethod() {} //자식이 가지고 있는 메소드
 }; //필드: Parent의 익명 자식 객체 생성
 
 void method() {
	 field.parentMethod(); //부모가 가지고있는 메소드기 때문에 접근 가능
	 
	 //타입을 쓸 수 있으려면 이름이 있어야한다.
 } //Aa 클래스 메소드
}
