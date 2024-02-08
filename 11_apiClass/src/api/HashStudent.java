package api;

public class HashStudent {
private String sutdentNum;

public HashStudent(String studentNum) {
	this.sutdentNum=studentNum;
}
public String getStudentNum() {
	return sutdentNum;
	
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}


}
