package com.example.demo.entity;

public class Employee 
{
	private int eid;
	private String ename;
	private int eage;
	private int esal;
	
	public Employee(int eid, String ename, int eage, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esal = esal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esal=" + esal + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	


}
