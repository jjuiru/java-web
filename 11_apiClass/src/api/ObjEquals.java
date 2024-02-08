package api;

public class ObjEquals {
	public String id;

	public ObjEquals(String id) {
		this.id = id;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ObjEquals의 객체"+"["+id+"]";
	}



	@Override          //string은 이미 재정의 과정을 한 클래스이기 때문에 아래 과정이 없이도 바로 문자열을 비교할 수 있다.
	public boolean equals(Object obj) {//모든 매개변수가 들어올 수 있다.
		if (obj instanceof ObjEquals) {//해당 클래스 타입으로 객체생성이 되었는지 확인
			ObjEquals member = (ObjEquals) obj;
			if (id.equalsIgnoreCase(member.id)) {//대소문자열을 가리지 않고 비교하기 위해서
				return true;
			}
		}
		return super.equals(obj);
	
	}
	@Override
	public int hashCode() {
//		return id.hashCode();//id의 값이 다르면 해시코드 값이 다르다.
		return id.toLowerCase().hashCode(); //id의 값 대소문자가 달라도 해시코드 값이 같다.
	}
}
