package com.cg.hcs.dao;

import com.cg.hcs.bean.Appointment;
import com.cg.hcs.bean.DiagnosticCenter;
import com.cg.hcs.bean.Test;
import com.cg.hcs.bean.User;
import com.cg.hcs.exception.HealthException;

public interface HcsDao {
	
	
	
	public int addCenter (DiagnosticCenter  DiagnosticCenter) throws HealthException;
	public boolean removeCenter(DiagnosticCenter DiagnosticCenter)throws HealthException;
	public String addTest(Test test) throws HealthException;
	public String removeTest(Test test) throws HealthException;
	public boolean approveAppointment(Appointment appointment) throws HealthException;
	public String makeAppointment(Appointment appointment)throws HealthException;
	public String register(User user) throws HealthException;

}
