package bubble;

public class BubbleEx {
		
	public static void aaa(int a[]) {
		for(int n : a) {
			System.out.print(n + ",");
		}
		System.out.println(""); // 칸 띄워주기
	}
//--------------------------------------------
	public static void main(String[]args) {
		int a[]= {10,3,1,4,2};
		int num=0;
		for(int i=0; i<a.length;i++) {           // ------------5번 반복
			for(int j=0; j<a.length-1;j++) {     //-------------3번 반복
				if(a[j] > a[j+1]) {              //-------------첫번째가 두번째보다 작을때
					num= a[j];                   // -----------swap
					a[j]=a[j+1];                 
					a[j+1]=num;
					aaa(a);
				}
			}
		}	
	}
}
