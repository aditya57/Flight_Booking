package com.casestudy.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.admin.model.AdminModel;
import com.casestudy.admin.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	
	public String saveFlight(AdminModel flight) {
	repo.save(flight);
	return "Added passenger with id :" + flight.getId();

}
	public List<AdminModel> getAllFlight(){
    	return repo.findAll();
    	
	}
	
	
	public Optional<AdminModel> getFlightById(String Flight_no){
    	
    	return repo.findById(Flight_no);
    }
	
	public String deleteFlight(String Flight_no) {
    	repo.deleteById(Flight_no);
		return "Flight deleted wwith id:" +Flight_no;
    }
    
	
	
	
	
	
	
	
	
}
