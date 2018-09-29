package com.mindtree.client;
import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.service.ServiceImplementation;
import com.mindtree.entity.Report;
import com.mindtree.exceptions.InvalidDateException;
import com.mindtree.entity.Patient;

public class DiagnosticCenterMain {
	
	public static String date="";
	public static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		    ServiceImplementation service = new ServiceImplementation();
			System.out.println("XYZ Diagnostic Centre");
			System.out.println("---------------------");
			System.out.println("1. Add Diagnostic tests");
			System.out.println("2. Generate Report");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			
			switch(choice) {
	       case 1:
				service.AddDiagnosticTests(fetchData());
				break;
			case 2:
				service.GenerateReports(generateResult());
				break;
			case 3:
				break;
			default:
				System.out.println("Enter a valid choice.");
			}
		}catch(Exception e) {System.out.println(e);}
		sc.close();
	}
	public static int fetchData()
	{
		System.out.println("Enter tests details");
		System.out.println("---------------------");
		System.out.println("1. Fetch patient-details by email");
		System.out.println("2. Fetch patient-details by phone");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static int generateResult()
	{
		System.out.println("Generate Reports");
		System.out.println("---------------------");
		System.out.println("1. Fetch patient-details by email");
		System.out.println("2. Fetch patient-details by phone");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		return choice;
	}

	public static void printReport(Patient p,ArrayList<Report> report)
	{
		int totalCost=0;
		System.out.println("Output:");
		System.out.println("Name: "+p.getName());
		System.out.println("Email: "+p.getEmail());
		System.out.println("Phone: "+p.getPhone());
		System.out.println("Date: "+date);
		System.out.println("Test Details: ");
		System.out.println("\tTest\tCost");
		for(int i=0;i<report.size();i++)
		{
			totalCost+=report.get(i).getCost();
			System.out.println("\t"+report.get(i).getName()+"\t"+report.get(i).getCost());
		}
		System.out.println("\tTotal\t"+totalCost);
	}

	public static String enterDate() throws InvalidDateException
	{
		System.out.println("Enter Test Date [YYYY-MM-DD]: ");
		date=sc.next();
		if(!date.matches("\\d{4}-\\d{2}-\\d{2}"))
		{
			throw new InvalidDateException();
		}
		return date;
	}  

	public static String enterEmail()
	{
		System.out.println("Enter E-Mail: ");
		String email=sc.next();
		return email;
	}

	public static long enterNumber()
	{
		System.out.println("Enter Phone: ");
		long pNumber=sc.nextLong();
		return pNumber;
	}
	public static String enterTestName()
	{
		System.out.println("Enter Test Name: ");
		String tName=sc.next();
		return tName;
	}
	public static String status()
	{
		System.out.println("Want to add more Tests[YES/NO]: ");
		String tName=sc.next();
		return tName;
	}

	public static void successMessage()
	{
		System.out.println("Test Details are successfully saved!!");
	

			
	}

}
