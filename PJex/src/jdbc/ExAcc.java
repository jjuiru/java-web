package jdbc;

public class ExAcc {
	int empno=0;
	String ename=null;
	String job=null;
	int mgr=0;
	String hiredate;
	Double sal=null;
	double comm = 0.0;
	int deptno = 0;
			
	

	public ExAcc(int empno, String ename, String job, int mgr, String hiredate, Double sal, double comm, int deptno) {
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
		return "List [empno:" + empno + "| ename:" + ename + "| job:" + job + "| mgr:" + mgr + "| hiredate:" + hiredate
				+ "| sal:" + sal + "| comm:" + comm + "| deptno:" + deptno + "]"+"\n";
	}



	public int getMar() {
		return mgr;
	}



	public String getHiredate() {
		return hiredate;
	}



	public double getComm() {
		return comm;
	}



	public int getDeptno() {
		return deptno;
	}



	public void setMar(int mar) {
		this.mgr = mar;
	}



	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}



	public void setComm(double comm) {
		this.comm = comm;
	}



	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}



	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public Double getSal() {
		return sal;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	
}
