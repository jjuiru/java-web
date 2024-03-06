package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

//조립기 객체를 생성해서 주입해주는 클래스다. 
//객체, 클래스를 수정할 때 조립기에서 수정하면 유지 보수가 간편하다.
//조립기 없이 모든 클래스에서 객체를 new로 생성한다면 매번 클래스마다 이름을 수정해야 한다. 
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
