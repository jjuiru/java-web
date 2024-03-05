package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import spring.MemberRegisterService;

public class MainForSpring {
	
	private static ApplicationContext ctx=null;

	public static void main(String[] args) throws IOException {
		ctx= new AnnotationConfigApplicationcontext(AppCtx.class);
		
		BufferedReader reader= new BufferdReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("명령어를 입력하세요:");
			String command= reader.readLine();
			
			printHelp();
		}
	}
	
	private static void processNewCommand(String[]arg) {
		if(arg.length!=5) {
			printHelp();
			return;
		}
		MemberRegisterService regSvc=ctx.getBean("memberRegSvc")
	}

}
