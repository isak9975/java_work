package ex02_Oracle;

import java.io.ObjectInputStream.GetField;

public class Emp {
	
	private int empno;
	private String ename;
	private String job;
	private int salary;
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	
	
}
