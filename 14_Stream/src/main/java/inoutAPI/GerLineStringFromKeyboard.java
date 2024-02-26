package inoutAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class GerLineStringFromKeyboard {

	public static void main(String[] args) throws IOException {
//		InputStream is=System.in;
//		Reader reader=new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		// 키보드로 cmd에 입력한 값을 모두 저장했다가 엔터키가 눌리면 출력
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//위 코드를 한줄로 정리
		
		Scanner scan =new Scanner(System.in);
//보조 스트림 없이 더 손쉽게 문자열을 읽을 수 있다.
		while(true) {
			System.out.println("입력하세요: ");
//			String lineStr =br.readLine();
			String lineStr =scan.nextLine();
			if(lineStr.equals("q")|| lineStr.equals("quit")) {
				break;
			}
			
			System.out.println("입력된 내용: "+ lineStr);
		}
		System.out.println("종료합니다.");
		scan.close();

	}

}
