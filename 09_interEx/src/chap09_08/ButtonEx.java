package chap09_08;

import java.util.Scanner;

public class ButtonEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Button btn = new Button();
		Button.OnClickListener listener = null;
		System.out.println("선택(1.전화, 2.메세지) : ");
		String str = scan.nextLine();

		switch (str) {
		case "1":
			listener = new CallListener();
//	 btn.setOnClickListener(new CallListener());
//	 btn.touch();
			break;
		case "2":
			listener = new MessageListener();
//	 btn.setOnClickListener(new MessageListener());
//	 btn.touch();
			break;
		}
		System.out.println(listener);
	}
}
