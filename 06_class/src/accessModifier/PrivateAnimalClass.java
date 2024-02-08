package accessModifier;

public class PrivateAnimalClass {
	private String name; // private 외부 클래스에서 직접 접근할 수 없다.(메인메소드에서 직접값을 바꿀 수 없다)
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     
     
}
