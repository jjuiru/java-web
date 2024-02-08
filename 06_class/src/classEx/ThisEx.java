package classEx;

public class ThisEx {
	int x;
	int y;
	int z;

	public ThisEx(int x) {

//		this.x = x;
		this(x,0,0);    // 메소드 호출
		System.out.println("1번째 생성자");
	}

	public ThisEx(int x, int y) {
//		this.x = x;
//		this.y = y;
		this(x,y,0);
		System.out.println("2번째 생성자");
	}


	public ThisEx(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("특별명령");
		System.out.println("3번째 생성자");
	}

	@Override
	public String toString() {
		return "ThisEx [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	public static void main(String[] args) {
		ThisEx ex= new ThisEx(100);
		System.out.println(ex);

	}

}
