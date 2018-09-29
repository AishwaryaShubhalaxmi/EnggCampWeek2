package com.mindtree.dao;

import java.util.ArrayList;


import com.mindtree.entity.Patient;
import com.mindtree.entity.Report;
import com.mindtree.entity.Test;

public interface DiagnosticDao 
{
	Patient fetchByEmail(String email);
	Patient fetchByPhone(Long pNumber);
	Test fetchByTest(String tName);
	void putPatientTests(int pId,int tId);
	ArrayList<Report> fetchCost(int pId,String date);
}

