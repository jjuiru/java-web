package spring;

public class ChangePasswordService {
 private MemberDao memberDao;
 
 //비밀번호 바꾸기 클래스
 public void changePassword(String email,String oldPwd, String newPwd) {
	 // 이메일(id) 옛비번 현비번을 매개변수로 받는다.
	 Member member= memberDao.selectByEmail(email);
	 // 현재 이메일이 있으면 해시 주소 가져와 멤버에 저장한다. 
	 if(member==null)throw new MemberNotFoundException();
	 //가져온 값이 없다면 계정이 없다는 오류메세지 출력
	 member.changePassword(oldPwd, newPwd);
	 //아니라면 비밀번호를 바꾼다. 
	 memberDao.update(member);
	 //???????????
 }
 public void setMemberDao(MemberDao memberDao) {
	 // 주입객체를 저장한다. 
	 this.memberDao=memberDao;
 }
}
