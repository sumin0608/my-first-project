package Emp.vo;

import java.io.FileInputStream;
import java.io.Serializable;
import java.sql.Timestamp;
//®ü³b¥Ü½dª©
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Timestamp hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	
	public Emp() {
	}
	
	public Emp(Integer empno, String ename, String job, Integer mgr, Timestamp hiredate, Double sal, Double comm,
			Integer deptno) {
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

	public Integer getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public Timestamp getHiredate() {
		return hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public Double getComm() {
		return comm;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
	
}
