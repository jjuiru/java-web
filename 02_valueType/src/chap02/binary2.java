package chap02;

public class binary2 {
	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수 0b사용 1x2(3) + 0x2(2)+ 1x2(1) +1x2(0) =8+0+2+1 =11
		int var2 = 0206; // 8진수 2x8(2) +0x8(1)+ 6x8(0) = 128+0+6=134
		int var3 = 365; // 10진수 365
		int var4 = 0xb3; // 0x 사용 16진수 11x16(1)+3x16(0) = 176+3=179

		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
	}
}
