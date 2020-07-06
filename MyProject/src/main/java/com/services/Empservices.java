package com.services;

public interface Empservices {

	int createEmp(String emp_id, String fname,String lname,String email_id,String phone_no,String address);
	boolean checkemp(String empid);
}
