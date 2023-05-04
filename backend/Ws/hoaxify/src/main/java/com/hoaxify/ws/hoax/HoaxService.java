package com.hoaxify.ws.hoax;



import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class HoaxService {
	
	HoaxRepository hoaxRepository;

	public HoaxService(HoaxRepository hoaxRepository) {
		this.hoaxRepository = hoaxRepository;
	}

	public void save(Hoax hoax) {
		hoax.setTimeStamp(new Date());
		hoaxRepository.save(hoax);
		
	}
	
	
	
}