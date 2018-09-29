package com.mindtree.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.mindtree.entity.Patient;
import com.mindtree.entity.Report;
import com.mindtree.entity.Test;
import com.mindtree.util.Utility;

public  class DiagnosticDaoImplementations implements DiagnosticDao {

	public Patient fetchByEmail(String email) {
		Patient p = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select * from patient where email='" + email + "'";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next())
				p = new Patient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		} catch (Exception e) {
			System.out.println(e);
		}
		return p;

	}

	public Patient fetchByPhone(Long pNumber) {
		Patient p = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select * from patient where phone=?;";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setLong(1, pNumber);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next())
				p = new Patient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		} catch (Exception e) {
			System.out.println(e);
		}
		return p;

	}

	@Override
	public Test fetchByTest(String tName) {
		Test t = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select * from test where name=?;";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, tName);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next())
				t = new Test(rs.getInt(1), rs.getString(2), rs.getInt(3));
		} catch (Exception e) {
			System.out.println(e);
		}
		return t;
	}

	@Override
	public void putPatientTests(int pId, int tId) {
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();
			String query = " insert into patient_test(P_ID,T_ID,DATE)" + " values (?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, pId);
			preparedStmt.setInt(2, tId);
			preparedStmt.setString(3, LocalDate.now().toString().trim());

			preparedStmt.execute();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public ArrayList<Report> fetchCost(int pId, String date) {
		ArrayList<Report> r = new ArrayList<Report>();
		Report report = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select test.name,test.cost from test inner join patient_test on test.t_id = patient_test.t_id where patient_test.date='"
					+ date + "' and patient_test.p_id=" + pId;

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				report = new Report(rs.getString(1), rs.getInt(2));
				r.add(report);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return r;
	}
}
