package com.cg.hcs.service;

import java.util.Random;

import com.cg.hcs.bean.Appointment;
import com.cg.hcs.bean.DiagnosticCenter;
import com.cg.hcs.bean.Test;
import com.cg.hcs.bean.User;
import com.cg.hcs.dao.HcsDao;
import com.cg.hcs.dao.HcsDaoMapImpl;
import com.cg.hcs.exception.HealthException;

public class HcsServiceImpl implements HcsService {
 private HcsDao hcsDao;
 public HcsServiceImpl()
 {
	 hcsDao=new HcsDaoMapImpl();
 }
	public boolean validateName(String UserName) {
		
		
		return false;
	}

	public boolean validatepassword(String password) {
	
		
		
		
		
		
		return false;
	}

	public boolean validatecontactnumber(int contactnumber) {
		
		
		
		
		
		
		
		
		
		return false;
	}

	public int addCenter(DiagnosticCenter diagnosticCenter) throws HealthException {
		
		String name= diagnosticCenter.getCenterName();
		boolean flag=validateName(name);
		if(!flag)
		{
			throw new HealthException("Name should be contain characters");
		}
		Random random=new Random();
		int id =random.nextInt(100)+1000;
		diagnosticCenter.setCenterId(id);
		id=hcsDao.addCenter(diagnosticCenter);
	   return id;
	}
	

	public boolean removeCenter(DiagnosticCenter diagnosticCenter) throws HealthException {
		
		
		
		
		
		
		
		return false;
	}

	public String addTest(Test test) throws HealthException {
	
		
		
		
		
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
		
		return null;
	}

	}
	
	


