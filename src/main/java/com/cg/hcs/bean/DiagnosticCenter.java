package com.cg.hcs.bean;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenter {
	private String centerId;
	private String centerName;
	private List<Test> listOfTests;
	private List<Appointment> appointmentList;
	public DiagnosticCenter(String centerId, String centerName, List<Test> listOfTests,
			List<Appointment> appointmentList) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.listOfTests = listOfTests;
		this.appointmentList = appointmentList;
	}
	public DiagnosticCenter() {
		super();
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public List<Test> getListOfTests() {
		return listOfTests;
	}
	public void setListOfTests( List<Test>listOfTests) {
		this.listOfTests = listOfTests;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
}
