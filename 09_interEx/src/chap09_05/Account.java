package chap09_05;

//class Name{}
//class School {} //바깥에 있다면 다른 객체들도 공유할 목적
public class Account {
	 Name name=new Name();
//	 static School school=new Account().new School();
	 static School school=new School();
	 
// Name name;
// School school;

//안에 쓰는 건 Account를 객체화할때 사용하기 위해서이다.그래서 static을 쓰는건뎅..
 class Name{} 
 static class School {}

}
