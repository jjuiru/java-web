package chap04;

public class ContinEx {

	 public static void main(String[]args) {
		aa:for(int i=0;i<10;i++) {
			 for (int j=0;j<10;j++) {
				 if(i==3&&j==3) {
					 continue aa; //반복문의 바로 위로 나감
				 }
				 System.out.printf("(%d, %d)\n",i,j);				 
			 }
		}
	 }
}
