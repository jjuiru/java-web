package accessModifier;

public class PrivateAnimalClassEx {
	public static void main(String[] args) {
		PrivateAnimalClass ani = new PrivateAnimalClass();
//		ani.name = "사자"; // private 설정 >직접 접근 안됨 필드에>
		ani.setName("사자");
	}
}
