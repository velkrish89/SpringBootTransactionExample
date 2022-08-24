package com.springboot.learning.Service;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.learning.Dto.AppointmentRequest;
import com.springboot.learning.Enitity.Appointment;
import com.springboot.learning.Enitity.Patient;
import com.springboot.learning.Repository.AppointmentRepository;
import com.springboot.learning.Repository.PatientRepository;

@Service
@Transactional
public class AppointmentService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	Logger logger = LoggerFactory.getLogger(AppointmentService.class);
	
	public String bookAppointment(AppointmentRequest appointmentRequest) {
		
			Patient patient = new ObjectMapper().convertValue(appointmentRequest, Patient.class);
			Long patientNo = patientRepository.save(patient).getPatientId();
			logger.info("--------------------Patient data saved--------------------");
			
			System.out.println(10/0);
			
			Appointment appointment = new Appointment();
			appointment.setDate(new Date(System.currentTimeMillis()));
			appointment.setDoctorNo(101l);
			appointment.setPatientNo(patientNo);
			
			Long appointmentNo = appointmentRepository.save(appointment).getAppointmentNo();
			
			return "Appointment booked successfully! Appoint number - "+appointmentNo;
		}

}
