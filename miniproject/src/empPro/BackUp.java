package empPro;

public class BackUp {
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;
	
	public BackUp(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "BackUp [자료번호:" + empno + "| 이름:" + ename + "| 직무:" + job + "|상급자번호:" + mgr + "| 입사일자:"
				+ hiredate + "| 급여:" + sal + "| 인센티브:" + comm + "| 부서번호:" + deptno + "]";
	}
	

}
