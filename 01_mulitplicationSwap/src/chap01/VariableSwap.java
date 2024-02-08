package chap01;

public class VariableSwap {
public static void main(String[]args) {
	int x= 10;
	int y= 20;
     System.out.println("x:"+x+"y;"+y);
     
     int temp=x;     //초기화를 이용한 교환
     x=y;
     y=temp;        //프린트 포멧
     System.out.printf("x는 %d, y는 %d\n",x,y); //"x:"+x+"y;"+y
}//swap 자료교환
}
