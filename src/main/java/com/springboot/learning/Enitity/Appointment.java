package com.springboot.learning.Enitity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="APPOINTMENT_TABLE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long appointmentNo;
	
	private Date date;
	
	private Long doctorNo;
	
	private Long patientNo;

	public Long getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(Long appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getDoctorNo() {
		return doctorNo;
	}

	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}

	public Long getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(Long patientNo) {
		this.patientNo = patientNo;
	}

	public Appointment(Long appointmentNo, Date date, Long doctorNo, Long patientNo) {
		super();
		this.appointmentNo = appointmentNo;
		this.date = date;
		this.doctorNo = doctorNo;
		this.patientNo = patientNo;
	}
	
	
	public Appointment() {
		
	}

}
