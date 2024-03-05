package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {

	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() { //의존성 주입> dao 객체가 service에 의존한다.
		memberDao=new MemberDao();
		regSvc=new MemberRegisterService(memberDao);
		pwdSvc=new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
		
	}
	
	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
	
	
}
