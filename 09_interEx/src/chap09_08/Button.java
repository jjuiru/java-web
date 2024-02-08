package chap09_08;

public class Button {
 OnClickListener listener;
 
 void setOnClickListener(OnClickListener listener) {//매개변수 다형성
	 this.listener=listener;
 }
	 void touch() {
		 listener.onClick();
	 }
	 static interface OnClickListener{
		 void onClick();
	 }
 }