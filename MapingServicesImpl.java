package com.maping.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maping.entity.Maping;
import com.maping.repository.MapingRepository;
@Service
public class MapingServicesImpl implements MapingServices {
	@Autowired
	private  MapingRepository mapingRepo;

	@Override
	public void saveHemanth(Maping abc) {
		 mapingRepo.save(abc);

	}

	
	
}
