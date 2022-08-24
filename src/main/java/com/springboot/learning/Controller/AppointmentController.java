package com.springboot.learning.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.Dto.AppointmentRequest;
import com.springboot.learning.Service.AppointmentService;

@RestController
@RequestMapping("/api/v1")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody AppointmentRequest appointmentRequest) {
		
		return appointmentService.bookAppointment(appointmentRequest);
		
	}

}
