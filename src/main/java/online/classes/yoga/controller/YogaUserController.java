package online.classes.yoga.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import online.classes.yoga.entity.YogaUser;
import online.classes.yoga.service.YogaUserService;

@RestController

public class YogaUserController {

	@Autowired
	
	private YogaUserService yogaUserService;

	@PostMapping("/registerUser")
	public ResponseEntity<YogaUser> saveUser(@RequestBody @Valid YogaUser yogaUser) {
		System.out.println(yogaUser);
		YogaUser userSave = yogaUserService.saveUser(yogaUser);
		return ResponseEntity.status(HttpStatus.CREATED).body(userSave);
	}

}
