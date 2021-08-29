package com.azuresql.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureSqlApplication {

	@Autowired
	private EmplyeeRepo emplyeeRepo;
	
	@PostMapping("/save_employee")
	public Emplyeeobj addEmployee(@RequestBody Emplyeeobj emplyeeobj) {
		return emplyeeRepo.save(emplyeeobj);
	}
	
	@PutMapping("/update_employee")
	public Emplyeeobj updateEmployee(@RequestBody Emplyeeobj emplyeeobj) {
		return emplyeeRepo.save(emplyeeobj);
	}
	
	@GetMapping("/getemployees")
	public List<Emplyeeobj> getEmplyess() {
		return emplyeeRepo.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureSqlApplication.class, args);
	}

}
