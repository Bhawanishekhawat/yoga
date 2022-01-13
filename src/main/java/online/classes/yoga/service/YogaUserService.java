package online.classes.yoga.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.classes.yoga.entity.YogaUser;
import online.classes.yoga.repository.YogaUserRepo;

@Service
public class YogaUserService {
	
	@Autowired
	private YogaUserRepo yogaUserRepo;

	public YogaUser saveUser(@Valid YogaUser yogaUser) {
		
		return yogaUserRepo.save(yogaUser);
		
		
		
	}

}
