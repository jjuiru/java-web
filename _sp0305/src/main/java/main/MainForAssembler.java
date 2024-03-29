package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import assembler.Assembler;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class MainForAssembler {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader는 Java에서 입력 스트림으로부터 데이터를 읽는 데 사용되는 클래스이다. 
		//system.in으로 키보드로 받아온 바이트 스트림을 inputStrieamReader를 통해 문자 스트림으로 변환 변환된 문자를 래핑해서 읽어온다.
		while (true) {
			System.out.println("명령어를 입력하세요");
			//리더 값을 불러와 exit일때 종료한다.
			String command = reader.readLine();
			if (command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다");
				break;
			}
			//리더 값을 불러와 사용자가 입력한 문자가 new 로 시작하면 실행 
			if (command.startsWith("new")) {
				processNewCommand(command.split(" "));
				//사용자가 입력한 명령어를 ""공백 기준으로 분리 
				continue;
			} else if (command.startsWith("change")) {
				processChangeCommand(command.split(" "));
				continue;
			}
			printHelp();
		}
	}

	private static Assembler assembler = new Assembler();
	//static으로 바로 사용가능하다. assembler를 호출해서 객체를 생성해서 각 서비스 메소드와 dao에 주입했다.

	private static void processNewCommand(String[]arg) {
		// 문자열이 new포함 5개의배열로 저장되지 않았다면 메뉴얼을 출력해준다.
		if(arg.length!=5) {
			printHelp();
			return;
		}
		
		MemberRegisterService regSvc= assembler.getMemberRegisterService();
		// 어셈블러로 바로 사용
		RegisterRequest req= new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		
		if(!req.isPasswordEqualToConfrmPassword()) {
			System.out.println("암호와 확인이 일치하지않습니다.");
			return;
		}try { 
			regSvc.regist(req);
			System.out.println("등록했습니다.\n");

			}catch(DuplicateMemberException e) {
				System.out.println("이미 존재하는 이메일입니다.\n");
			}
	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}
		ChangePasswordService changePwdSvc = assembler.getChangePasswordService();
		// 어셈블러로 바로 사용
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.\n");

		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		} catch (WrongIdPasswordException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}

	private static void printHelp() {
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println();

	}

}
