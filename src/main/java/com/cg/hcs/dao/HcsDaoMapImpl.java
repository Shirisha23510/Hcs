package com.cg.hcs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.cg.hcs.bean.Appointment;
import com.cg.hcs.bean.DiagnosticCenter;
import com.cg.hcs.bean.Test;
import com.cg.hcs.bean.User;
import com.cg.hcs.exception.HealthException;

public class HcsDaoMapImpl implements HcsDao
{
	private Map<String,Test>map;
	HashMap<String,DiagnosticCenter> centerMap;
	ArrayList<Test> listOfTests= new ArrayList<Test>();
	public HcsDaoMapImpl()
	{
		centerMap=new HashMap<String,DiagnosticCenter>();
		
	}
	public int addCenter(DiagnosticCenter diagnosticCenter) throws HealthException
	{
		
		Test bloodpressure=new Test();
		bloodpressure.setTestId("45");
		bloodpressure.setTestName("blood pressure");
		Test bloodsugar=new Test();
		bloodsugar.setTestId("46");
		bloodsugar.setTestName("blood sugar");
		Test bloodgroup=new Test();
		bloodgroup.setTestId("47");
		bloodgroup.setTestName("blood group");
		listOfTests.add(bloodpressure);
		listOfTests.add(bloodsugar);
		listOfTests.add(bloodgroup);
		diagnosticCenter.setListOfTests(listOfTests);
		centerMap.put(diagnosticCenter.getCenterId(),diagnosticCenter);
		return 0;
		}
	public boolean removeCenter(DiagnosticCenter diagnosticCenter) throws HealthException {


		
		
		
		
		return false;
	}

	public String addTest(Test test) throws HealthException {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeTest(Test test) throws HealthException {
		
		return null;
	}

	public boolean approveAppointment(Appointment appointment) throws HealthException {
		
		return false;
	}

	public String makeAppointment(Appointment appointment) throws HealthException {
	
		return null;
	}

	public String register(User user) throws HealthException {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


