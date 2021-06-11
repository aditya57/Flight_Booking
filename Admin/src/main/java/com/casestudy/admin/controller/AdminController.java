package com.casestudy.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.admin.model.AdminModel;
import com.casestudy.admin.service.AdminService;

@RestController
@RequestMapping("/flights")
public class AdminController {
	
	
	@Autowired
	private AdminService adminservice;
	
	@PostMapping("/addFlight")
	public String saveFlight(@RequestBody AdminModel flight) {
		
		return adminservice.saveFlight(flight)	;
	}
	
	
	@GetMapping("/findFlight/{flight_no}")
	public Optional<AdminModel> getFlight(@PathVariable String flight_no){
		return adminservice.getFlightById(flight_no);
	}
	@GetMapping("/findAllFlight")
	public List<AdminModel> getFlights(){
		return adminservice.getAllFlight();
	}
	
	
	@DeleteMapping("/delete/{flight_no}")
	public String deleteFlight(@PathVariable String flight_no) {
		
		return adminservice.deleteFlight(flight_no);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
