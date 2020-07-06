package com.EmpservicesImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Employee;
import com.services.Empservices;

public class EmpservicesImpl implements Empservices {

	Employee e;
	PreparedStatement stmt=null;
	@Override
	public boolean checkemp(String empid)
	{
		int t=0;
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_volt","root","");
			stmt=con.prepareStatement("select emp_id from employee_details where emp_id=?");
			stmt.setString(1, empid);
		//	ResultSet rs=stmt.executeQuery();
			t=stmt.executeUpdate();
			if(t==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int createEmp(String emp_id, String fname, String lname, String email_id, String phone_no,
			String address) {
		long empNo;
		int t;
		e=new Employee(emp_id,fname,lname,email_id,phone_no,address);
		try
		{
			if(checkemp(emp_id)==false)
			{
				//System.out.println("The id already exist");
			}
			else
			{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_volt","root","");	
		stmt=con.prepareStatement("Insert into employee_details(Emp_id,fname,lname,Email_id,mobile_no,address,role,user_id)"
				+ " values(?,?,?,?,?,?,?,?)");
		//stmt.setLong(1, e.getEmpNo());
		stmt.setString(1,e.getEmp_id());
		stmt.setString(2,e.getFname());
		stmt.setString(3,e.getLname());
		stmt.setString(4,e.getEmail_id());
		stmt.setString(5,e.getPhone_no());
		stmt.setString(6,e.getAddress());
		stmt.setInt(7,2);
		stmt.setString(8,fname+lname);
	/*	stmt.setLong(1, 1001);
		stmt.setString(2,emp_id);
		stmt.setString(3,fname);
		stmt.setString(4,lname);
		stmt.setString(5,email_id);
		stmt.setString(6,phone_no);
		stmt.setString(7,address);
		stmt.setInt(8,2);
		stmt.setString(9,fname+lname);
		*/
		
		t=stmt.executeUpdate();
		return t;
	}
		}
	catch(SQLException e){
		e.printStackTrace();
	}
		return 1;
	}


	
}
