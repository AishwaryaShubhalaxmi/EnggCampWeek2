package com.mindtree.service;
import com.mindtree.client.DiagnosticCenterMain;
import com.mindtree.dao.DiagnosticDaoImplementations;
import com.mindtree.entity.Patient;
import com.mindtree.entity.Report;
import com.mindtree.entity.Test;

import java.util.*;

public class ServiceImplementation implements DiagnosticService 
{
	Scanner sc=new Scanner(System.in);
	public void AddDiagnosticTests(int choice) 
	{
		DiagnosticDaoImplementations obj=new DiagnosticDaoImplementations();

		switch(choice)
		{
		case 1:
			addTests(obj.fetchByEmail(DiagnosticCenterMain.enterEmail()));
			break;
		case 2:
			addTests(obj.fetchByPhone(DiagnosticCenterMain.enterNumber()));
			break;
		}

	}
	@Override
	public void GenerateReports(int choice) 
	{
		ArrayList<Report> r=new ArrayList<Report>();
		DiagnosticDaoImplementations obj=new DiagnosticDaoImplementations();

		switch(choice)
		{
		case 1:
			Patient p1=obj.fetchByEmail(DiagnosticCenterMain.enterEmail());
			r=getReports(p1);
			DiagnosticCenterMain.printReport(p1,r);
			break;
		case 2:
			Patient p2=obj.fetchByPhone(DiagnosticCenterMain.enterNumber());
			r=getReports(p2);
			DiagnosticCenterMain.printReport(p2,r);
			break;
		}

	}

	public void addTests(Patient p)
	{
		ArrayList<Test> arr=new ArrayList<Test>();
		Test t;
		DiagnosticDaoImplementations obj=new DiagnosticDaoImplementations();
		String exit="YES";
		while(exit.equalsIgnoreCase("YES"))
		{
			t=obj.fetchByTest(DiagnosticCenterMain.enterTestName());
			arr.add(t);
			exit=DiagnosticCenterMain.status();
		}
		for(int i=0;i<arr.size();i++)
		{
			Test temp=arr.get(i);
			//System.out.println(temp.gettId()+"  "+p.getpId());
			obj.putPatientTests(p.getpId(),temp.gettId());
		}
		DiagnosticCenterMain.successMessage();
	}

	public ArrayList<Report> getReports(Patient p)
	{
		ArrayList<Report> report=new ArrayList<Report>();

		DiagnosticDaoImplementations obj=new DiagnosticDaoImplementations();

		System.out.println("Enter Test Date [YYYY-MM-DD]: ");
		String date=sc.next();
		try{
			report=obj.fetchCost(p.getpId(),DiagnosticCenterMain.enterDate());
		}catch(Exception e){System.out.println(e);}
		return report;
	}
	
	
	
	public void addTestsPhone(Patient p)
	{
		ArrayList<Test> arr=new ArrayList<Test>();
		Test t;
		DiagnosticDaoImplementations obj=new DiagnosticDaoImplementations();
		String exit="YES";
		while(exit.equalsIgnoreCase("YES"))
		{
			t=obj.fetchByTest(DiagnosticCenterMain.enterTestName());
			arr.add(t);
			exit=DiagnosticCenterMain.status();
		}
		for(int i=0;i<arr.size();i++)
		{
			Test temp=arr.get(i);
		
			obj.putPatientTests(p.getpId(),temp.gettId());
		}
		DiagnosticCenterMain.successMessage();
	}

}




