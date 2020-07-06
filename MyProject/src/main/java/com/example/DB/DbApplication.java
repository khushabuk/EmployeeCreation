package com.example.DB;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.EmpservicesImpl.EmpservicesImpl;
import com.services.Empservices;
@SpringBootApplication

public class DbApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		SpringApplication.run(DbApplication.class, args);
		Empservices e=new EmpservicesImpl();
	
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Create employee");
		//System.out.print("2.View Employee");
		String emp_id,lname,fname,email_id,phone_no,address;
	
				System.out.println("Enter the emp_id ");
				emp_id=sc.next();
			System.out.println("Enter the fname ");
				fname=sc.next();
				System.out.println("Enter the lname ");
				lname=sc.next();
				System.out.println("Enter the email_id ");
				email_id=sc.next();
				System.out.println("Enter the phone_no ");
				phone_no=sc.next();
				System.out.println("Enter the address ");
				address=sc.next();
		//	System.out.print(e.checkemp(emp_id));
		e.createEmp(emp_id,fname,lname,email_id,phone_no,address);
		
		
		
	}

}
