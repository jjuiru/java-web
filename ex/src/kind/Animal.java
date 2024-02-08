package kind;

public abstract class Animal {  //동물이라는 대그룹의 추상메소드
 public String kind; // 종류를 필드선언
 
 public void breathe() { // 숨을 쉰다는 동작의 메소드
	 System.out.println("숨을 쉽니다.");
 }

 public abstract void sound(); // 소리 추상메소드
}
