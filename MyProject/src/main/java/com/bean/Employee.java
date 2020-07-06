package com.bean;

public class Employee {
	protected static int inc=1000;
	private long empNo;
	private String emp_id;
	private String fname;
	private String lname;
	private String email_id;
	private String phone_no;
	private String address;
	
	
	public Employee()
	{
		
	}


	public Employee(String emp_id, String fname, String lname, String email_id, String phone_no, String address) {
		super();
		this.emp_id = emp_id;
		this.fname = fname;
		this.lname = lname;
		this.email_id = email_id;
		this.phone_no = phone_no;
		this.address = address;
	}


	public long getEmpNo() {
		return empNo;
	}


	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}


	public String getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", emp_id=" + emp_id + ", fname=" + fname + ", lname=" + lname
				+ ", email_id=" + email_id + ", phone_no=" + phone_no + ", address=" + address + "]";
	}
	
}
	