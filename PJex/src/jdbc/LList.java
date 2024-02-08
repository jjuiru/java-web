package jdbc;

public class LList {
 int empno;
 String ename;
 Double sal;
 
 
 

public LList(int empno, String ename, Double sal) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.sal = sal;
}



@Override
public String toString() {
	return "LList [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
}
 
 
}
